// Practise Set 3
public class SumAtOdd {
    public static void main(String [] args){
        int[] arr={2,3,7,1,86,99,103,5};
        int sum=0;
        for (int a=0;a<arr.length;a++){
            if ((a%2)==0){
                if (arr[a]%2!=0){
                    sum+=arr[a];
                }
            }            
        }
        System.out.println("Sum of all odd numbers at even index is "+sum);
    }
}
