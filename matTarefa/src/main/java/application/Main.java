/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author Davi Erick Lagares de Oliveira <davierick999@gmail.com>
 * @date 01/05/2024
 * @brief Class Program
 */
import entities.Formula;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        
        do {
            System.out.println("Pressione 1 para inserir valores - 6 números");
            System.out.println("Pressione 2 parad Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt(); 
            sc.nextLine();

           
            

                if(opcao == 1){

                    System.out.print("Informe o valor de x1: ");
                    double x1 = sc.nextDouble();
                    System.out.print("Informe o valor de y1: ");
                    double y1 = sc.nextDouble();
                    System.out.print("Informe o valor de x2: ");
                    double x2 = sc.nextDouble();
                    System.out.print("Informe o valor de y2: ");
                    double y2 = sc.nextDouble();
                    System.out.print("Informe o valor de x3: ");
                    double x3 = sc.nextDouble();
                    System.out.print("Informe o valor de y3: ");
                    double y3 = sc.nextDouble();
                    Formula jogo2D = new Formula(x1, y1, x2, y2, x3, y3);
                    jogo2D.calcularDet();
                    jogo2D.verificarDistancia();

                   
                }
                if(opcao ==2){

                    System.out.println("Saindo..."); // Saída do programa.
                    break;
                }
                else{
                    System.out.println("Opção inválida!"); //Opção inválida.
                }
            
            
        } while (opcao != 2); //  O programa termina quando o usuário escolhe a opção 2.

        sc.close();
    }

}