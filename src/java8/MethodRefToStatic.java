package java8;

public class MethodRefToStatic {
    public static void main(String[] args) {
        //refer
        Myinterface5 myinterface5 = MethodRefToStatic::display;
        //call
        System.out.println(myinterface5.msg());
    }


public static String display(){
    return  "Hello";
}
}
@FunctionalInterface
interface Myinterface5{
    String msg();
}