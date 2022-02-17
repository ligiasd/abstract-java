package Application;

import entities.Senha;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua senha :");
        String novaSenha = entrada.next();
        Senha senha = new Senha(novaSenha);
        entrada.close();



    }
}
