class reverse {
    public static int reversed(int x) {
        long xnew=x,xrev=0;
        xnew=Math.abs(xnew);
        for(long i=xnew;i>0;i/=10)
        {
            xrev=xrev*10+(i%10);
            if(xrev>Integer.MAX_VALUE)
                return 0;
        }
        if(x<0)
            xrev=-1*xrev;
       
        return (int)xrev;
    }

    public static void main(String[] args) {
        int x=reversed(Integer.MIN_VALUE+7);
        System.out.println(x);
    }
}