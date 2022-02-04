//public class SinglyLinkedList<ListNode> {
//    private ListNode head;
//    private static class ListNode {
//        private int data;
//        private ListNode next;
//
//        public ListNode(int data) {
//            this.data = data;
//            this.next = null;
//        }
//        public void display(){
//            ListNode current = head;
//            while (current!=null){
//                System.out.println(current.data+"-->");
//                current = current.next;
//            }
//            System.out.println("null");
//        }
//        public void main(String[] args) {
//            SinglyLinkedList sll = new SinglyLinkedList();
//            sll.head = new ListNode(10);
//            ListNode second = new SinglyLinkedList.ListNode(1);
//            ListNode third = new SinglyLinkedList.ListNode(8);
//            ListNode forth = new SinglyLinkedList.ListNode(11);
//            sll.head.next = second; // 10-->11
//            second.next = second; // 10-->1-->8
//            third.next =forth; // 10-->1-->8-->11-->null
//            sll.display();
//
//            // Printing elements of the linked list
//
//
//
//        }
//    }
//
//
//    }
//
//
//
//
