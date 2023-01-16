import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println(A);
        for (int i = 0; i < 5; i++) {
            B.add(scanner.nextLine());

        }
        System.out.println(B);
        Collections.reverse(B);
        System.out.println(B);

        Integer i = 0;
        while (C.size() < A.size() + B.size()) {
            C.add(A.get(i));
            C.add(B.get(i));

            i++;
        }
        C.add(A.get(0));
        C.add(A.get(1));
        System.out.println(C);


    }
}