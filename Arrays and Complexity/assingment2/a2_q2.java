import java.util.Scanner;

public class a2_q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m =sc.nextInt();
        System.out.println("Enter the number of columns");
        int n =sc.nextInt();

        int arr[][]= new int[m][n];

        System.out.println("Enter the matrix elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n-1;i++)
{
    for(int j=0;j<n-1-i;j++)
    {
        System.out.println("the elements above the secondary diagonal are "+arr[i][j]);
    }
}




    }



}
