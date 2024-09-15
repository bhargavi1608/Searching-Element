

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static int binarysearch(int arr[],int key,int left,int right){
        if(left>right){
            return -1;
        }
       
        int mid = left+(right-left)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
          return   binarysearch(arr, key, left+1, right);
        }else{
            return binarysearch(arr, key, left, right+1);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int key=sc.nextInt();
            System.out.println(binarysearch(arr, key, 0, arr.length));
           
        }
    }
}
