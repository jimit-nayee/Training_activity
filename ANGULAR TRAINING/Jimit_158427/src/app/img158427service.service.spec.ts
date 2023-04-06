import { TestBed } from '@angular/core/testing';

import { Img158427serviceService } from './img158427service.service';

describe('Img158427serviceService', () => {
  let service: Img158427serviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Img158427serviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
