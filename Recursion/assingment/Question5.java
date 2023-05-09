import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int n = String.valueOf(num).length();
        sum = calculateSumOfDigits(num, n, sum);
        return num == sum;
    }

    public static int calculateSumOfDigits(int num, int n, int sum) {
        if (num == 0) {
            return sum;
        }
        int rem = num % 10;
        sum += Math.pow(rem, n);
        num /= 10;
        return calculateSumOfDigits(num, n, sum);
    }
}
