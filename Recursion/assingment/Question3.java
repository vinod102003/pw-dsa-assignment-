public class Question3
{
public static int maxElement(int arr[])
{
    int max = arr[0];

    for(int i=1 ; i<arr.length-1 ; i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }


    return max;

}


public static void main(String[] args)
{

int arr[] = {13,1,-3,22,5};

    int result = maxElement(arr);
    System.out.println("the max element is :"+result);


}



}
