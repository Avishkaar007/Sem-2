//Lab7 -Practise Set 1
import java.io.*;
public class CatchExample {
    public static void main(String [] args){
        try{
          
            FileReader f=new FileReader("myFile.txt");
          
            //Un-comment next line to see a file not found exception block
            // f=new FileReader("text.txt");
            BufferedReader br=new BufferedReader(f);
            int temp=br.read();
            while(temp!=-1){
                System.out.print((char)temp);
                temp=br.read();
            }
            f.close();
        }
        
        
        catch(IndexOutOfBoundsException e){
            System.out.println("Index Out of Bound Exception block ");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found Exception");
        }
        catch(Exception e){
            System.out.println("This is general exception ");
        }
        // Uncomment next lines to see unreachable error
        // catch(IOException e){
        //     System.out.println("This line won't be reached ");
        // }

    }
}
