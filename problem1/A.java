import java.util.ArrayList;
public class A {
    private ArrayList<B> bs = new ArrayList<>();
    private String name;
    private Integer idNum;
    private int[] values;
    public A(String name, int idNum, int[] values){
        this.name = name;
        this.idNum = idNum;
        this.values = values;
    }
    public int getValueTotal(){
        int total = 0;
        for (int value : this.values){
            total += value;
        }
        return total;
    }
}
