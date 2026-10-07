package recursion;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class JosephusProblem {

    private static Node makeList(int n) {
        Node head = new Node(1);
        Node temp = head;
        for (int i = 2; i <= n; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        temp.next = head;
        return head;
    }

    private static int length(Node head) {
        if (head == null) return 0;
        int len = 1;
        Node cur = head;
        while (cur.next != head) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    private static int value(Node head, int k) {
        Node prev = null;
        Node curr = head;

        if (k == 1) {
            while (curr.next != curr) {
                curr = curr.next;
            }
            return curr.val;
        }


        while (curr.next != curr) {
            for (int count = 1; count < k; count++) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next;
            curr = prev.next;
        }
        return curr.val;
    }

    public static void main(String[] args) {
        Node head = makeList(5);
        System.out.println("The survivor is: " + value(head, 2));
    }
}
