import java.util.Scanner;

public class StreetFighter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String state = scanner.next();
        String event = scanner.next();
        System.out.println(
                switch (state) {
                    case "IDLE" -> switch (event) {
                        case "PUNCH_KEY" -> "PUNCHING";
                        case "KICK_KEY" -> "KICKING";
                        case "JOYSTICK_UP" -> "JUMPING";
                        case "JOYSTICK_LEFT/RIGHT" -> "WALKING";
                        default -> "IDLE";
                    };
                    case "PUNCHING", "KICKING" -> switch (event) {
                        case "PUNCH_END", "KICK_END" -> "IDLE";
                        default -> state;
                    };
                    case "JUMPING" -> switch (event) {
                        case "TOUCH_FLOOR" -> "IDLE";
                        case "PUNCH_KEY" -> "PUNCHING";
                        case "KICK_KEY" -> "KICKING";
                        default -> "JUMPING";
                    };
                    case "WALKING" -> switch (event) {
                        case "PUNCH_KEY" -> "PUNCHING";
                        case "KICK_KEY" -> "KICKING";
                        case "JOYSTICK_CENTER" -> "IDLE";
                        case "JOYSTICK_UP" -> "JUMPING";
                        default -> "WALKING";
                    };
                    default -> "";
                });
    }
}
