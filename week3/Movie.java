class Movie {
    String title;
    String genre;
    double rating;

    void displayMovie() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Inception";
        movie.genre = "Science Fiction";
        movie.rating = 8.8;

        movie.displayMovie();
    }
}
