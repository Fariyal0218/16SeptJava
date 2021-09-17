package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
//primitive datatype
    int i = 903432343;
    long l = 2321232342433443434L;
    byte b = 127;
    float f = 12.3f;
    double d = 2131312323.0;
    char c = 'c';
    short s = 32131;
    boolean aBoolean = true;

    String str = "wijewifr";
    String string = new String("In java");
//    non- primitive datatype
    Integer integer = 10;
    Long aLong ;
    Byte aByte;
    Float aFloat;
    Double aDouble;
    Character character;
    Short aShort;
    Boolean boolean1;


    public void show(){
        System.out.println("In Show");
    }

    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Test test = new Test();
        test.show();

        Test test1 = Test.class.newInstance();
        test1.show();

        Constructor<Test> testConstructor = Test.class.getConstructor();
        Test test2 = testConstructor.newInstance();
        test2.show();

    }
}
