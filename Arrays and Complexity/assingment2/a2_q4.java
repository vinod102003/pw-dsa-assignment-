import java.util.Scanner;

public class a2_q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m =sc.nextInt();
        System.out.println("Enter the number of columns");
        int n =sc.nextInt();

        System.out.println(" Enter the elements in array");
        int arr[][]= new int[m][n];


        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int highest = arr[0][0];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(highest<arr[i][j])
               {
                   highest=arr[i][j];
               }
            }
        }


        System.out.println(" the highest number in the array is :"+highest);

    }

}
