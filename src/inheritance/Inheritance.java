package inheritance;

public class Inheritance {//Parent class,base class, super class
    int id;
    String name;

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        inheritance.id = 1;
        inheritance.name = "Rahul";

        System.out.println(inheritance.id);
        System.out.println(inheritance.name);
    }
}

class Child  extends Inheritance{ //child class , derived class, sub class

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println(child.id);
    }
}


