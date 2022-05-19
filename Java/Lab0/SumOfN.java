

// Practise Set 3
// Sum of N Command Line Arguement

public class SumOfN{
    // Command Line Arguement
    public static void main(String [] args){
        int sum=0;
        for (int i=0;i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.print("\nThe sum is : "+sum+"\n");
    }
}