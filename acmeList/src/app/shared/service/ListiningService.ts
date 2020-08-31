import { Injectable } from '@angular/core';
import {HttpHeaders, HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ListinigService {

  apirUrl = 'http://localhost:8080/api/schedule';
  httpOptions = {
    headers: new HttpHeaders ({
        'Content-Type': 'application/json'
    })
  }
  constructor(
    private httpClient: HttpClient
  ) { }

  public getListWithFlag(flag: String): Observable<ResponsePageable> {
    return this.httpClient.get<ResponsePageable>(this.apirUrl + '?flag' + flag );
  }
}
