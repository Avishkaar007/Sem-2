//Practise Set 2

public class StringDemo {

    public static int getLength(String str){
        return str.length();

    }
    
    public static void main (String args[]){
        String du="Delhi University";
        String andc= "Acharya Narendra Dev College" ;
        String pushpa="Pushpa";
        String kgf="KGF";
        String dev="Dev";
        String delhi="New Delhi";
        System.out.println("Length of string \"Delhi University\" is "+getLength( du));

        System.out.println("First occurence of 'U' is at index "+du.indexOf('U'));

        System.out.println("Char at index 7 is "+du.charAt(7));
        
        System.out.println( "\"Pushpa\" and \"KGF\" "+pushpa.compareTo(kgf));
        System.out.println( "\"Pushpa\" and \"Pushpa\" "+pushpa.compareTo(pushpa));
        System.out.println( "\"KGF\" and \"Pushpa\" "+kgf.compareTo(pushpa));
        System.out.println("'Acharya Narendra Dev College' contains 'Dev' "+ andc.contains(dev));
        System.out.println(andc.replace("Acharya Narendra Dev","AND"));
        System.out.print("Original : "+delhi+", After lowercase : "+ delhi.toLowerCase()+", UpperCase : "+delhi.toUpperCase());
    }
    
}
    