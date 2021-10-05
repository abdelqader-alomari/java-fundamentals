package inheritance;


public class Restaurant extends PlaceReview {

    public Restaurant(String name, double rate, int priceCategory) {
        super(name,rate,priceCategory);
    }
@Override
    public String toString() {
    if (getReviews().isEmpty()) {
        return "Restaurant Name: " + getName() + " Rate: " + getRate() + " Price Category: " + getPriceCategory() + "$" + ", Review: No review added.";
    }else{
        return "Restaurant Name: " + getName() + " Rate: " + getRate() + " Price Category: " + getPriceCategory() + "$" + getReviews();
    }
}
}
