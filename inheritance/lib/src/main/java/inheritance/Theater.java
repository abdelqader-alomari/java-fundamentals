package inheritance;

import java.util.ArrayList;

public class Theater extends PlaceReview {
    private ArrayList<String> movies = new ArrayList<String>();

    public Theater(String name, double rate, int priceCategory){
        super(name, rate, priceCategory);
    }

    public ArrayList getMovies() {
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


    @Override
    public String toString() {
        if (getReviews().isEmpty()) {
            return "Theater Name: " + getName() + ", Rate: " + getRate() + ", Today's Movies: " + movies + ", Review: No review added.";
        } else {
            return "Theater Name: " + getName() + ", Rate: " + getRate() + ", Today's Movies: " + movies +  ", Review: " + getReviews();
        }

    }

}
