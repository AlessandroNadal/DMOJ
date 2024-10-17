import java.util.ArrayList;
import java.util.Scanner;

public class HanselIGretel {
    public static void displayMap(ArrayList<ArrayList<Character>> map) {
        for (ArrayList<Character> characters : map) {
            for (Character character : characters) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int y = 0;

        int rows = scanner.nextInt();
        scanner.nextLine();
        ArrayList<ArrayList<Character>> map = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            ArrayList<Character> row = new ArrayList<>();
            char[] line = scanner.nextLine().toCharArray();
            for (int j = 0; j < line.length; j++) {
                char c = line[j];
                row.add(c);

                if (c == 'H') {
                    x = j;
                    y = i;
                }
            }
            map.add(row);
        }

        displayMap(map);

        while (true) {
            int newX;
            int newY;
            map.get(y).set(x, ' ');
            if (map.get(y).get(x - 1) == '.') {
                newX = x - 1;
                newY = y;
                x--;
            } else if (map.get(y).get(x+1) == '.') {
                newX = x+1;
                newY = y;
                x++;
            } else  if (map.get(y-1).get(x) == '.'){
                newX = x;
                newY = y - 1;
                y--;
            } else if (map.get(y+1).get(x) == '.') {
                newX = x;
                newY = y+1;
                y++;
            } else {
                break;
            }
            map.get(newY).set(newX, 'H');

            displayMap(map);
        }
    }
}
