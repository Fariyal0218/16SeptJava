package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Pune");
        str.append("City");
        System.out.println(str);

        String str1="Welcome";
        StringBuilder str2=new StringBuilder(str1);
        str2.reverse();
        System.out.println(str2);
        for(int i=(str1.length()-1);i>=0;i--){
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        String str3="abbcfcdeed";
        StringBuilder str4=new StringBuilder(str3);
        for(int j=0;j<str4.length();j++){
            for(int k=j+1;k<str4.length();k++) {

                if(str4.charAt(j) == str4.charAt(k)) {
                    str4.deleteCharAt(k);
                }
            }
        }
        System.out.println(str4);
    }
}
