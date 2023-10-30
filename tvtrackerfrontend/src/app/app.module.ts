import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MovieSearchComponent } from './movie/movie-search.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AuthModule } from '@auth0/auth0-angular';
import { environment as env } from '../environments/environment';
import { HomeComponent } from './home/home.component';
import { SharedModule } from './shared/shared.module';
import { ProfileComponent } from './profile/profile.component';

@NgModule({
  declarations: [
    AppComponent,
    MovieSearchComponent,
    HomeComponent,
    ProfileComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'movie-search', component: MovieSearchComponent },
      { path: 'profile', component: ProfileComponent},
      { path: '', redirectTo: 'movie-search', pathMatch: 'full' },
      { path: '**', redirectTo: 'movie-search', pathMatch: 'full' }
    ]),
    AuthModule.forRoot({
      ...env.auth,
      authorizationParams: {
        redirect_uri : env.auth.redirectUri
      }
    }),
    SharedModule  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }