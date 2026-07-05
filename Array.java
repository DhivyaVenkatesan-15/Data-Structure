class Array {
    int[] arr;
    int capacity;
    int size;

    Array(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;

    }
    boolean insert (int index , int element){
        if(index<0 || size >= capacity  || index > size ){
            System.out.println("Invalid index");
            return false;
        }
        for(int i = size; i > index ; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        size++;
        return true;

    }
    int  get (int index){
        if(index<0 || index >= size){
            System.out.println("Invalid index");
            return -999;
        }
         return arr[index];
    }
    void  set (int index , int element){
        if(index <0 || index >= size){
            System.out.println("Invalid index");
        }
         arr[index] = element;
    }
    void display(){
        for(int i = 0; i< size; i++){
            System.out.print(arr[i] +"");
        }
        System.out.println();
    }
    int  search (int element){
        for(int i = 0; i< size ; i++){
            if(arr[i] == element){
                return i;
            }
            
        }
        return -1;

    }
    boolean delete (int index){
        if(index<0 || index >= size ){
            System.out.println("Invalid index");
            return false;

        }
        for(int i = 0; i< size; i++ ){
            arr[i] = arr[i+1];
        }
        size--;
        return false;
    }
    public static void main (String[] args){
        Array arr1 = new Array(7);
        arr1.insert(0,7);
        arr1.insert(1,5);
        arr1.insert(2,4);
        arr1.insert(3,3);
        arr1.insert(4,8);
        arr1.display(); 
        System.out.println("get:" + arr1.get(3));
        arr1.set(3, 9);
        arr1.delete(4);
        System.out.println(arr1.search(5));

    }
    
}