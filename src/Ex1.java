public class Ex1 {
    public static void main(String[] args) {
        int indice = 13;
        int Soma = 0;
        int K = 0;
        while (K < indice){
            K = K + 1;
            Soma = Soma + K;
        }
        System.out.println("O valor da soma será de: " + Soma);
    }
}
// Neste exercicio, é basicamente somada os 13 primeiros numeros da seguinte forma, no primeiro loop k está valendo 0
// então a leitura ficaria 0 = 0 + 1, sendo assim K = 1, ai após isso vem a soma que por enquanto está valendo 0
// 0 = 0 + 1, sendo assim agora, a soma igual a 1.

// na segunda iteração os valores já são diferentes, com o k valendo 1, agora os valores serão outros.
// primeira formula ficaria k = 1 + 1, k agora vale portanto, 2.
// segunda formula ficaria soma = 2 + 1, soma agora vale 3.


//basicamente, conforme o k vai aumentando um numero, a soma pega o numero anterior e soma com o numero atual
// k e soma
// 1 ; 1
// 2 ; 3
// 3 ; 6
// 4 ; 10
// 5 ; 15
// 6 ; 21
//e por ai vai.
//iteração 3    numAnterior = 1; numAtual = 2   proximo numero é o resultado de 1 + 2 , agora fica anterior = 1 e atual = 3
// finalizando assim o loop.