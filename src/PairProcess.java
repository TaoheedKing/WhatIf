import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2, sum;
        int average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        average = (num1 + num2)/2;
        System.out.println("The average of the two numbers is: " + average);
        if (sum > 200 && sum < 1000) {
            System.out.println("The sum is: " + sum + "*~");
        } else {
            System.out.println("The sum is: " + sum);
        }
    }
}