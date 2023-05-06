import java.io.*;
public class CopyFileExample {
    public static void main(String [] args){
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        if(args.length==2){
            System.out.println("Input Filename: "+args[0]);
            System.out.println("Output Filename: "+args[1]);
        }
        try {
            fin=new FileInputStream(args[0]);
            fout=new FileOutputStream(args[1]);
            do{
                i=fin.read();
                if(i!=-1){
                fout.write(i);
                }
            }while(i!=-1);   
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch(IOException e){
            System.out.println("Reading or Writing not possible");
        }
        System.out.println("File Copy Successful");
    }
}

/* PS D:\ANDC\Sem-2\Java\Lab8\Program1> java CopyFileExample copyFrom.txt copyTo.txt
Input Filename: copyFrom.txt
Output Filename: copyTo.txt
File Copy Successfull */