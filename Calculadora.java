import java.util.Scanner;

/**
 * Calculadora
 */
public class Calculadora {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char opcao;

    do{
        System.out.println("\n\nEscolha qual opreação deseja realizar");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz quadrada");
        System.out.println("Q. Sair");

        opcao = scanner.next().charAt(0);
        if (opcao == 'Q' || opcao =='q') {
            break;
        }
        System.out.println("Digite o primeiro numero:");
            double numero1 = scanner.nextDouble();
            if (opcao != '6') {
                System.out.println("Digite o segundo numero:");
                double numero2= scanner.nextDouble();
                switch (opcao) {
                    case 1:
                    System.out.println("Resultado: " +adicao(numero1, numero2));        
                    break;
                
                    case 2:
                    System.out.println("Resultado: " + subtracao(numero1, numero2));
                    break;

                    case 3:
                    System.out.println("Resultado: " + divisao(numero1, numero2));
                        if (numero2 == 0) {
                    System.out.println("Nao é possivel realizar divisão por 0");
                    break;

                        }
                    case 4:
                    System.out.println("Resultado: " + multiplicacao(numero1, numero2));
                    break;

                    case 5:
                    System.out.println("Resultado: " + potencia(numero1, numero2));
                    break;

                }
            }
        else{
            if (numero1 <0) {
                System.out.println("Não existe raiz de numero negativo");
            }
            else {
                System.out.println("Resultado: "+ raizQuadrada(numero1));
            }
        }
        
    } while (true); {
        System.out.println("Prigrama encerrado");
        scanner.close();
    }
}
public static double adicao(double num1, double num2){
    return num1+num2;
}

public static double subtracao(double num1, double num2){
    return num1 - num2;
}

public static double divisao(double num1, double num2){
    return num1/num2;
}

public static double multiplicacao(double num1, double num2){
    return num1*num2;
}

public static double raizQuadrada(double num){
    return num=Math.sqrt(num);
}

public static double potencia(double num1, double num2){
    return Math.pow(num1, num2);
}
}

