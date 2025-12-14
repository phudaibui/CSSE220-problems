import java.util.ArrayList;

public class Main{
    private ArrayList<A> list;
    
    public Main(){
        this.list = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            this.list.add(new A("one"));
        }
    }

    private void setAllBValueTo3(){
        for (A a : list){
            a.setBvalue(2);
        }
    }

    private void printReport(){
        for (A a : list){
            System.out.println("B value: " + a.getBValue());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setAllBValueTo3();
        main.printReport();
    }
}