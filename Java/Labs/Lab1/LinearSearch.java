import java.util.Scanner;

public class LinearSearch {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
       //System.out.print("Enter size of array : ");
        //int size= scan.nextInt();

        System.out.print("Enter Element to be searched : ");
        int elem = scan.nextInt();
        int arr[]= {10,20,30,40,50};
        int index=0;
        for (int num : arr){
            if (num==elem) {
                System.out.println("Element found at index "+index);
                break;
            }
            index++;
        }
        if (arr.length==index){
            System.out.println("Element not found ") ;       }
    }
}
