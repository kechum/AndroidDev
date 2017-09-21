import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { PostsComponent } from './auth/posts/posts.component';
import { PostService } from './services/post.service';
import { HeaderComponent } from './auth/header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    PostsComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    HttpModule
  ],
  providers: [
    PostService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
