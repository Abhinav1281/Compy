import java.util.*;
class RecentCounter {

    Queue<Integer> ll;
    public RecentCounter() {
        ll= new LinkedList<>();
        ll.add(0);
    }
    
    public int ping(int t) {
        //System.out.println(t);
        if(ll.peek()==0)
        {
            ll.remove();
            ll.add(t);
        }
        else if(t-3000<=ll.peek())
        {
            ll.add(t);
        }
        else
        {
            while(t-ll.peek()>3000)
            {
               
                ll.remove();
                 if(ll.isEmpty())
                    break;
            }
            ll.add(t);
        }
        //System.out.println(ll);
        return ll.size();
    }
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        int param_1 = obj.ping(1);
        int param_2 = obj.ping(100);
        int param_3 = obj.ping(3001);
        int param_4 = obj.ping(3002);

        System.out.println(param_1+","+param_2+","+param_3+","+param_4);
        
    }
}

