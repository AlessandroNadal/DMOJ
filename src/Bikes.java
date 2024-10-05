import java.util.Scanner;


class Bike {
    int speed;

    public Bike(int speed) {
        this.speed = speed;
    }
}

class Race {
    Bike[] bikes;

    public Bike fastest() {
        Bike fastestBike = null;
        for (Bike bike : bikes) {
            if (fastestBike == null) {
                fastestBike = bike;
                continue;
            }

            if (bike.speed > fastestBike.speed) {
                fastestBike = bike;
            }
        }
        return fastestBike;
    }
}

public class Bikes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Race race = new Race();

        int numBikes = scanner.nextInt();

        race.bikes = new Bike[numBikes];

        for (int i = 0; i < numBikes; i++) {
            race.bikes[i] = new Bike(scanner.nextInt());
        }

        Bike fastest = race.fastest();

        System.out.println(fastest == null ? "No bikes" : fastest.speed);
    }
}
