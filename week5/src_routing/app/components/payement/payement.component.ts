import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-payement',
  templateUrl: './payement.component.html',
  styleUrls: ['./payement.component.css']
})
export class PayementComponent {


  billAmount:number=0;

  constructor( private route:ActivatedRoute)
  {
    route.params.subscribe( 
      (inputs)=>{  this.billAmount = inputs['amount']} 
      );
  }

}
