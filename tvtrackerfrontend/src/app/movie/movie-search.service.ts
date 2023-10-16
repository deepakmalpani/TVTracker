import { Injectable, resolveForwardRef } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, catchError, map, tap } from 'rxjs';
import { IMovieSearch } from './movie-search';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MovieSearchService {

  private searchURI = "api/movies/sample_search.json";

  constructor(private http: HttpClient) { }

  getSearchedMovies() : Observable<IMovieSearch[]> {
    return this.http.get<IMovieSearch[]>(this.searchURI).pipe(
        tap(data => console.log('All: ' + JSON.stringify(data))),
        catchError(this.handleError)
    );
  }

  private handleError(err : HttpErrorResponse){
    let errorMessage = '';
        if(err.error instanceof ErrorEvent){
            errorMessage = `An error occured: ${err.error.message}`;
        } else{
            errorMessage = `Server returned code: ${err.status}, error message is: ${err.message}`;
        }
        console.error(errorMessage);
        return throwError(() => errorMessage);
  }
}
