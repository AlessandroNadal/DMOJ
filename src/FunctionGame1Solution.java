import java.util.Scanner;

class FunctionGame1 {
    public int function1(int param) {
        return param + 1;
    }

    public int function2(int param) {
        return param - 3;
    }

    public int function3(int param) {
        return param * 10;
    }

    public int function4(int param) {
        return Math.max(2 * param - 1, 1);
    }

    public int function5(int param) {
        return 6;
    }

    public int function6(int param1, int param2) {
        return param1 + param2;
    }

    public int function7(int param1, int param2) {
        return Math.max(param1, param2);
    }

    public int function8(int param1, int param2, int param3) {
        return Math.min(param1, Math.min(param2, param3));
    }
}

public class FunctionGame1Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FunctionGame1 functionGame1 = new FunctionGame1();

        String functionName = scanner.next();

        if ("function1".equals(functionName)) {
            for (int i = 5; i-- > 0; ) {
                int param = scanner.nextInt();
                int returnValue = functionGame1.function1(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if ("function2".equals(functionName)) {
            for (int i = 5; i-- > 0; ) {
                int param = scanner.nextInt();
                int returnValue = functionGame1.function2(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if ("function3".equals(functionName)) {
            for (int i = 5; i-- > 0; ) {
                int param = scanner.nextInt();
                int returnValue = functionGame1.function3(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if ("function4".equals(functionName)) {
            for (int i = 5; i-- > 0; ) {
                int param = scanner.nextInt();
                int returnValue = functionGame1.function4(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if ("function5".equals(functionName)) {
            for (int i = 5; i-- > 0; ) {
                int param = scanner.nextInt();
                int returnValue = functionGame1.function5(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if ("function6".equals(functionName)) {
            for (int i = 5; i-- > 0; ) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int returnValue = functionGame1.function6(param1, param2);
                System.out.println(param1 + "," + param2 + " -> " + returnValue);
            }
        } else if ("function7".equals(functionName)) {
            for (int i = 7; i-- > 0; ) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int returnValue = functionGame1.function7(param1, param2);
                System.out.println(param1 + "," + param2 + " -> " + returnValue);
            }
        } else if ("function8".equals(functionName)) {
            for (int i = 7; i-- > 0; ) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int param3 = scanner.nextInt();
                int returnValue = functionGame1.function8(param1, param2, param3);
                System.out.println(param1 + "," + param2 + "," + param3 + " -> " + returnValue);
            }
        }
    }
}
