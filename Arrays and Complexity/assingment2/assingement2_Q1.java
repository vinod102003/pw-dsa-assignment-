import java.util.Scanner;

public class assingement2_Q1
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

        int positive = 0;
        int negative = 0;
        int oddNumber = 0;
        int evenNumber = 0;
        int zero = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                    if(arr[i][j]>0)
                    {
                        positive++;
                    }if(arr[i][j]<0)
                    {
                        negative++;
                    }
                    if(arr[i][j]==0)
                    {
                        zero++;
                    }if((arr[i][j]%2)==0)
                    {
                        evenNumber++;
                    }if ((arr[i][j]%2)!=0)
                    {
                        oddNumber++;
                    }
            }
        }


        System.out.println(" number of positive numbers are : "+positive);
        System.out.println(" number of negative numbers are : "+negative);
        System.out.println(" number of odd numbers are : "+oddNumber);
        System.out.println(" number of even numbers are : "+evenNumber);
        System.out.println(" number of  zeros are : "+zero);







    }






}
