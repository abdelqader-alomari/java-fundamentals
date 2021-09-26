import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        pluralize ("cat",2);
        flipNHeads(4);
        clock();
    }
    public static void pluralize(String word,int number){
        if (number==1){
            System.out.println("I own " + number + " " + word + ".");
        }else{
            System.out.println("I own " + number + " " + word + "s" + ".");
        }
    }
    public static void flipNHeads(int flips){
        int count = 0;
        for (int i =0; i<flips; i++){
            double random = Math.random();
            if (random>=0.5){
                System.out.println("heads");
                count++ ;
            }else{
                System.out.println("tails");
            }
        }
        System.out.println("It took "+flips+" flips to flip "+count+" head in a row." );
    }
    public static void clock(){
        while(1<2){
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
        }
    }
}

