package inheritanceandpolymorphism.inheritance.superkeyword.fatherson;

public class Test {
    public static void main(String[]args){
        Father father = new Father("ÐÜ¸£¿­",50);
        father.toString();
        System.out.println(father.toString());
        Son son = new Son("ÐÜ½ð",25,180,120);
        son.toString();
        System.out.println(son.toString());
    }
}
