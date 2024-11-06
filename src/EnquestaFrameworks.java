import java.util.Scanner;

public class EnquestaFrameworks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvingut a l'enquesta.\n" +
                "Coneixes algun framework?");
        String ans = scanner.next();
        if (ans.equals("si")) {
            System.out.println("Quin?");
            System.out.println("S'ha registrat la resposta: " + scanner.next());
        }
        System.out.println("Gracies per contestar");
    }
}
