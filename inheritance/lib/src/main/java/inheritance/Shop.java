package inheritance;

public class Shop extends PlaceReview{
    private String description;

    public Shop (String name, String description){
        super(name);
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
        return "Restaurant Name: " + getName() + " Rate: " + getRate() + " Price Category: " + getPriceCategory() + " Description: " + getDescription() + "$";
    }

}
