class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        while(count < n )
        {
            fast= fast.next;
            count++;
        }
        while(fast != null && fast.next != null)
        {
        slow= slow.next;
        fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
        
    }
}

//time complexity:- O(N)
//Space complexity:- O(1)