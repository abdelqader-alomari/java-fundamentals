package inheritance;

public class Shop extends PlaceReview{
    private String description;

    public Shop(String name, double rate, int priceCategory, String description){
        super(name, rate, priceCategory);
        this.description =description;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description = description;
    }

    @Override
    public String toString() {
        if (getReviews().isEmpty()) {
            return "Shop Name: " + getName() + " Rate: " + getRate() + " Price Category: " + getPriceCategory() + "$" + " Description: " + getDescription() + ", Review: No review added.";

        } else {

            return "Shop Name: " + getName() + " Rate: " + getRate() + " Price Category: " + getPriceCategory() + "$" + " Description: " + getDescription() + getReviews();
        }
    }

}
