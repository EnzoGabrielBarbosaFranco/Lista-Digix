import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
        }
        String x = "25";
        int y;

        y = Integer.parseInt(x);
        System.err.println("Sua String convertida em número é: " + y);
    }
}
