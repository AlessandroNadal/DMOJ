import java.util.Scanner;


class Author {
    String name;
    String photoURL;
}

class PostSream {
    Author author;
    String content;
}

class Stream {
    PostSream[] posts;
}

public class PostsStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nPosts = scanner.nextInt();

        Stream stream = new Stream();

        stream.posts = new PostSream[nPosts];

        for (int i = 0; i < nPosts; i++) {

            // escriu aqui el codi

            stream.posts[i].author.name = scanner.next();
            stream.posts[i].author.photoURL = scanner.next();
            stream.posts[i].content = scanner.next() + scanner.nextLine();
        }

        for (int i = 0; i < nPosts; i++) {
            System.out.println(stream.posts[i].author.name);
            System.out.println(stream.posts[i].content);
            System.out.println("------------------------------");
        }
    }
}
