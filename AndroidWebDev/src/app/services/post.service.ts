import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class PostService {
  private url = 'https://jsonplaceholder.typicode.com/posts';
  constructor( private http: Http) { }

  getPosts(){
    return this.http.get(this.url).map(response => response.json());
  }

}
