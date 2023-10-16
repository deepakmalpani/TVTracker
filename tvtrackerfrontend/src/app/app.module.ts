import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MovieSearchComponent } from './movie/movie-search.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    MovieSearchComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'movie-search', component: MovieSearchComponent },
      { path: '', redirectTo: 'movie-search', pathMatch: 'full' },
      { path: '**', redirectTo: 'movie-search', pathMatch: 'full' }
    ])  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
