package polymorphism;

/**
 * polymorphism -> the ability to take one form to many forms
 * or
 * one thing have many actions
 */

public class PolyDemo {
//compile time polymorphism, static binding, early binding
    //method overloading -> a class have multiple methods with same name but different
    // number of arguments

//    rule of method overloading  -> 1. changing number of argument/parameter
//                2. changing the datatype

//    advantage -> it increases readability of program.


    private int add(int a,int b){
        return a+b;
    }

    private double add(double a,int b){
        return a+b;
    }

    private float add(float a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        PolyDemo obj = new PolyDemo();
        System.out.println(obj.add(1,8));
        System.out.println(obj.add(2.9,4));

    }
}
