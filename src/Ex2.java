import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci (Digite -1 para sair):");
            int numero = sc.nextInt();

            if(numero == -1){
                System.out.println("Calculadora encerrada");
                break;
            }
            if (Fibonacci(numero)){
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");

            }else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci. Tente outro.");
            }
        }
    }

    public static boolean Fibonacci(int num){
        if (num == 0 || num == 1){
            return true;
        }
        int numAnterior = 0;
        int numAtual = 1;
        while (numAtual < num){
            int numTemporario = numAtual;
            numAtual += numAnterior;
            numAnterior = numTemporario;
        }
        return numAtual == num;
    }
}
//A função pertenceFibonacci iniciará com dois valores: anterior = 0 e atual = 1
//que são os dois primeiros números da sequência de Fibonacci.
// com o numero selecionado 3 ficaria assim
//iteração 1    numAnterior = 0; numAtual = 1   proximo numero é o resultado de 0 + 1 , agora fica anterior = 1 e atual = 1
//iteração 2    numAnterior = 1; numAtual = 1   proximo numero é o resultado de 1 + 1 , agora fica anterior = 1 e atual = 2
