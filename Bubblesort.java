import java.util.Arrays;
public class Bubblesort {
    public static void sort (int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            boolean swap = false;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
        
        if(swap == false){
            return;
        }
    }
    }
public static void main (String[] args){
            int[] arr = {5,2,10,0,1};
            int[] brr = {1,2,3,4,5};

            sort(arr);
            sort(brr);

        System.out.println(Arrays.toString(arr)); 
        System.out.println(Arrays.toString(brr));     
       }
    }


