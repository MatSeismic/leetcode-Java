class Solution1290 {
    public int getDecimalValue(ListNode head) {
        ListNode p = head;
        int base10 = 0;
        while (p != null) {
            base10 = base10 * 2 + p.val;
            p = p.next;
        }
        return base10;
    }
}