import java.util.Arrays;
class Linearsearch{
    public static int find(int[] arr , int target){
        for(int i = 0; i<arr.length;i++){
        if(arr[i] == target){
            return i;
        }
       
    }
     return -1;
    }

    public static boolean contains(int[] arr , int target){
        for(int i = 0; i<arr.length;i++){
            if (arr[i] == target){
            return true;
        }
       
    }
     return false;
    }
    public static int find(String s, char target){
        for(int i = 0; i<s.length();i++){
        if(s.charAt(i) == target){
            return i;
        }
      
    }
      return -1;
    }
    public static boolean contains(String s , char target){
        for(int i = 0;i<s.length();i++){
        if(s.charAt(i) == target){
            return true;
        }
      
    }
      return false;
    }
    public static int[] find(int[][] arr, int target){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
               
            }
        }
          return new int[]{-1,-1};
    }
    public static boolean contains(int[][] arr, int target){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i][j] == target){
                    return true;
                }
               
            }
        }
          return false;
}


    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        int target = 6;
        String s ="Dhivya";
        int Arr2D[][] = {{1,2,3},{6,7},{4}};
        System.out.println(Linearsearch.find(arr,target));
        System.out.println(Linearsearch.contains(arr, target));
        System.out.println(Linearsearch.find(s,'i'));
        System.out.println(Arrays.toString(Linearsearch.find(Arr2D,6)));
        System.out.println(Linearsearch.contains(Arr2D,6));
    
            }
    
    }



