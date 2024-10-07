import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class FunctionGame2 {
    public boolean function1(int param) {
        return param == 2 || param == 10;
    }

    public boolean function2(float param) {
        return param >= 0;
    }

    public String function3(int param1, String param2) {
        String s = "";
        for (int i = 0; i < param1; i++) {
            s += param2;
        }

        return s;
    }

    public int function4(int[] param) {
        int sum = 0;
        for (int i : param) {
            sum += i;
        }

        return sum;
    }

    public int[] function5(int[] param) {
        return Arrays.stream(param).map(x -> x*2).toArray();
    }


    public String[] function6(int param1, boolean param2) {
        ArrayList<String> s = new ArrayList<>(param1);
        for (int i = 0; i < param1; i++) {
            s.add(param2 ? "cierto" : "falso");
        }

        return s.toArray(new String[0]);
    }

    public int function7(String[] param) {
        int amount = 0;
        for (String string : param) {
            if (string.equals("java")) amount++;
        }

        return amount;
    }

    public int[] function8(int param1, int param2, int param3) {
        int[] a = {param1, param2, param3};
        Arrays.sort(a);
        return a;
    }
}

public class FunctionGame2Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FunctionGame2 fg2 = new FunctionGame2();

        String functionName = scanner.next();

        switch (functionName) {
            case "function1":
                for (int i = 5; i-- > 0; ) {
                    int param = scanner.nextInt();
                    boolean returnValue = fg2.function1(param);
                    System.out.println(param + " -> " + returnValue);
                }
                break;
            case "function2":
                for (int i = 6; i-- > 0; ) {
                    float param = scanner.nextFloat();
                    boolean returnValue = fg2.function2(param);
                    System.out.println(param + " -> " + returnValue);
                }
                break;
            case "function3":
                for (int i = 4; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    String param2 = scanner.next();
                    String returnValue = fg2.function3(param1, param2);
                    System.out.println(param1 + "," + param2 + " -> " + returnValue);
                }
                break;
            case "function4":
                for (int i = 4; i-- > 0; ) {
                    int size = scanner.nextInt();
                    int[] param = new int[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.nextInt();
                    }
                    int returnValue = fg2.function4(param);
                    System.out.println(Arrays.toString(param) + " -> " + returnValue);
                }
                break;
            case "function5":
                for (int i = 4; i-- > 0; ) {
                    int size = scanner.nextInt();
                    int[] param = new int[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.nextInt();
                    }
                    int[] returnValue = fg2.function5(param);
                    System.out.println(Arrays.toString(param) + " -> " + Arrays.toString(returnValue));
                }
                break;
            case "function6":
                for (int i = 4; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    boolean param2 = scanner.nextBoolean();
                    String[] returnValue = fg2.function6(param1, param2);
                    System.out.println(param1 + "," + param2 + " -> " + Arrays.toString(returnValue));
                }
                break;
            case "function7":
                for (int i = 5; i-- > 0; ) {
                    int size = scanner.nextInt();
                    String[] param = new String[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.next();
                    }
                    int returnValue = fg2.function7(param);
                    System.out.println(Arrays.toString(param) + " -> " + returnValue);
                }
                break;
            case "function8":
                for (int i = 9; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    int param2 = scanner.nextInt();
                    int param3 = scanner.nextInt();
                    int[] returnValue = fg2.function8(param1, param2, param3);
                    System.out.println(param1 + "," + param2 + "," + param3 + " -> " + Arrays.toString(returnValue));
                }
                break;
        }
    }
}
