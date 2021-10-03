package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Restaurant {
    private String name;
    private float rate;
    private float priceCategory;

    public Restaurant(String name, float rate, float priceCategory) {
        this.name = name;
        this.rate = rate;
        this.priceCategory=priceCategory;
    }

     LinkedList<Review> reviews = new LinkedList<>();
    public LinkedList<Review> getReviews(){
        return reviews;
    }

    public void addReview(Review reviews){
        this.reviews.add(reviews);
        updateStars();
    }

    public void updateStars() {
         float totalStars=0;
        for(int i=0; i< getReviews().size();i++){
            totalStars+= getReviews().get(i).getStarsNumber();
        }
        totalStars = totalStars / (getReviews().size());
        this.rate = totalStars;
    }
        public String toString(){
            return "restaurant name: " +name+ " Stars: " + rate + " Price Category: " + priceCategory + "$";
        }
    }