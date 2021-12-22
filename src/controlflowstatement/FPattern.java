package controlflowstatement;

public class FPattern {
    public static void main(String[] args) {
        for(int row=1;row<=10;row++){
            for(int col=1;col<=11;col++){
                if(row==1 || col==1 || row==10/2 && col%2==1){
                    System.out.print("* ");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
