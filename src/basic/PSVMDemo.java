package basic;

public final class PSVMDemo {

    String fan;
    String tv;
    String ac;
    String table;
    String bottle;

    public String show(){

        return "Hii";
    }

    private void main(String args) {

    }
    static public void main(String[] args) {

       ;
        PSVMDemo obj = new PSVMDemo();
        System.out.println(obj.fan);
        obj.show();

        /**
         * public -> public access specifier ,JVM can access from outside.
         * static -> without creating object of class JVM can access.
         * void -> void return nothing
         * main -> main is identifier,it is starting point  to program
         *
         * String[] -> command line arg
         * args -> is variable name
         *
         * */



    }
}

//dhananjay
//nikita
//rutuja
//sanskriti
//heena
//shaikh
//jhanhavi
