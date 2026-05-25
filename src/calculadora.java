
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        double n1,n2,resultado;
        int op =0;

        while(op != 5){
            System.out.println("-----CALCULADORA-----");

            System.out.println("Digite o primeiro nùmero:");
            n1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            n2 = scanner.nextDouble();

            System.out.printf("\n Escolha a operação:");
            System.out.printf("\n 1-soma");
            System.out.printf("\n 2-subtração");
            System.out.printf("\n 3-multiplicação");
            System.out.printf("\n 4-divisão");
            System.out.printf("\n 5-sair");
            System.out.printf("\n Opção: ");
            op = scanner.nextInt();

            if(op ==5){
                System.out.println("Encerrando calculadora...");
                break; }

                switch(op) {
                    case 1:
                        resultado = n1 + n2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 2:
                        resultado = n1 - n2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 3:
                        resultado = n1 * n2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 4:
                        if (n2 != 0) {
                            resultado = n1 / n2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Erro:divisão por zero!");
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!");


                }
        }
    }
}
