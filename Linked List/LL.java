//All functions performed in Linked list--

class LL{
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }


    // add operations at first
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head == null)
        {
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    //add operations at last
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head == null)
        {
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("This List is empty");
            return;
        }
        size--;
        head = head.next;
    }    

    //delete at last
    public void deleteLast(){
        if(head == null){
            System.out.println("This List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next !=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next=null;
    }

    //Reverse a linkedlist
    public void reverseiterate(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode = head.next;
        while(currNode!= null){
            Node nextNode = currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    //Print
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println(("Null"));
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.printList();

        list.addlast("List");
        list.printList();

        list.addfirst("this");
        list.printList();

        /*list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();*/

        System.out.println(list.getSize());
        
        list.reverseiterate();
        list.printList();
    }
}