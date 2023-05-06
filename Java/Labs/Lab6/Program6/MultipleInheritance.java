//Practise 5
public class MultipleInheritance {
    public static void main(String [] args){
    Marksheet obj=new Marksheet("Mohan Das");
        System.out.println(obj.name+" have opted following subjects in 10th ");
        for (String string : obj.subjects10) {
            System.out.print(" "+string+" ");
        }
    } 
}

interface Class10{
    String[] subjects10={"Hindi","English","Science","Mathematics","Social Science"};
}
interface Class12 {
    String stream="Science";
    String[] subjects12={"Physics","Chemistry","Mathematics ","English","CS"};
}

class Marksheet implements Class10,Class12{
    String name;
    Marksheet(String name){
        this.name=name;
    }

    
}