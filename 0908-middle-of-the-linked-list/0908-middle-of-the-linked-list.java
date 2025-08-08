/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
    int position=0;
    ListNode temp=head;
    while(temp!=null){
        position++;
        temp=temp.next;
    }
    int middle =position/2;
    for(int i=0;i<middle;i++){
        head=head.next;
    }return head;
        
    }
}