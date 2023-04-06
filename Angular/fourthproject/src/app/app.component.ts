import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = "fourthproject";

  value1: string | any = '';
  uname: any = '';

  registerfrm = new FormGroup({
    name: new FormControl(''),
    password: new FormControl('', [Validators.required, Validators.minLength(6), Validators.maxLength(12)]),
    email: new FormControl('')
  })
  value: any;
  getData() {
    if (this.registerfrm.status == 'VALID') {
      console.log(this.registerfrm.value);
      this.value1 = this.registerfrm.value;
      this.uname = this.registerfrm.get('name')?.value;
    }
  }
}
