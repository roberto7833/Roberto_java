package sistemas.adivinha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adivinha {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Numero de Tentativas: ");
        int maxNum = Integer.parseInt(leitor.nextLine());
        int pontos = 100;
        int tentativas = 0;
        int y = sorteiaNumero(maxNum);
        boolean achou = false;
        List<Integer> numerosDigitados = new ArrayList<>();
        while(!achou){
            System.out.print("Digite um numero: ");
            int numero = Integer.parseInt(leitor.nextLine());
            tentativas ++;
            numerosDigitados.add(numero);
            if(numero==y){
                System.out.println("Parabéns, Voçê acertou" +
                        "\nNumero de Tentativas "+tentativas+
                        "\nPontos "+pontos+
                        "\nUltimo numero digitado "+numero+
                        "\nNumeros digitados "+numerosDigitados);
                achou = true;
            }else{
                System.out.println("ERROU! tente novamente");
                pontos-=2;
                if(numero<y){
                    System.out.println("Eh maior"+
                            "\nNumeros digitados "+numerosDigitados);
                }else{
                    System.out.println("Eh menor"+
                            "\nNumeros digitados "+numerosDigitados);
                }
            }
        }
        leitor.close();
    }
    public static int sorteiaNumero(int numeroMaximo){
        int x = (int) (Math.random() * numeroMaximo+1);
        return x;
    }
}
