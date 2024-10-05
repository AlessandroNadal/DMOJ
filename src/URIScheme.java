import java.util.*;

class URL {
    String protocol;
    String domain;
    String path;
    String query;
    String fragment;

    @Override
    public String toString() {
        return protocol + "://" + domain + path + "?" + query + "#" + fragment;
    }
}

public class URIScheme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        URL url = new URL();

        url.protocol = scanner.nextLine();
        url.domain = scanner.nextLine();
        url.path = scanner.nextLine();
        url.query = scanner.nextLine();
        url.fragment = scanner.nextLine();

        System.out.println(url);
    }
}
