/**
 * @author cairunduo
 * @date 2019/10/5 - 22:51
 * <p>
 * 反转链表
 * 在单链表的表头临时接入一个节点，然后进行尾插法操作。反转单链表。
 */
public class Demo14 {
    public static class ListNode {
        int value;
        ListNode next;
    }

    public static ListNode reverseList(ListNode head) {
        // 用于记录反转后的链表的头结点
        ListNode reverseHead = null;
        // 用于记录当前处理的结点的
        ListNode curr = head;
        // 用于记录当前结点的前驱结点
        ListNode prev = null;
        // 当前结点的下一个结点
        ListNode next;

        //进行尾插法操作
        while (curr != null) {
            //记录当前节点，最后一个记录到的就是反转后的头节点（原尾节点）
            reverseHead = curr;
            //记录当前节点对于原链表来说的下一个节点
            next = curr.next;
            //当前节点原链表的下一个节点设为逻辑上新链表（反转后）当前节点的前驱节点
            curr.next = prev;
            //设置当前节点在新链表中的前驱节点的值为当前节点
            prev = curr;
            //将当前节点的值设为原链表中当前节点的后继节点，实现指针的移动
            curr = next;
        }
        return reverseHead;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.value = 1;

        head.next = new ListNode();
        head.next.value = 2;

        head.next.next = new ListNode();
        head.next.next.value = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.value = 4;

        head.next.next.next.next = new ListNode();
        head.next.next.next.next.value = 5;

        head.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.value = 6;

        head.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.value = 7;

        head.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.value = 8;

        head.next.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.next.value = 9;

        printList(head);
        head = reverseList(head);
        printList(head);
        head = reverseList(head);
        printList(head);

    }
}
