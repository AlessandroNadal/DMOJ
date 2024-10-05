import java.util.Scanner;

public class MaximaPuntuacio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int points = -1;
        for (int i = 0; i < 6; i++) {
            String currentName = scanner.next();
            int currentPoints = scanner.nextInt();

            if (currentPoints > points) {
                name = currentName;
                points = currentPoints;
            }
        }

        System.out.println(name + " " + points);
    }
}
