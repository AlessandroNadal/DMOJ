import java.util.Scanner;

public class PedraPaperTisora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player1 = 0;
        int player2 = 0;

        String play;
        while (!(play=scanner.nextLine()).equals("END")) {
            switch (play) {
                case "#@", "%#", "@%" -> player1++;
                case "@#", "#%", "%@" -> player2++;
            }
        }
        if (player1 == player2) {
            System.out.println("-");
        } else {
            System.out.println(player1 > player2 ? "1" : "2");
        }
    }
}
