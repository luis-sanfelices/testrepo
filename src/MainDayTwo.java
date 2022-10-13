import java.time.LocalTime;
public class MainDayTwo {
    public static void main(String[] args) {

        // Create a program that based on user age print a message: > 21 -> you can enter,
        // <21 y > 18 you can enter with limited power, < 18 -> you cannot enter. Use both if else and switch
        // System.out.println("Welcome to day two");
        alarm("20:58:30");
        String[] menu = {"pasta","pizza","salad","fruit","meat","fish"};
        printMenu(menu);
        spellWord("word");
        checkAgeWithSwitch(22);
        checkAgeWithSwitch(21);
        checkAgeWithSwitch(20);
    }

    public static void checkAgeWithIf(int age) {
        if (age >= 21) {
            System.out.println("You can enter");
        } else if (age >= 18) {
            System.out.println("You can enter with limited power");
        } else {
            System.out.println("You can not enter");
        }
    }

    public static void checkAgeWithSwitch(int age) {
        int comparedAgeTo21 = Integer.compare(age, 21);
        int comparedAgeTo18 = Integer.compare(age, 18);

        int finalComparision = comparedAgeTo21 + comparedAgeTo18;

        switch (finalComparision) {
            case  2 -> System.out.println("You can enter");
            case  0 -> System.out.println("You can enter with limited power");
            default -> System.out.println("You can not enter");
        }
    }

    public static void alarm(String alarmTimeStr) {
        LocalTime alarmTime;
        try {
            alarmTime = LocalTime.parse(alarmTimeStr);
            System.out.println(LocalTime.now());
            int comparedTimes = LocalTime.now().compareTo(alarmTime);
            if (comparedTimes > 1) {
                while (LocalTime.now().compareTo(alarmTime) < 0) {
                    System.out.println("Todavia no");
                    Thread.sleep(1000);
                }
                System.out.println("Despierta coño!");
            } else {
                System.out.println("Te has dormido!");
            }
        } catch (Exception e) {
            System.err.println("invalid format" + e);
        }

    }
    public static void printMenu(String[] menu) {
        for(String dish:menu) {
            System.out.println(dish);
        }
    }
    public static void spellWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " at position " + i);
        }
        System.out.println(word);
    }
}
