//By Yure Pablo em 23/08/2016

package principalestoque;
import java.util.Scanner;

public class PrincipalEstoque {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nomeProduto; float preco; int estoque; int r; int quant;
        
        System.out.print("Informe o nome do produto: ");
        nomeProduto = sc.nextLine();
        System.out.print("Informe o preço do produto: ");
        preco = sc.nextFloat();
        System.out.print("Informe a quantidade em estoque: ");
        estoque = sc.nextInt();
        
        Produto x = new Produto(nomeProduto,preco,estoque);
        
        x.setPreco(preco); x.setEstoque(estoque);
        
        do{
            System.out.println();
            System.out.println("Operações: ");
            System.out.println("1: Adicionar ao estoque");
            System.out.println("2: Remover do estoque");
            System.out.println("3: Imprimir dados do produto");
            System.out.println("4: Criar novo produto");
            System.out.println("5: Sair do programa");
            System.out.print("Escolha: ");
            r = sc.nextInt();
            
            switch(r){
                case 1:
                    System.out.println();
                    System.out.print("Informe a quantidade que deseja adicionar: ");
                    quant = sc.nextInt();
                    x.adicionar(quant);
                    System.out.println("Procedimento realizado com sucesso!");
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Informe a quantidade que deseja remover: ");
                    quant = sc.nextInt();
                    if (x.remover(quant)==true)
                        System.out.println("Remoção realizada com sucesso!");
                     else
                        System.out.println("Não foi possível remover!");
                    break;
                case 3: 
                    System.out.println();
                    x.imprimir();
                    break;
                case 4:
                    nomeProduto = sc.nextLine();
                    System.out.println();
                    System.out.print("Informe o nome do produto: ");
                    nomeProduto = sc.nextLine();
                    System.out.print("Informe o preço do produto: ");
                    preco = sc.nextFloat();
                    System.out.print("Informe a quantidade em estoque: ");
                    estoque = sc.nextInt();
                    Produto y = new Produto(nomeProduto,preco,estoque);
                    y.setPreco(preco); y.setEstoque(estoque);
                    x = y;
                    break;
                case 5:
                    r = 5; break;
                default:
                    System.out.println("Instrução Inválida");
                    r = 0;
            } 
        } while (r<5);
        
    }
}
