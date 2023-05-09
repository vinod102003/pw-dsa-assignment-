public class Question4
{
    public static int sumOfNum(int arr[] , int n)
    {
        // if the size of array size 0 than return 0
        if(n == 0)
        {
            return 0;
        }else
        {
            return arr[n-1]+sumOfNum(arr , n-1);
        }
    }
    public static void main(String[] args)
    {

        int arr[] = {92,23,15,-20,10};


        int n = arr.length;

        int result = sumOfNum(arr , n);

        System.out.println("the sum of numbers in a array is:"+result);
    }
}
