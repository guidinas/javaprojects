/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laura;

/**
 *
 * @author guidi
 */
public class Produto {
    private float preco;
    private int quantidade;

    public Produto(float preco, int quantidade){
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void atualizaPreco(float preco){
        this.preco = preco;
    }
    public void visualiza(){
        System.out.println("O preço atual é "+ this.preco);
        System.out.println("A quantidade atual é de :" +this.quantidade + "unidades");
        float a;
        a = this.preco * this.quantidade;
        System.out.println(" O faturamento será de: R$ " + a );
    }
    public void adicionar(int quantidade){
        this.quantidade += quantidade;
        System.out.println("Adicionado ao estoque: "+ quantidade);
        System.out.println("Nova quantidade em estoque: " +this.quantidade);
    }
    public void vender(int quantidade){
        if(quantidade> this.quantidade){
            System.out.println("Venda não efetuada motivo:  ESTOQUE NEGATIVO ! ");
            System.out.println("Máximo permitido no momento é de: "+ this.quantidade);
        }
        else{
            this.quantidade = this.quantidade - quantidade;
            System.out.println("Venda efetuada com sucesso !");
            System.out.println("Novo estoque é de: "+ this.quantidade);
        }
    }

    
}
