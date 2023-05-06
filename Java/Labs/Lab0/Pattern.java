
// Practise Set 5
public class Pattern {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}

