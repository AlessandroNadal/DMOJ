import java.util.Scanner;

class GearBox {
    int gear = 0;
    int numGears;

    void show(){
        System.out.print("Current gear: ");

        switch (gear){
            case -1:
                System.out.println("R");
                break;
            case 0:
                System.out.println("N");
                break;
            default:
                System.out.println(gear);
        }
    }

    public void gearUp() {
        if (gear == numGears) {
            return;
        }

        gear++;
    }

    public void gearDown() {
        if (gear == -1) {
            return;
        }

        gear--;
    }
}

public class GearBoxSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GearBox gearBox = new GearBox();
        gearBox.numGears = scanner.nextInt();
        scanner.nextLine();

        String action;
        while(!(action = scanner.nextLine()).equals("__END__")){
            switch (action){
                case "UP":
                    gearBox.gearUp();
                    break;
                case "DOWN":
                    gearBox.gearDown();
                    break;
            }
            gearBox.show();
        }
    }
}
