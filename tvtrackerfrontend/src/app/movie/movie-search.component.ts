import { Component, OnDestroy, OnInit } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { Subscription, filter } from 'rxjs';
import { MovieSearchService } from './movie-search.service';
import { IMovieSearch, ISearchResult } from './movie-search';

@Component({
  selector: 'app-movie-search',
  templateUrl: './movie-search.component.html',
  styleUrls: ['./movie-search.component.css']
})
export class MovieSearchComponent implements OnInit, OnDestroy {

  private _movieSearch: string = '';
  sub!: Subscription;
  subTest!: Subscription;
  moviesSearchResult !: ISearchResult;
  errorMessage : string = '';
  movies : IMovieSearch[] = [];

  get movieSearch(): string {
    return this._movieSearch;
  }
  set movieSearch(value: string) {
    this._movieSearch = value;
    console.log('Movie search value changed to: ' + value);
  }

  constructor(private movieSearchService : MovieSearchService){ }


  ngOnInit(): void {
    this.sub = this.movieSearchService.getSearchMovieJson().subscribe({
      next: moviesSearchResult => {
        this.moviesSearchResult = moviesSearchResult;
        this.movies = moviesSearchResult.Search;
        console.log(this.movies);
      }
    });
  }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }
}
