package inheritance;


public class Restaurant extends PlaceReview {

    public Restaurant(String name,String rate, String priceCategory) {
        super(name);
    }
@Override
    public String toString() {
        return "Restaurant Name: " + getName() + " Rate: " + getRate() + " Price Category: " + getPriceCategory() + "$";
    }
}
