package classandobject.practise;

public class Tiger {
    public String raw;
    private String bear;
    protected Double weight;

    public Tiger(String raw,String bear,Double weight){
        this.raw = raw;
        this.bear = bear;
        this.weight = weight;

    }
    public static void main(String[]args){
        Tiger tiger = new Tiger("cruel","black",300d);
        System.out.println(tiger.raw+" "+tiger.bear+" "+tiger.weight);
    }
}
