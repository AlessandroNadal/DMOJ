import java.util.Scanner;

class Student {
    public String name;
    public float mark;

    Student(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        Student min = null;
        Student max = null;
        float sum = 0;
        for (int i = 0; i < amount; i++) {
            Student student = new Student(scanner.next(), scanner.nextFloat());

            if (min == null || min.mark > student.mark) {
                min = student;
            }
            if (max == null || student.mark > max.mark) {
                max = student;
            }

            sum += student.mark;
        }

        System.out.println("L'alumne amb major nota és el/la " + max.name + " amb un " + max.mark);
        System.out.println("L'alumne amb menor nota és el/la " + min.name + " amb un " + min.mark);
        System.out.println("La nota mitjana de la classe és de " + (sum / amount));;
    }
}
