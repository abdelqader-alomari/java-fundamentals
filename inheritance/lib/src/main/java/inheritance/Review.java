package inheritance;

public class Review {
    private String body;
    private String author;
    private int starsNumber;

    public Review(String author, int starsNumber, String body) {
        this.author = author;

        if (starsNumber >= 5) {
            this.starsNumber = 5;
        } else if (starsNumber < 0) {
            this.starsNumber = 0;
        } else {
            this.starsNumber = starsNumber;
        }
        this.body = body;
    }

    public int getStarsNumber() {
        return starsNumber;
    }

    public String toString(){
        return "Author: " +author+ ", " + "rate: " +starsNumber+ ", " + "notes: " + body;
    }
}
