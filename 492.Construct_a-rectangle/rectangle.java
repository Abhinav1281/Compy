import javax.print.event.PrintJobListener;

class rectangle {
    public static int[] constructRectangle(int area) {
        for(int i = (int) Math.sqrt(area); i >= 1;i--){
            if(area%i == 0) 
                return new int[]{area/i,i};
        
        }
        return new int[]{area,1};
    }

    public static void main(String[] args) {
        int iArea=4;
        int val[]=constructRectangle(iArea);
        for(int i=0;i<2;i++)
            System.out.print(val[i]+",");
    }
}