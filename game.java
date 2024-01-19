import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("wellcome to number gessing game ");
        System.out.println("enter the number of round between [1 to 10] you play  only");
        int Round = sc.nextInt();

        for (int i = 1; i <= Round; i++) {
            System.out.println();
            System.out.println("Round " + i + " begins ...\n");

            int randomNumber = rand.nextInt(100) + 1;
            System.out.println("the random number is genreted");

            int count = 0;
            while (count <= 10) {

                System.out.println("enter your gess number " + (10 - count) + ":");
                int number = sc.nextInt();
                count++;
                if (number < randomNumber) {

                    System.out.println("the number is to low");
                } else if (number > randomNumber) {

                    System.out.println("the number is to high");
                }

                else {

                    System.out.println("the number" + number + "is equal to ganreted number");
                    System.out.println("your score to gess the number " + count + ":");
                    break;

                }
            }

        }

    }
}
