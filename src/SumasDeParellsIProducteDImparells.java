import java.util.Scanner;

public class SumasDeParellsIProducteDImparells {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int even = 0;
        int odd = 1;
        int count = 0;

        int n;
        while ((n=scanner.nextInt())!=-1) {
            count++;
            if (n % 2 == 0) {
                even += n;
            } else {
                odd *= n;
            }
        }

        System.out.println(even);
        System.out.println(odd);
        System.out.println(count);
    }
}
