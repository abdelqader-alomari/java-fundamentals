package inheritance;

import java.util.LinkedList;

public abstract class PlaceReview {
    private String name;
    private float rate;
    private float priceCategory;

    public PlaceReview(String name) {
        this.name = name;
        this.rate = rate;
        this.priceCategory = priceCategory;
    }
    public String getName(){
        return name;
    }

    public float getRate() {
        return rate;
    }

    public float getPriceCategory() {
        return priceCategory;
    }

    LinkedList<Review> reviews = new LinkedList<>();

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review reviews) {
        this.reviews.add(reviews);
        updateStars();
    }

    public void updateStars() {
        float totalStars = 0;
        for (int i = 0; i < getReviews().size(); i++) {
            totalStars += getReviews().get(i).getStarsNumber();
        }
        totalStars = totalStars / (getReviews().size());
        this.rate = totalStars;
    }

    }