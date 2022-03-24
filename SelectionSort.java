import java.util.Scanner;
//time complexity : O[n^2]
public class SelectionSort1 {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
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
        selectionSort(arr);
    }
}
