 public class Stacklist {
    class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
   
        Node top = null ;
         void push(int data){
            Node newNode = new Node(data);
            if(top == null){
                top = newNode;
            }
            newNode.next = top;
            top = newNode;
        }
         int pop(){
            if(top == null){
                System.out.println("Underflow");
            }
            int temp = top.data;
            top = top.next;
            return temp;
        }
         int peek(){
            return top.data;
        }
         int isEmpty(){
            if(top == null){
                return 1;
            }
            return 0;
        }
        public static void main (String[] args){
            Stacklist  stack =  new Stacklist();
            stack.push(5);
            stack.push(8);
            stack.push(10);
           System.out.println(stack.pop());
           System.out.println(stack.peek());
           System.out.println(stack.isEmpty());
        }
    }
