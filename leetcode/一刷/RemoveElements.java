//203.移除链表元素

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 // 使用while loop循环来解，二刷尝试使用recursion。
 
class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
    
        //因为删除第一个node很麻烦，我们创造一个“假head”，这样所有需要被
        //删除的node都是中间的。
        ListNode marked = new ListNode(0);
        marked.next = head;
        
        //指针“prev”指向前一个node
        ListNode prev = marked;
        while(head != null){
            if(head.val == val){
                //前一个指针链接到后一个，中间的跳过(删除)
                prev.next = head.next;
            }
            else{
                //正常连接：前一个指针连接到中间的node
                prev = head;
            }
            //遍历到下一个node
            head = head.next;
        }
        //返回“伪头”的下一个node，也就是我们prev一直在改变的node head
        return marked.next;
    }
}
