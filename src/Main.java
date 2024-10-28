public class Main {
    public static void main(String[] args) {
        System.out.println(switch (1) {
            case 0 -> "asd";
            case 1 -> "foo";
            default -> "";
        });
    }
}