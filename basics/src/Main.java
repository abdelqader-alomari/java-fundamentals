import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        pluralize("dog", 1);
        pluralize("cat", 2);
        pluralize("turtle", 0);
        flipNHeads(2);
        clock();
    }

    public static void pluralize(String word, int number) {
        if (number == 1) {
            System.out.println("I own " + number + " " + word + ".");
        } else {
            System.out.println("I own " + number + " " + word + "s" + ".");
        }
    }

    public static void flipNHeads(int flips) {
        int count = 0;
        int heads = 0;
        while (heads != flips) {
            double random = Math.random();
            if (random >= 0.5) {
                System.out.println("heads");
                heads++;
            } else {
                System.out.println("tails");
                heads = 0;
            }
            count++;
        }
        String flipNum = count == 1 ? "flip" : "flips";
        String headsNum = heads == 1 ? "head" : "heads";
        System.out.println("It took " + count + " " + flipNum + " to flip " + heads + " " + headsNum + " in a row.");
    }

    public static void clock() {

        LocalDateTime now = LocalDateTime.now();
        int preSecond = now.getSecond();
        float counter = 0;

        for (int i = 0; i >= 0; i++) {
            now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            counter++;

            if (second - preSecond == 1) {
                System.out.println(hour + ":" + minute + ":" + second + " " + counter / 1000000 + " MHz");
                preSecond++;
                counter = 0;
            }
        }
    }
}
