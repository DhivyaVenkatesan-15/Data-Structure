public class Doublylist {
class Node {
    int data;
    Node prev ;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

     Node head = null;
    public void insertBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        if(head!= null){
            head.prev = newNode;
        }
        head = newNode;
   }

   public void insertlast(int data){
      if(head== null){
        insertBegining(data);
      }
      Node newNode = new Node(data);
      Node temp = head;
      if(temp.next != null){
        temp= temp.next;
      }
      temp.next = newNode;
      newNode.prev = temp;
   }
   public void insertAtindex(int index, int data){
    if(index>0){
        System.out.println("Invalid Index");
        return;
    }
    if(index == 0){
        insertBegining(data);
    }
    
    Node temp = head;
    for(int i=0;i<index -1;i++){
        temp = temp.next;
}
    Node newNode = new Node(data);
    newNode.next = temp.next;
    newNode.prev = temp;
    if(temp.next != null){
        temp.next.prev = newNode;
    }
    temp.next = newNode;
   }
   void delete(int data){
    Node temp = head;
    if(head.data == data){
        head = head.next;
        return;
    }
    while (temp.next!=null && temp.next.data != data){
        temp = temp.next;
    }
    if(temp.next == null ){
        System.out.println("Invalid Index");
        return;
    }
    temp.next = temp.next.next;
    if(temp.next == null || temp == null){
        temp = temp.next;
    }
    temp.next.prev = temp;
        
    }
void deleteAtindex(int index){
    if(index<0 || head == null){
        System.out.println("Invalid Index");
        return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    boolean  search(int data){
        Node temp = head;
        while(temp!= null){
        if(temp.data == data){
            return true;
        }
            temp = temp.next;
        }
        return false;
        
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main (String[] args){
        Doublylist l1 = new Doublylist();
        l1.insertBegining(8);
        l1.insertBegining(9);
        l1.insertBegining(2);
        l1.display();
        
    }

}


   


