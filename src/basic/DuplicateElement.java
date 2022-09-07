package basic;

//Find duplicate element in Array

public class DuplicateElement {

    public static void main(String[] args) {

        int[] arr=new int[] {1,2,3,4,8,6,7,7,8};

        System.out.println("Duplicate elements");

        for (int i=0;i< arr.length;i++){

            for (int j=i+1;j< arr.length;j++){

                if (arr[i] ==arr[j])

                    System.out.println(arr[j]);
            }
        }
    }
}
