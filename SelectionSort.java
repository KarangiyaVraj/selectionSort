package selectionsort;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a length of the array:");
        int n = sc.nextInt();
        
        int a[]= new int[n];
        System.out.println("Please enter a value of array:");
        for(int i=0 ; i<n ;i++){
           a[i]=sc.nextInt();
        }
        System.out.print("Unsorted array is :");
        for(int i=0 ; i<n ;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0 ; i<n-1 ;i++ ){
           
             int minValue = i;
             int temp;
            for(int j=i ;j<n ;j++){
                 
                 if(a[j]< a[minValue]){
                      minValue=j;
                 }
            }
                temp=a[i];
                a[i]=a[minValue];
                a[minValue]=temp;
        }
        for(int e:a){
          System.out.print(e+" ");
        }
    }
}
