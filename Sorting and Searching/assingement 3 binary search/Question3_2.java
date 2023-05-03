import java.util.Scanner;

public class Question3_2
{
    public static int firstOccurrence(int arr[] , int target)
    {
        int low = 0;
        int high = arr.length-1;

        int result = -1;

        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid]  == target)
            {
                result = mid;
                low = mid + 1;
            }else if(arr[mid] < target)
            {
                low = mid + 1;
            }else
            {
                high = mid - 1;
            }
        }
        return  result;





    }
    public static void main(String[] args)
    {
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



                int result = firstOccurrence(arr , target);

                if(result==-1)
                {
                    System.out.println("the element is not found");
                }else
                {
                    System.out.println("the first occurrence of the is at the index :"+result);
                }







    }

}
