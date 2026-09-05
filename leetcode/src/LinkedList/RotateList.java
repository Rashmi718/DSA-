package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int len = length(head);
        int target = k % len;

        if (target == 0) {
            return head;
        }
        ListNode temp1 = head;
        int count = 1;

        int stopAt = len - target;
        while (count < stopAt) {
            temp1 = temp1.next;
            count++;
        }
        ListNode curr = temp1.next;
        temp1.next = null;

        ListNode newHead = curr;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;

        return newHead;
    }

    public int length(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public void display(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        RotateList rl = new RotateList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode t = rl.rotateRight(head, 2);
        rl.display(t);
    }
}
