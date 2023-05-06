//Lab 7 - Practise 2

public class Try {
    public static void main(String [] args){
        try{
            int salary=100_000;
            System.out.println(salary);
            try {
                int arr[]={10,20,30};
                System.out.println(arr[4]);
            }
            /*This catch statement will be skipped as wrong Exception is there,
             the outer catch will be reached */
            catch(EventException e){
                System.out.println("Inner catch");
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Outer catch");
        }
    }
}
