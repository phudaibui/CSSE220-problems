import java.util.ArrayList;

public class main {
    private ArrayList<A> as = new ArrayList<>();
    private ArrayList<B> bs = new ArrayList<>();
    
    public int countATotal(){
        int count = 0;
        for (A a : as){
            count += a.getValueTotal();
        }
        return count;
    }

    public int countBTotal(){
        int sum = 0;
        for (B b : bs){
            sum += b.computeNumDiff();
        }
        return sum;
    }

}