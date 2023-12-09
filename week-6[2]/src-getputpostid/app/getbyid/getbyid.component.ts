import { Component } from '@angular/core';
import { Employee } from '../employee/employee';
import { EmployeeService } from '../employee/employee.service';

@Component({
  selector: 'app-getbyid',
  templateUrl: './getbyid.component.html',
  styleUrls: ['./getbyid.component.css']
})
export class GetbyidComponent {
  constructor(private service:EmployeeService){}


  getByIdFormData(data:Employee){

    console.log('getting data for emp : '+data.ename)

    this.service.get(data).subscribe( (emp: string) => {console.log('emp updated '+emp)})

       
}

}
