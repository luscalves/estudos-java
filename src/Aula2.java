import java.util.Scanner;

public class Aula2 {
    public static void main (String[] args){
        double salario, calculoPorcentagem = 0;
        int porcentagem = 0;
        Scanner scanner = new Scanner(System.in);

        salario = scanner.nextDouble();
        porcentagem = scanner.nextInt();
        switch(porcentagem){
            case 1:
                calculoPorcentagem = salario * 0.30;
                break;
            case 2:
                calculoPorcentagem = salario * 0.15;
                break;
            case 3:
                calculoPorcentagem = salario * 0.5;
            default:
                System.out.println("Por favor, selecione um número de 1 a 3");
                break;
        }

        System.out.println("a porcentagem do seu salario eh: " + calculoPorcentagem);
    }
}
