package inheritance;

import java.util.ArrayList;

public class Theater extends PlaceReview {
    private ArrayList<String> movies = new ArrayList<>();

    public Theater(String name){
        super(name);
    }

    public ArrayList<String> getMovies() {
        return movies;
    }
    public void addMovie(String movieName){
        boolean notShown = true;
        for(int i =0; i<movies.size();i++){
            if(movies.get(i).contains(movieName)){
                System.out.println("Movie is already shown");
                notShown = false;
                break;
            }
        }
        if(notShown){
            movies.add(movieName);
        }
    }
    public void removeMovie(String movieName) {
        movies.remove(movieName);
    }

    public void addMovieWithReview(String Author , String body, String rate , String movieName) {
        String newReview = "{Author: " + Author + ", body: " + body  + ", Rate: " + rate+  ", Watched movie: " + movieName + "}";
        if (getReviews().isEmpty()) {
            getRate();
            getReviews().add(newReview);
        } else {
            boolean NotExist = true;
            for (int i = 0; i < getReviews().size(); i++) {
                String current = getReviews().get(i);
                if (current.contains(Author)){
                    System.out.println("You have already added");
                    NotExist = false;
                    break;
                }
            }
            if (NotExist) {
                getRate();
                getReviews().add(newReview);
            }
        }
    }

    @Override
    public String toString() {
        if (getReviews().isEmpty()) {
            return "Theater Name: " + getName() + ", Rate: " + getRate() + ", Today's Movies: " + movies + ", Review: No review added.";
        } else {
            return "Theater Name: " + getName() + ", Rate: " + getRate() + ", Today's Movies: " + movies +  ", Review: " + getReviews();
        }

    }

}
