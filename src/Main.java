import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String fullName = "Darren Heath";

        int reservationNumber = new Random().nextInt(10) + 11;

        System.out.println("Hello" + fullName);

        System.out.println("The reservation number is" + reservationNumber);

        char underscore = '_';

        String editedNameA = fullName.replace(' ', underscore);

        String editedNameB = editedNameA.toUpperCase();

        System.out.println("Goodbye" + editedNameB);
    }
}