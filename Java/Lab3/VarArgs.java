public class VarArgs {
    static int calcSum(int ... arr){
        int sum=0;
        for(int x : arr){
            sum+=x;
        }
        return sum;
    }
    public static void main(String [] args){
        int sum=calcSum(10,20,30);
        System.out.println("Sum is "+sum);
    }
}
