package encapsulation;

public class EncapsulationDemo {

    //instance variable //global variable
    private int id;
    private String name;
    private String address;

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(1);
        System.out.println(obj.getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int empId) {//local variable
        if (id == 0) {
            System.out.println("Your id is zero can not set");
        } else {
            id = empId;
        }
    }
}

