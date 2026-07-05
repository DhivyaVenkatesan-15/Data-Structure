public class QueueArray1 {
    static int size = 100;
    int arr[];
    int front = 0;
    int rear = -1;

    QueueArray1(){
        arr = new int[size];
    }
    void enqueue(int data){
        if(rear == size -1){
            throw new IndexOutOfBoundsException("Overflow");
        }
        
        arr[++ rear ] = data;
    }
    int dequeue(){
        if( rear == -1 ){
            throw new IndexOutOfBoundsException("Underflow");
        }
        int temp = arr[0];
        for(int i = 0; i< rear; i ++){
            arr[i] = arr[i+ 1];
        } 
        rear --;
        return temp;
        
    }
    public static void main (String[] args){
        QueueArray1 q1 = new QueueArray1();
        q1.enqueue(3);
        q1.enqueue(9);
        q1.enqueue(10);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
    }       
}