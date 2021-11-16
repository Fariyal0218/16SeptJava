package multithreading;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface myInterface=new MyInterface() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(myInterface.add(12,6));
    }
}
interface MyInterface{
    int add(int a,int b);
}


