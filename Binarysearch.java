public class Binarysearch{
    public static int search(int[] arr, int target){
        int l = 0; 
        int r = arr.length-1;
        boolean asc = true;
        if(arr[l]>arr[r]){
            asc =  false;
        }
    
        if(asc=true){
            while(l<=r){
                int mid = (l+ r)/2;
                if(arr[mid] == target){
                    return mid;
                }
                else if(arr[mid]> target){
                    r = mid -1;
                }else{
                    l = mid +1;
                }
            }
        }else {
            while(l<=r){
                int mid = (l+ r)/2;
                if(arr[mid] == target){
                    return mid;
                }
                else if(arr[mid]> target){
                    l = mid +1;
                }else{
                    r = mid -1;
                }
            }
          
        }
        return -1;
    }
    
        public static int searchR(int[] arr, int target, int l, int r){
            int mid = (l+r)/2;
            if(l>r)
                return -1; 
            if(arr[mid] == target)
                return mid;
            
            if(arr[mid] >target)
                return searchR(arr , target , l, mid - 1);
            
            else
                return searchR(arr , target, mid+1, r);
           
        }
        public static void main(String[] args){
            int[] arr = {2,6,9,5,8,1,7,3};
            int[] brr = {9,8,7,6,5,4,3,2};
            int target = 5;
            System.out.println(search(brr,6));
            System.out.println(searchR(arr,7,0,arr.length-1));
        

    }  
}