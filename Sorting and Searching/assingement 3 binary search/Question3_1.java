import java.util.Scanner;

public class Question3_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you to add :");
        int n = sc.nextInt();

        System.out.println(" Enter the elements of the array");
        int arr[] = new int[n];

        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be found in the array");
        int target = sc.nextInt();

        int flag = -1;

    for(int i=0 ; i<arr.length ; i++)
    {
        if(target == arr[i])
        {
            flag = 1;
            System.out.println("the element is present at the index : "+i);
        }

    }

    if(flag == -1)
    {
        System.out.println("the element is not present in the array");
    }

    }








}
