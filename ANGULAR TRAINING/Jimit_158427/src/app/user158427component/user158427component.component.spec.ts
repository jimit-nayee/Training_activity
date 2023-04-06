import { ComponentFixture, TestBed } from '@angular/core/testing';

import { User158427componentComponent } from './user158427component.component';

describe('User158427componentComponent', () => {
  let component: User158427componentComponent;
  let fixture: ComponentFixture<User158427componentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ User158427componentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(User158427componentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
