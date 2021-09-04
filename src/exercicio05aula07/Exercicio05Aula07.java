package exercicio05aula07;

import java.util.Scanner;

public class Exercicio05Aula07 {

    public static void main(String[] args) {
//      ---------- EXERCÍCIO DE REVISÃO 04 ----------
//      Construa em Java, um programa que receba a idade de um grupo de 
//      pessoas e calcule a média entre elas. 
//      O programa deve ser encerrado caso receba um valor negativo e o 
//      valor negativo não entra no cálculo da média.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        double idade = input.nextDouble();
        
        double somaidades = 0; // <-- vai somar de todas as idades
        double contador = 0; //<<-- para contar quantas vezes repetiu
        
        while (idade >= 0) { // <<<---- só para se receber valor negativo!
          somaidades = somaidades + idade; // <-- somando as idades aqui
          contador++; //<-- incrementa o contador em +1
          System.out.println("Digite a idade: "); //<-- repete a pergunta
          idade = input.nextInt(); //<-- pega o valor de outra idade
        }
        
        // o if/else só vai executar quando o while acabar (quando for lançado
        // um valor negativo)
        if (contador > 0) {
            System.out.println("A soma das idades é: " + somaidades);
            double media = (somaidades / contador); //calcula a media
            System.out.println("A média das idades é: " + media); 
        }
        else {
          System.out.println("impossível calcular");
        }
        
        input.close(); //termina o Scanner.


    }
    
}
