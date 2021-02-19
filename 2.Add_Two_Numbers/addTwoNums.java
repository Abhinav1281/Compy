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

class addTwoNums {
        
    public static ListNode addTwoNum(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        ListNode head=ans;
        int i=0,s=0,c=0;
        ListNode temp;
        while(l1!=null || l2!=null)
        {
            s=0;
            int v1= l1!=null ? l1.val : 0;
            int v2= l2!=null ? l2.val : 0;
            
            l1=l1!=null ? l1.next : l1;
            l2=l2!=null ? l2.next : l2;
            
            s+=v1+v2+c;
            c=s/10;
            s=s%10;
            
            temp=new ListNode(s);
            if(i==0)
            {
                ans=temp;
                head=ans;
                i++;
            }
            else
            {
                ans.next=temp;
                ans=ans.next;
            }
            
        }
        if(c!=0)
        {
            temp=new ListNode(c);
            ans.next=temp;
            ans=ans.next;
        }
        
        return head;
    }

    public static void main(String[] args) {
        ListNode l1=new Listnode(2);
        ListNode l11=new ListNode(4);
        ListNode l12=new ListNode(3);
        l1.next=l11;
        l11.next=l12;

        ListNode l2=new Listnode(5);
        ListNode l21=new ListNode(6);
        ListNode l22=new ListNode(4);
        l2.next=l21;
        l21.next=l22;

        ListNode ans=addTwoNum(l1, l2);

        while(ans!=null)
        {
            System.out.print(ans.val+",");
            ans=ans.next;
        }
    }
}