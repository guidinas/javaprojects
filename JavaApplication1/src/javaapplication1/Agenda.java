/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author guidi
 */
class Agenda {

    private Contato contatos[];
    


    Agenda(int i) {
        contatos = new Contato[i];
    }

    public boolean addContato(Contato novo) {
        for(int i=0; i<contatos.length;i++){
            if(contatos[i]==null){
                contatos[i] = novo;
                return true;
            }
        }
        return false;
       }

    public void exibirContatos() {
        for(int i = 0; i < contatos.length ; i++){
            if(contatos[i]!=null){
                contatos[i].mostrarInformacoes();
                System.out.println("================\n");
            }
        }
       } 
           
}
        
    

