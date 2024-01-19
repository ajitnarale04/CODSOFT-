import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your roll number ");
        int roll = sc.nextInt();

        System.out.println("enter your physics marks");
        int phy = sc.nextInt();
        System.out.println("enter your chemisty marks");
        int chem = sc.nextInt();
        System.out.println("enter your biology marks");
        int bio = sc.nextInt();
        System.out.println("enter your maths  marks");
        int math = sc.nextInt();
        System.out.println("enter your history marks");
        int his = sc.nextInt();

        int total = phy + chem + bio + math + his;
        System.out.println("the total  is" + total + ":");
        int avrage = total / 5;

        System.out.println("avrage is" + avrage + "%");

        if (avrage > 85) {
            System.out.println("the gread is A");
        } else if (avrage > 70) {
            System.out.println("the gread is B");
        } else if (avrage > 55) {
            System.out.println("the gread is C");
        } else if (avrage > 40) {
            System.out.println("the gread is D");
        } else if (avrage > 35) {
            System.out.println("the gread is E");
        } else {
            System.out.println("you are fail");
        }

    }

}