import java.util.Scanner;

public class RellotgeManilles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float hours = scanner.nextFloat();
        float minutes = scanner.nextFloat();
        float seconds = scanner.nextFloat();

        float hoursDegrees = hours / 12 * 360;
        float minutesDegrees = minutes / 60 * 360;
        float secondsDegrees = seconds / 60 * 360;

        minutesDegrees += secondsDegrees / 360 * 6;
        hoursDegrees += minutesDegrees / 360 * 30;

        System.out.println(hoursDegrees);
        System.out.println(minutesDegrees);
        System.out.println(secondsDegrees);
    }
}
