public class SinglyLinkedList{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    Node head; 

    public void add(int data){
        addLast(data);
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node tem=head;
            while(tem.next!=null){
                tem=tem.next;
            }
            tem.next=newNode;
        }
    }

    public void deleteFirst(){
        try{
            head = head.next;
        }catch(Exception e){
            System.out.print("linkedList is Empty...");
        }
    }

    public void deleteLast(){
        if(head==null)System.out.print("linkedList is Empty...");
        else if(head.next==null)head=null;
        else{
            Node tem=head;
            while(tem.next.next!=null){
                tem=tem.next;
            }
            tem.next=null;
        }
    }

    public void deleteAt(int index){
        if(index>size() || head==null || index<=0){
            System.out.println("Index out of bounce");
            return;
        }
        if(index==1){
            deleteFirst();
            return;
        }
        Node tem=head;
        for(int i=1; i<index-1; i++){
            tem=tem.next;
        } 
        tem.next=tem.next.next;
    }

    public int size(){
        int count=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public void print(){
        Node temp = head;
        System.out.print("head");
        while(temp!=null){
            System.out.print(" --> "+temp.data);
            temp=temp.next;
        }
        System.out.print(" --> null");
    }
}