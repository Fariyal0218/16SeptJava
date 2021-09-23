package abstraction.abstractdemo;

public class Football extends AbsSport{
    @Override
    public void play() {
        System.out.println("In play football");
    }

    public static void main(String[] args) {

        Football obj = new Football();
        obj.play();
//        obj.exercise();
    }
}

/**
 *         abstract class                                                 Interface
 *
 * 1 . abstract class declared using abstract keyword                1. using interface keyword
 *
 * 2 . abstract class uses private,protected ,public method          2. only public methods
 *
 * 3 . abstract class have both methods concrete and abstract        3. only abstract
 *
 * 4 . we achieve partial abstraction                                4. 100 % abstraction
 *
 * 5 . abstract class extends another class or interface             5. we only extend another interface
 *
 */