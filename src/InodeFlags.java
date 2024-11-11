import java.util.HashMap;
import java.util.Scanner;

public class InodeFlags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {
                "EXT4_SECRM_FL",
                "EXT4_UNRM_FL",
                "EXT4_COMPR_FL",
                "EXT4_SYNC_FL",
                "EXT4_IMMUTABLE_FL",
                "EXT4_APPEND_FL",
                "EXT4_NODUMP_FL",
                "EXT4_NOATIME_FL"
        };

        int num = scanner.nextInt();
        for (int i = 7; i >= 0; i--) {
            int val = (int) Math.pow(2, i);
            if (num - val >= 0) {
                num -= val;
                System.out.println(names[i]);
            }
        }
    }
}
