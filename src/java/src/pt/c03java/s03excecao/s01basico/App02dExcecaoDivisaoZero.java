package pt.c03java.s03excecao.s01basico;

import java.util.Scanner;

public class App02dExcecaoDivisaoZero
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numerador: ");
        String xs = teclado.nextLine();
        
        System.out.print("Digite o denominador: ");
        String ys = teclado.nextLine();
        
        teclado.close();

        // catch mais específico -> mais genérico
        try {
            int x = Integer.parseInt(xs),
                y = Integer.parseInt(ys);
        
            int divisao = x / y;
            System.out.println("Resultado da divisao: " + divisao);
        } catch (NumberFormatException erro) {
            System.err.println("Erro na conversao: " + erro.getMessage());
        } catch (Exception erro) {
            System.err.println("Outro erro: " + erro.getMessage());
        }

}
}
