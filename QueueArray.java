public class QueueArray {
    static int size = 100;
    int arr[];
    int front = -1;
    int rear = -1;

    QueueArray(){
        arr = new int[size];
    }
    void enqueue(int data){
        if(rear == size -1){
            throw new IndexOutOfBoundsException("Overflow");
        }
        if(front == -1 || rear == -1){
            front ++;
          arr[++ rear] = data;
            return;
        }
        arr[++ rear ] = data;
    }
    int dequeue(){
        if(front == -1 || rear == -1 || front >rear){
            throw new IndexOutOfBoundsException("Underflow");
        }
        return arr[front++];
    }
    public static void main (String[] args){
        QueueArray q1 = new QueueArray();
        q1.enqueue(3);
        q1.enqueue(9);
        q1.enqueue(10);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
    }
}