import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de IMC e Status de Treino ---");

        System.out.print("Digite o seu peso em kg (ex: 80,5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros (ex: 1,75): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Status: Abaixo do peso (Hora de focar no bulking e aumentar as calorias!)");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Status: Peso normal (Físico em dia, só manter o treino pesado e a creatina!)");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Status: Sobrepeso (Um leve cutting e cardio extra podem ser uma boa.)");
        } else {
            System.out.println("Status: Obesidade (Foco total na reeducação alimentar e constância nos treinos!)");
        }

        scanner.close();
    }
}