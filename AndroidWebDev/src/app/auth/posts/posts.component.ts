import { Component, OnInit } from '@angular/core';
import { PostService } from '../../services/post.service';
import { AppError } from "../../common/app-error";

@Component({
  selector: 'posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
  posts: any[];
  errortext;
  constructor(private service: PostService) { }

  ngOnInit() {
    this.service.getPosts()
      .subscribe(posts => this.posts = posts, 
      (error: AppError) => {
        this.errortext = 'Ha ocurrido un error';
      });
  }

}
