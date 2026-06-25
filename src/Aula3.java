import java.util.Scanner;

public class Aula3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDias = scanner.nextInt();

        int anos = totalDias / 365;
        int sobraDias = totalDias % 365;
        int meses = sobraDias / 30;
        int dias = sobraDias % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        scanner.close();
    }
}