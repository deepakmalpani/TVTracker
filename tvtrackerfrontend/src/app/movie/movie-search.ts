export interface IMovieSearch {
    Title: string;
    Year: number;
    imdbID: string;
    Type: string;
    Poster: string;
}

export interface ISearchResult {
    Search: IMovieSearch[],
    totalResults: string,
    Response: string
}