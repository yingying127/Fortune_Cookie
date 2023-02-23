import java.util.Random;

public class Fortunes {
    //using static in front of String[], because we want to access it through the main methods
    static String[] fortunes = {"Today it's up to you to create the peacefulness you long for.",
            "A friend asks only for your time not your money.",
            "If you refuse to accept anything but the best, you very often get it.",
            "A smile is your passport into the hearts of others.",
            "A good way to keep healthy is to eat more Chinese food.",
            "Your high-minded principles spell success.",
            "Hard work pays off in the future, laziness pays off now.",
            "Change can hurt, but it leads a path to something better.",
            "Enjoy the good luck a companion brings you.",
            "People are naturally attracted to you.",
            "You smell good."};
    public static void main(String[] args) {
        Random rand = new Random();
//        int r = rand.nextInt(6); -> See if the random number is outputting correctly
        int r = rand.nextInt(fortunes.length);
//        System.out.println(fortunes.length); -> Checks the length to see if it is correct
//        System.out.println(fortunes[1]); -> Checks if the fortune arr is correct
//        System.out.println(r); -> Checks if the random number is working
        System.out.println(fortunes[r]);
    }
}
