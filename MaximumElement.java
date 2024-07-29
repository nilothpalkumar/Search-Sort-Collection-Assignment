package LinearSearch;

public class MaximumElement
{

    public static void main(String args[])
    {
        int[] a1= {10,50,90,23,76,85};
        System.out.println("Maximum number is: "+findMaximum(a1, a1.length));
    }

    public static int findMaximum(int[] arr, int arrayLength)
    {
        int maxNumber = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxNumber)
            {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

}