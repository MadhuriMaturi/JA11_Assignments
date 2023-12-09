import { Injectable } from '@angular/core';
import { Player } from '../model/Player';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  constructor(private http:HttpClient) { }


  baseURL:string = 'http://localhost:8383/api/players/';
  add(body:Player):Observable<Player>{

    console.log(body);

      return this.http.post<Player>(this.baseURL+"addplayer",body);

  }
  
  getAll():Observable<Player[]>{

      return this.http.get<Player[]>(this.baseURL+"getall");

  }
  delete(countryName:string):Observable<string>{
    console.log(countryName);
    return  this.http.delete<string>(this.baseURL+`deleteby/${countryName}`);

  }

}
