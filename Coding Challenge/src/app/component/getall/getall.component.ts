import { Component } from '@angular/core';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-getall',
  templateUrl: './getall.component.html',
  styleUrls: ['./getall.component.css']
})
export class GetallComponent {

  playerList:Player[] = [];
  
  constructor(private playerService:PlayerService){}

getAll(){
    this.playerService.getAll().subscribe( 
                              (list)=>{ this.playerList = list;  console.log(list)}         
                                );      
}

deleteByName(countryName:string)
{
    this.playerService.delete(countryName).subscribe( (msg)=>{ console.log("Deleted ");})
}


}
