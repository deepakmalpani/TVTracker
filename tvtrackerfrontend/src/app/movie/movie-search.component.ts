import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-movie-search',
  templateUrl: './movie-search.component.html',
  styleUrls: ['./movie-search.component.css']
})
export class MovieSearchComponent {

  private _movieSearch: string = '';

  get movieSearch(): string {
    return this._movieSearch;
  }
  set movieSearch(value: string) {
    this._movieSearch = value;
    console.log('Movie search value changed to: ' + value);
  }
}
