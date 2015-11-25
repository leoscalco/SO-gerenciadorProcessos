/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentodeprocesso;

import java.util.logging.Level;
import java.util.logging.Logger;

    
public class Processo {
    
      private String nome;
      private long tempoProcessado;
      private long quantum;
    
    public Processo(int i, long q){
        this.tempoProcessado = 0;
        this.setNome("Processo"+i);
        this.setQuantum(q);
        
       
    }
    
    public void processar(){
        tempoProcessado += quantum;
        System.out.println(nome + " esta processando");
        System.out.println(nome + " processour por " + tempoProcessado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTempoProcessado() {
        return tempoProcessado;
    }

    public void setTempoProcessado(long tempoProcessado) {
        this.tempoProcessado = tempoProcessado;
    }

    public long getQuantum() {
        return quantum;
    }

    public void setQuantum(long quantum) {
        this.quantum = quantum;
    }  
    
}
