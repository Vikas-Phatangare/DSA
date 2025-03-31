public class GetterSetter {
    public static void main(String[] args) {
        
        pen p1=new pen();
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
        p1.setcolor("ab");
        p1.settip(5);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());

    }
    
}
class pen{
    private String color="a";
    private int tip=2;
    String getcolor(){
        return this.color;

    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String col){
        color=col;

    }
    void settip(int ti){
        tip=ti;
    }
}
