package statickeyword;

public class StaticKeywordDemo {

    static final String companyName = "Abc";
    int id;
    String name;

    static{
     //   companyName = "XYZ";
        System.out.println("In static block");
    }
    public StaticKeywordDemo(int id,String name){
        this.id = id;
        this.name = name;
    }
    public static void show(){
        System.out.println("In show");
    }

    public static void main(String[] args){
        StaticKeywordDemo obj = new StaticKeywordDemo(1,"Fariyal");
        StaticKeywordDemo obj1 = new StaticKeywordDemo(2,"Alfiya");
        StaticKeywordDemo obj2 = new StaticKeywordDemo(3,"Jabin");
        obj.display();
        obj1.display();
        obj2.display();
      //  System.out.println(companyName);
       // System.out.println(id);
    }
    public void display(){

        System.out.println("Id=>"+ id + "name=>"+ name +" Company Name=>" + companyName);
    }
}
