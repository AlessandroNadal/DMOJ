import java.util.Scanner;

class Equation {
    float a;
    float b;
    float x;

    public void calculateSolution() {
        x = b / a * -1;
    }
}


public class EquationSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Equation equation = new Equation();

        while((equation.a = scanner.nextFloat()) != 0) {
            equation.b = scanner.nextFloat();

            equation.calculateSolution();
            System.out.format("%.2f * %.2f + %.2f = 0%n", equation.a, equation.x, equation.b);
        }
    }
}
