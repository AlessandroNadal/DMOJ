import java.util.Scanner;

class Clock {
    int hours;
    int minutes;
    int seconds;

    public void reset() {
        seconds = 0;
        minutes = 0;
        hours = 0;
    }

    public void tick() {
        seconds += 1;

        minutes += seconds / 60;
        seconds %= 60;
        hours += minutes / 60;
        minutes %= 60;
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

public class ClockSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock();

        int t;
        while ((t = scanner.nextInt()) != -1) {
            if (t == 0) clock.reset();
            else for (int i = 0; i < t; i++) clock.tick();
            System.out.println(clock.getTime());
        }
    }
}
