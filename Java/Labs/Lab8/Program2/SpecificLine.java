import java.io.*;

public class SpecificLine {
    public static void main(String[] args) {
        String str;

        int i;
        if (args.length == 1) {
            System.out.println("Input Filename: " + "Text.txt");
        }
        try {
            FileReader fr = new FileReader("Text.txt");
            BufferedReader br = new BufferedReader(fr);
            str = br.readLine();
            while (str != null) {
                if ((str.charAt(0) == '/') && (str.charAt(1) == '/')) {
                    System.out.println(str.substring(2,str.length()));
                }
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Reading  not possible");
        }

    }
}
