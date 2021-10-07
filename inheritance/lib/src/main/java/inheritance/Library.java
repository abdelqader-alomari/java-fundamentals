/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

        Restaurant burgerRestaurant = new Restaurant("Mcdonald's", 2, 2);

        Shop newShop = new Shop("Max", 4, 2, "There are a lot of nice collections");

        Theater newTheater = new Theater("Taj Cinema", 4.5, 2);

        newTheater.addMovie("Mission Impossible");
        newTheater.addMovie("Mission Impossible");
        newTheater.addMovie("Mission ImpossibleII");
        newTheater.addMovie("Titanic");
        newTheater.addMovie("Mission ImpossibleIII");
        newTheater.removeMovie("Mission ImpossibleII");

        Review review1 = new Review("Abdelqader", 4, "Good");
        Review review2 = new Review("Jack", 5, "Perfect");
        Review review3 = new Review("Sally", 2, "not delicious as expected");

        Review review4 = new Review("Abdelqader", 4, "Nice");
        Review review5 = new Review("Sam", 3, "Not bad");
        Review review6 = new Review("Suzie", 2, "Super!");

        Review review7 = new Review("Abdelqader", 5, "Nice");
        Review review8 = new Review("Mohammad", 4, "Not bad");
        Review review9 = new Review("Salma", 1, "I don't like Action Movies");

        burgerRestaurant.addReview(review1);
        burgerRestaurant.addReview(review2);
        burgerRestaurant.addReview(review3);

        System.out.println(burgerRestaurant.getReviews());

        newShop.addReview(review4);
        newShop.addReview(review5);
        newShop.addReview(review6);

        System.out.println(newShop.getReviews());

        newTheater.addReview(review7);
        newTheater.addReview(review8);
        newTheater.addReview(review9);

        System.out.println(newTheater.getReviews());

        System.out.println(burgerRestaurant);
        System.out.println(newShop);
        System.out.println(newTheater);
        System.out.println(newTheater.getMovies());
    }

}
