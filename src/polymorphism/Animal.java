package polymorphism;

//Method overriding -> if two classes have same method name and same parameter
//runtime polymorphism , late binding ,dynamic binding
//advantage -> we can give implementation to method which is already implemented by another class
public class Animal {

    public void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }

    @Override
    public void sound() {
        System.out.println("Cat sound..");
    }
}

class Elephant extends Cat {

    public static void main(String[] args) {
        Animal obj = new Elephant(); //dynamic dispatch method
        obj.sound();
    }

    @Override
    public void sound() {
        System.out.println("Elephant sound");
    }
}