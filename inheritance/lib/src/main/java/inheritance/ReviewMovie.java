package inheritance;

public class ReviewMovie extends Review {
    private String movie;

    public ReviewMovie(String author, int starsNumber, String body, String movie) {
        super(author, starsNumber, body);
        this.movie = movie;
    }
    public String getMovie() {
        return movie;
    }
}
