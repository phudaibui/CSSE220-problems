public class A{
    private String name;
    private B b;

    public A(String name){
        this.name = name;
        this.b = new B();
    }

    public void setBvalue(int value){
        this.b.setValue(value);
    }

    public int getBValue(){
        return this.b.getValue();
    }
}