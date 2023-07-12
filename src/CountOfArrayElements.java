import java.util.Scanner;
public class CountOfArrayElements
{
    static int countArray(int[] array) {
        int length = array.length;
        int counter = 0;
        int max = Integer.MIN_VALUE;
        for (int iterator = 0; iterator < length; iterator++) {
            if (array[iterator] > max)
                max = array[iterator];

        }
        for (int iterator = 0; iterator < length; iterator++)
        {
            if (array[iterator]==max)
                counter++;
        }
        return length-counter;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int array[]=new int[n];
        for(int iterator=0;iterator<n;iterator++)
        {
            array[iterator]=scanner.nextInt();
        }
        int count=countArray(array);
        System.out.println(count);
    }
}
