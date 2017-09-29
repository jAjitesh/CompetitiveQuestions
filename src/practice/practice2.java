package practice;
import java.util.Scanner;
public class practice2 {
	public static int partition(int[] arr, int p, int q){
        int j = p;
        int pivot = arr[p];
        for(int i = p+1; i <= q; i++){
            if(arr[i] <= pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }
        int temp = arr[j];
        arr[j] = arr[p];
        arr[p] = temp;
        
        return j;
        
        }
    public static void quicksort(int[] arr,int p, int q){
        
        int i = partition(arr, p, q);
        if(q > p){
            quicksort(arr, p, i-1);
            quicksort(arr, i+1, q);  
        } 
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        System.out.print("n= ");
        int n = s.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
        	System.out.print(i+" = ");
        	arr[i] = s.nextInt();
           
        }
        quicksort(arr, 0, n-1);
        for(int i = 0; i<n ; i++){
            System.out.print(arr[i]+" ");
         }
    }}
