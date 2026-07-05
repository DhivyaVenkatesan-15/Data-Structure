import java.util.Arrays;
public class Mergesort {
    public static int[] sort(int[] arr , int[] brr){
        int al= arr.length;
        int bl = brr.length;
        int cl = al+bl;
        int[] crr = new int[cl];
        int i = 0;
        int j= 0;
        int k= 0;
        while(i< al && j<bl){
            if(arr[i] < brr[j]){
                crr[k] = arr[i];
                i++;
                k++;
            }
            else{
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        while(i < al){
            crr[k] = arr[i];
            i++;
            k++;
        }
        while(j< bl){
            crr[k] = brr[j];
            j++;
            k++;
        }
        return crr;
    }
    public static void main(String[] args){
        int[] arr = {9,3,6,1,0};
        int[] brr = {4,2,7,3,6};
        
        System.out.println(Arrays.toString(sort(arr,brr)));
    }
}