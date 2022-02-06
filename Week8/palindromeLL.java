class Solution {
    public boolean isPalindrome(ListNode head) {
        String ans = "";
        int len = 0;
        while(head!=null){
            ans += head.val;
            head = head.next;
            len++;
        }
        for(int i=0; i<len/2; i++){
            if(ans.charAt(i)!=ans.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}