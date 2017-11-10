import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

class PostItem{
  constructor(
    public title: string,
    public thumbnail: string,
    public url: string
  ){

  }
}

@Injectable()
export class PostService {
  private url = 'https://www.reddit.com/r/androiddev/new/.json?limit=100';
  constructor( private http: Http) { }
  posts: any;
  thumb: string;
  getPosts(){
    //return this.http.get(this.url).map(response => this.posts = response.json().data.children);
    return this.http.get(this.url).map(response => response.json().data.children.map(post => {
      this.thumb =  post.data.thumbnail && post.data.thumbnail!='self' &&  post.data.thumbnail!='default' ?  post.data.thumbnail : "assets/images/Reddit-question-head2-e1354832278826.png";

      return new PostItem(
        post.data.title,
        this.thumb,
        post.data.url
      );
    }));
  }
}
