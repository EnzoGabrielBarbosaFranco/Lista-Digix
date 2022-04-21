import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Qual palavra você deseja inverter?");
        Scanner leitor = new Scanner(System.in);
        String str = leitor.next();
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println(str);
    }
}
