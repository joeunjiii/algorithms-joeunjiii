import java.io.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        int b1 = B % 10;
        int b2 = (B/10) % 10;
        int b3 = B / 100;
        
        System.out.println(A * b1);
        System.out.println(A * b2);
        System.out.println(A * b3);
        System.out.println(A * B);
    }
}