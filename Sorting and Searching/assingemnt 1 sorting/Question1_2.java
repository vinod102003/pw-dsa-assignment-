import java.util.Arrays;

public class Question1_2
{

    public static void selectionSort(int arr[])
    {

        for(int i=0 ;i<arr.length-1 ; i++)
        {
            int largest =i;
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[j] > arr[largest])
                {
                    largest = j;
                }
            }
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;


        }





    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};

        selectionSort(arr);
        System.out.println("the descending order of the given array is:");
        System.out.println(Arrays.toString(arr));

    }


}
