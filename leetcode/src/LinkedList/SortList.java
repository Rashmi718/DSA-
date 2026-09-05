package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class SortList {
    public Node split(Node head){
        Node slow =  head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            if(fast != null){
                slow = slow.next;
            }
        }

        Node temp = slow.next;
        slow.next = null;

        return temp;
    }

    public Node merge(Node head1,Node head2){

        if(head1==null) return head2;
        if(head2==null) return head1;

        if(head1.val<head2.val){
            head1.next = merge(head1.next,head2);
            return head1;
        }else{
            head2.next = merge(head1,head2.next);
            return head2;
        }
    }

    public Node sort(Node head){
        if(head == null || head.next == null) return head;
        Node second = split(head);

        head = sort(head);
        second = sort(second);

        return merge(head,second);
    }

    public void printList(Node head){
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        SortList sl = new SortList();

        Node head = new Node(9);
        head.next = new Node(8);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);

        head = sl.sort(head);
        sl.printList(head);
    }

}
