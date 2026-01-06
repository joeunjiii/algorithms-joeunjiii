import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        
        long A = next.nextLong();
        long B = next.nextLong();
        long C = next.nextLong();
        
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}