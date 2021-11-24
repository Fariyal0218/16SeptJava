package strings;

public class StringDemo {
    public static void main(String[] args) {
        char[] arr={'M','U','M','B','A','I'};
        String str1="Pune";
        String str2=new String("Pune");
        String str3=new String(arr);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
