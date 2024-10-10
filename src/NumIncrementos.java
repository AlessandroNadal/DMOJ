import java.util.Scanner;

public class NumIncrementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int count = 0;
        int last = -1;
        while ((n=scanner.nextInt())!=0) {
            if (last == -1){
                last = n;
                continue;
            }

            if (n>last) {
                count++;
            }

            last = n;
        }
        System.out.println(count);
    }
}
