package inheritance;

public class Teacher {

    int id;
    String name;
    String address;

}

class MathsTeacher extends Teacher {

    public static void main(String[] args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name ="Akash";
        obj.address = "Sangli";

        System.out.println("Id =>"+obj.id +" Name=>"+obj.name+ " address=>"+obj.address);
    }
}

class PhysicsTeacher extends Teacher{

    public static void main(String[] args) {

        PhysicsTeacher obj = new PhysicsTeacher();
        obj.id = 2;
        obj.name = "Rakesh";
        obj.address = "Latur";

    }
}