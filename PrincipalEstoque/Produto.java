package principalestoque;

public class Produto {
   String nomeProduto; float preco; int estoque;
   
   Produto(String nomeProduto,float preco,int estoque){
       this.nomeProduto = nomeProduto;
       this.preco = preco;
       this.estoque = estoque;
   }

   public void setPreco(float preco){
       this.preco = preco;
       if (preco<0) this.preco = 0;
   }

   public void setEstoque(int estoque){
       this.estoque = estoque;
       if (estoque<0) this.estoque = 0;
   }
   
   public void adicionar(int quantidade){
       estoque = estoque+quantidade;
   }

   public boolean estáDisponivel(int quantidade){ //Java admite acentuação
       return estoque>=quantidade;
   }        

   public boolean remover(int quantidade){
        if (estáDisponivel(quantidade)==true) {
            estoque = estoque-quantidade;
            return estáDisponivel(quantidade);
        }
        else
           return false;        
   }

   public void imprimir(){
       System.out.println("Produto: "+nomeProduto);
       System.out.println("Preço: "+preco);
       System.out.println("Quantidade em estoque: "+estoque);
   }
}
