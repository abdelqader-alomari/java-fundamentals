package inheritance;

import java.util.LinkedList;

public abstract class PlaceReview {
    private String name;
    private double rate;
    private double priceCategory;

    public PlaceReview(String name, double rate, double priceCategory) {
        this.name = name;
        this.rate = rate;
        this.priceCategory = priceCategory;
    }
    public String getName(){
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getPriceCategory() {
        return priceCategory;
    }

    LinkedList<Review> reviews = new LinkedList<>();

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review reviews) {
        this.reviews.add(reviews);
        updateStars(rate);
    }

    public void updateStars(double rate) {
        double totalStars = 0;
        for (int i = 0; i < getReviews().size(); i++) {
            totalStars += getReviews().get(i).getStarsNumber();
        }
        totalStars = totalStars / (getReviews().size());
        this.rate = totalStars;
    }

    }