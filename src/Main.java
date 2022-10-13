import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String fullName = "Luis Sanfelices";
        System.out.println(String.format("Welcome %s", fullName));

        Random randomGenerator = new Random();
        int reservedNumber;
        reservedNumber = randomGenerator.nextInt(0, 100000) + 11;
        System.out.println(String.format("Your reserved number is %s", reservedNumber));

        String goodByeMessage = String.format("Good Bye %s", fullName.toUpperCase().replace(' ', '_'));
        System.out.println(goodByeMessage);
    }
}