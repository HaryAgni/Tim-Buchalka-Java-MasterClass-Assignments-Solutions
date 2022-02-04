public class Main {
   private ListNode head;
   private static class ListNode{
       private int data;
       private ListNode next;

       public ListNode(int data) {
           this.data = data;
           this.next = null;
       }
   }
   public void display(){
       ListNode current = head;
       while (current!=null){
           System.out.println(current.data +"-->");
           current = current.next;
       }
       System.out.println("null");
   }
   public int length(){
       if(head==null){
           return 0;
       }
       int count =0;
       ListNode current = head;
       while (current!=null){
           count++;
           current=current.next;
       }
       return count;
   }
   public void insertFirst(int value){
       ListNode newNode = new ListNode(value);
       newNode.next = head;
       head = newNode;
   }
   public void insertLast(int value){
       ListNode newNode = new ListNode(value);
       if(head == null){
           head = newNode;
           return;
       }
       ListNode current = head;
       while (current.next!=null){
           current = current.next;
       }
       current.next =newNode;
   }
   public ListNode deleteFirst(){
       if (head==null){
           return null;
       }
       ListNode temp = head;
       head = head.next;
       temp.next =null;
       return temp;
    }
    public ListNode deleteLast(){
       if ((head==null)||(head.next==null)){
           return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next =null;
        return current;
    }

    public static void main(String[] args) {
        Main sll = new Main();
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.insertLast(5);
        sll.insertFirst(6);
        sll.insertFirst(9);
        sll.insertFirst(23);
        sll.insertFirst(98);
        sll.deleteFirst();
        sll.deleteFirst();
        System.out.println(sll.deleteFirst().data);
        sll.deleteLast();
        System.out.println(sll.length());
        sll.display();

    }
}