import java.util.Scanner;

// print even elements
public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n=sc.nextInt();

        System.out.println("Enter the  elements of the array");
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(" even elements in array are :"+arr[i]);
            }
        }



    }



}
