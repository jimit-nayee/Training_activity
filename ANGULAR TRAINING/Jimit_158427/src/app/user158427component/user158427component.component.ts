import { Component } from '@angular/core';
import { ImgServiceService } from '../img158427service.service';

@Component({
  selector: 'app-user158427component',
  templateUrl: './user158427component.component.html',
  styleUrls: ['./user158427component.component.css']
})
export class User158427componentComponent {

  login:any
  id:any
  images:any
  
  constructor(private img_service:ImgServiceService){}

  onSubmit(){
    this.img_service.getImgByName(this.login).subscribe(data=>this.images=[data]);
  }
  showAll(){
    this.img_service.getAll().subscribe(data=>this.images=data);
  }
}
