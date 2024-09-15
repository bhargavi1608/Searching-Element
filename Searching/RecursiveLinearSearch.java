
import java.util.Scanner;

public class RecursiveLinearSearch{
    public static int recursivelinearsearch(int arr[],int key,int index){
        if(index>=arr.length){
            return -1;
        }
        if(arr[index]==key){
            return index;
        }
        return recursivelinearsearch(arr, key, index+1);

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            int key = sc.nextInt();
            int result = recursivelinearsearch(arr, key, 0);
            if(result!=-1){
                System.out.println("Element "+key+" is present at index "+ result);
            }else{
                System.out.println("Element "+key+" is not  present in an array");
            }
        }
    }
}