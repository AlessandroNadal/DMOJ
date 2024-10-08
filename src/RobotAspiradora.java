import java.util.Scanner;

public class RobotAspiradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (scanner.next().equals("CLEAN")) count++;
        System.out.println(count);
    }
}
