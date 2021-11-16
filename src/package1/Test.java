package package1;

public class Test {

    int i;

    private void show(){

        System.out.println("In show method");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.i = 90;
        System.out.println();
    }
}

/**
 * private => it is accessible within class only
 * public => it is accessible in whole project
 * protected => accessible in package and through inheritance outside the package
 * default => accessible in package,default is
 */