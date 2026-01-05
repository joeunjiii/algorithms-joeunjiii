import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int y = in.nextInt();
        
        if(y >= 1000 && y <= 3000) {
            y = y - 543;
        }
        
        System.out.print(y);
        
    }
}