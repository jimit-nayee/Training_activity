import { Component } from '@angular/core';
import { ImgServiceService } from '../img-service.service';

@Component({
  selector: 'app-img-component',
  templateUrl: './img-component.component.html',
  styleUrls: ['./img-component.component.css']
})
export class ImgComponentComponent {
  images:any
  id:any;
  constructor(private img_service:ImgServiceService){

  }
  onSubmit(){
    this.img_service.getImgByid(this.id).subscribe(data=>this.images=[data]);
  }
  showAll()
  {
    this.img_service.getAll().subscribe(data=>this.images=data);
  }
}
