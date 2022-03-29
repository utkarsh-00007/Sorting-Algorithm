import java.util.Scanner;

/* pivot(Central point around which things revolve) and partition
pivot : 4 types
1- Random
2- Median
3- 1st element
4- last element
Time complexity :
Average case : n*Logn
Worst case : n*n ---> when pivot is always smallest or largest element

We implement merge sort when we have extra memory to take an array and we want TC n*logn in worst case
Quick sort for low memory

 */
public class QuickSort1 {
    public static void quickSort(int[] arr, int si,int ei){
        if (si<ei){
            int pivot=partition(arr,si,ei);
            quickSort(arr,si,pivot-1);
            quickSort(arr,pivot+1,ei);
        }
    }
    public static int partition(int[] arr, int low,int high){
        int pivot=arr[high];
        int j=low-1;
        for (int i = low; i < high; i++) {
            if (arr[i]<pivot){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        j++;
        int temp=arr[j];
        arr[j]=pivot;
        arr[high]=temp;
        return j;
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
        quickSort(arr,0,n-1);
        printArray(arr);
    }
}
