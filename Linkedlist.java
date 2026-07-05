public class Linkedlist {

    class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
        Node head = null;
        void insertbegining(int data){
            Node NewNode = new Node(data);
            NewNode.next = head;
            head = NewNode;
        }
    
  void insertLast(int data){
            if(head == null){
                insertbegining(data);
            }
            Node NewNode = new Node(data);
            Node temp = head;
            if(temp.next != null){
                temp = temp.next;
            }
            temp.next = NewNode;
        }


        void insertindex(int index , int element){
            if(index<0){
                System.out.println("Invalid Index");

            }
            Node temp = head;
            for(int i = 0;i<index - 1;i++){
                temp = temp.next;
            }
        }
        void delete(int data){
            Node temp = head;
            if(head.data == data){
                head = head.next;
                return;
            }
            
            while(temp.next != null && temp.next.data != data){
                temp = temp.next;
            }
                if(temp.next == null){
                    System.out.println("Invalid Index");
                    temp = temp.next;
                }
                if(temp.next == null){
                    System.out.println("Invalid Index");
                    return;
                }
                temp.next = temp.next.next;
            }
        
        void deleteindex(int index){
            if(index<0){
                System.out.println("Invalid Index");
                return;
            }
            if(index == 0){
                head= head.next;
                return;
            }
            Node temp = head;
            for(int i = 0;i<index - 1 ;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        void Search(int data){
            Node temp = head;
            while(temp != null){
                if(temp.data == data){
                    System.out.println("True");
                    return;
                }
                    temp = temp.next;
            } 
                    System.out.println("False");
                
                
            }
        
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +"->");
                temp = temp.next;

            }
                System.out.println("null");
        }
        public static void main (String[] args){
           Linkedlist L1  = new Linkedlist();
        L1 .insertbegining(4);
        L1 .insertbegining(7);
        L1 .insertbegining(3);
        L1.delete(7);
        L1.deleteindex(1);
        L1.display();
        
        }
    }
    

