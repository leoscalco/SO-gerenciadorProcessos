/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentodeprocesso;


import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author willi
 */
public class GerenciamentoDeProcesso {

    static int counter = 0;   
    static long quantum = 1000;
    static int n = 3;
    static long delay = 2500;
    static double chanceBloqueado = 50;
    static double chanceBloqueadoParaPronto = 50;
    
    
    
   

    public static void main(String[] args) throws InterruptedException {  
        
        List<Processo> prontos = new LinkedList<Processo>();
        List<Processo> bloqueados = new LinkedList<Processo>();
        for(int i = 0; i<n; i++){
            Processo processo = new Processo(i,quantum);
            prontos.add(processo);
        }
        
       while(true){
           if(!bloqueados.isEmpty()){
              double i = Math.random();
              if(i > (chanceBloqueadoParaPronto/100)){
                  setarPronto(bloqueados.remove(0), prontos);
              }
          
          }
           
          if(!prontos.isEmpty()){
                Processo processo = prontos.remove(0);
                processo.processar();
               
                double i =  Math.random();
              
                if(i > (chanceBloqueado/100) ){                    
                    setarPronto(processo,prontos);
                }
                else{
                    setarBloqueado(processo,bloqueados);
                }          
          }
          else{
              System.out.println("Nenhum processo pronto");
          }
          
          
            Thread.sleep(delay);            
       } 
    
  }
    
    public static void setarPronto(Processo processo, List<Processo> lista){
                lista.add(processo);
                System.out.println(processo.getNome() + " está pronto");
    }
    
    public static void setarBloqueado(Processo processo, List<Processo> lista){
            lista.add(processo);
            System.out.println(processo.getNome() + " está bloqueado");
    }
    
       
    
    
}
