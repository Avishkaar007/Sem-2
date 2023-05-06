
//Practise Set 2
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if ((year % 400 != 0) && (year % 100 == 0)) {
            System.out.println("Not a leap year ");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year ");
        }
        sc.close();
    }

}