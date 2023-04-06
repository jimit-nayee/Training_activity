import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ImgServiceService {
  
  constructor(private http:HttpClient) { }

  getImgByid(id:string){
    return this.http.get(`https://jsonplaceholder.typicode.com/photos/${id}`);
  }
  getAll(){
    return this.http.get(`https://jsonplaceholder.typicode.com/photos`);
  }
}
