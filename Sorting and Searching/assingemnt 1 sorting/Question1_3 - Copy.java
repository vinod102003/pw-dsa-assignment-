import java.util.*;
public class Question1_3
{
    public static void insertionSort(int arr[])
    {
        for(int i=1 ; i<arr.length ; i++)
        {
            int j=i;
            while(j>0  &&  arr[j]>arr[j-1] )
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }



        }
    }
    public static void main(String[] args)
    {

        int arr[] = {3,5,1,6,0};

        insertionSort(arr);

        System.out.println(" the sorted array in the descending order is:");
        System.out.println(Arrays.toString(arr));
    }

}
