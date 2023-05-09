import java.util.Scanner;

// sum of the same number
public class Question1
{
public static int sum(int num)
{
    if(num == 0)
    {
        return 0;
    }else
    {
        return num % 10 + sum(num/10);
    }
}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number");
            int num = sc.nextInt();

            int result = sum(num);
        System.out.println(result);


    }
}
