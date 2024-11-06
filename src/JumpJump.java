import java.util.Scanner;

public class JumpJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int last = -1;
        int count = 0;
        while ((n=scanner.nextInt())!=-1) {
            if (last == -1) {
                last = n;
                continue;
            };

            if (last < n) {
                count++;
            }

            last = n;
        }

        System.out.println(count);
    }
}
