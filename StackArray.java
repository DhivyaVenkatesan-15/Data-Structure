public class StackArray {
    int size;
    int Stack[];
    int top = -1;

    StackArray(){
        size = 100;
        Stack = new int[size];
    }
    void push(int data){
        if(top == size - 1){
            System.out.println("Overflow");
            return;
        }
        Stack[++top] = data;
    }
    int pop(){
        if(top == -1){
            System.out.println("Underflow");
        }
        return Stack[top--]; 

    }
    int peek(){
        return Stack[top];
    }
    int isEmpty(){
        if(top == -1){
            return 1;
        }
        return 0;
    }
    public static void main (String[] args){
        StackArray s1 = new StackArray();
        s1.push(9);
        s1.push(23);
        s1.push(89);
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        System.out.println(s1.isEmpty());
    }
}