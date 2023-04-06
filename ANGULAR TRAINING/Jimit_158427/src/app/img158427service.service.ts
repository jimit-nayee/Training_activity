import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ImgServiceService {

  constructor(private http:HttpClient) { }

  getImgByName(login:string){
    return this.http.get(`https://api.github.com/users/${login}`);
  }
  getAll(){
    return this.http.get(`https://api.github.com/users`);
  }
}
