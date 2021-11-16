package finalkeyword;

/**
 * final variable=> you can not reassign the value to final variable
 * final method => you can override the method
 * final class => you can not inherit the class
 */
public class FinalKeywordDemo {
    final int i = 98;

    public void display(){

   //     i= 56;
    }
    public static void main(String[] args){
        FinalKeywordDemo obj  = new FinalKeywordDemo();
        obj.display();
        System.out.println(obj.i);
    }
}
class FinalOver extends FinalKeywordDemo{
    @Override
    public void display(){

    }
}