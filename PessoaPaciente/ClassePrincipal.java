//By Yure Pablo em 08/07/2016

package pessoa_paciente;

import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {
     
        int x; String nome; int idade; double peso,altura; Pessoa p1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 1 para criar Pessoa "
                + "ou 2 para criar Paciente: ");
        x = sc.nextInt();
        nome = sc.nextLine(); //Controla bug de leitura de caracteres
        
        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        
        System.out.println("Informe a idade: ");
        idade = sc.nextInt();
        
        switch (x){
            case 1:
                p1 = new Pessoa(nome,idade);
                System.out.println("-------------");
                p1.imprimir();
                System.out.println("-------------");
                break;
            case 2: 
                System.out.println("Infome o peso: ");
                peso = sc.nextDouble();
                System.out.println("Informe a altura: ");
                altura = sc.nextDouble();
                p1 = new Paciente(peso,altura,nome,idade);
                System.out.println("---------------------");
                p1.imprimir();
                System.out.println("---------------------");
                break;
        }      
    } 
}
