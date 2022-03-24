
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>-1 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        printArray(arr);
    }
    public static void  printArray(int[] arr){
        System.out.println("Sorted array is : ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array you want : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
    }
}
