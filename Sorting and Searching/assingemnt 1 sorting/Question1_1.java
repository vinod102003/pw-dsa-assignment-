import java.util.Arrays;

public class Question1_1
{
    public static void bubbleSort(int arr[])
    {

        for(int i=0 ; i<arr.length-1; i++)
        {
            for(int j=0 ; j<arr.length-1-i ; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }





    }
    public static void main(String[] args)
    {
        int arr[] = {3,5,1,6,0};

        bubbleSort(arr);
        System.out.println(" the sort array in the descending order is : ");
        System.out.println(Arrays.toString(arr));
    }

}
