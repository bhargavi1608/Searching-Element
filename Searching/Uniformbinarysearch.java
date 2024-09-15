public class Uniformbinarysearch {
    public static int[] createLookupTable(int size){
        int[] lookuptable = new int[size];
        for (int i = 0; i < size; i++) {
            lookuptable[i] =(i+size)/2;

        }
        return lookuptable;
    }public static int recursiveUniformBinarySearch(int arr[],int key, int[] lookuptable,int left,int right){
        if(left>right){
            return  -1;
        }
        int mid = lookuptable[left+(right-left)/2];
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
          return  recursiveUniformBinarySearch(arr, key, lookuptable, left, mid-1);
        }else{
            return recursiveUniformBinarySearch(arr, key, lookuptable, mid+1, right);
        }

    }
    
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,8,9};
        int lookuptable[]= createLookupTable(arr.length);
        int key = 7;
        int ans = recursiveUniformBinarySearch(arr, key, lookuptable, 0, arr.length-1);
        System.out.println(ans);
    }
}
