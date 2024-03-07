import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase para inverter:");
        String entrada = sc.nextLine();

        String inversao = inverterString(entrada);

        System.out.println("String original: " + entrada);
        System.out.println("String invertida: " + inversao);
    }


    public static String inverterString(String str) {

        if (str == null || str.isEmpty()) {  // Aqui  Verifico se a string é nula ou vazia
            return str;
        }
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }
}