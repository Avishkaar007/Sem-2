public class Bank {
    float getRateOfInterest(){
        return 0;
    }
    public static void main(String [] args){

    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8.0f;
    }
}
class AXIS extends Bank{
    float getRateOfInterest(){
        return 7.5f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 8.5f;
    }
}
