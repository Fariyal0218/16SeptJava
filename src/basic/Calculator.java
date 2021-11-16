package basic;

import java.util.Scanner;

public class Calculator {

    private void add(){
        int i;
        int j;
        int k;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        i = scanner.nextInt();
        System.out.println("enter the second number ");
        j = scanner.nextInt();


        k = i+j;
        System.out.println("k "+k);
    }
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        obj.add();
    }
}
