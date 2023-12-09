import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-addplayer',
  templateUrl: './addplayer.component.html',
  styleUrls: ['./addplayer.component.css']
})
export class AddplayerComponent {
  constructor(private playerService:PlayerService){}
  
  addPlayer(data:Player)
  {
    this.playerService.add(data)
    .subscribe(
      (player)=>{console.log('Added Player is: '+player);}
      );

  }

}
