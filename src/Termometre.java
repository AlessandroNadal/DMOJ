import java.util.Scanner;

class Thermometer {
    float celsius;

    public void printCelsius() {
        System.out.printf("%.2fC\n", celsius);
    }

    public void printFahrenheit() {
        System.out.printf("%.2fF\n", (celsius * 9/5) + 32);
    }

    public void printKelvin() {
        System.out.printf("%.2fK\n", celsius + 273.15);
    }
}


public class Termometre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Thermometer thermometer1 = new Thermometer();
        Thermometer thermometer2 = new Thermometer();

        float a, b;
        while((a = scanner.nextFloat()) >= -273.1f) {
            thermometer1.celsius = a;
            thermometer2.celsius = scanner.nextFloat();

            System.out.println("Termometre 1");
            thermometer1.printCelsius();
            thermometer1.printFahrenheit();
            thermometer1.printKelvin();

            System.out.println("Termometre 2");
            thermometer2.printCelsius();
            thermometer2.printFahrenheit();
            thermometer2.printKelvin();

            System.out.println("--------");
        }
    }
}
