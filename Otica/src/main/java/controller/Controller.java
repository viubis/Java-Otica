/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Olho;


/**
 *
 * @author victor
 */
public class Controller {

    private boolean prime;
    private boolean vision;
    
    public Controller(){
       
    }
     
    //metodo para verificacao
    public String verificacao( float cilindricoEsquerdo, float cilindricoDireito, float esfericoEsquerdo, float esfericoDireito){
        prime=false;
        vision=false;
        Olho olho = new Olho( cilindricoEsquerdo, cilindricoDireito, esfericoEsquerdo, esfericoDireito);
        if((esfericoEsquerdo >= -12.0 && esfericoEsquerdo <= -3.0) || 
                (esfericoDireito >= -12.0 && esfericoDireito <= -3.0) ){
           prime=true;
           if((cilindricoEsquerdo <= 0 && cilindricoEsquerdo>= -2.0) ||     
               (cilindricoDireito <= 0 && cilindricoDireito >= -2.0)){
                prime=false;
                if((esfericoEsquerdo >= -10.0 && esfericoEsquerdo <= -3.0) || 
                    (esfericoDireito >= -10.0 && esfericoDireito <= -3.0) ){
                    prime = true;
                }
            }
        }
        if((cilindricoEsquerdo <= 0 && cilindricoEsquerdo>= -5.0) ||     
               (cilindricoDireito <= 0 && cilindricoDireito >= -5.0)){
            vision=true;
        } if((esfericoEsquerdo >= -15.0 && esfericoEsquerdo <= 0) || 
                    (esfericoDireito >= -15.0 && esfericoDireito <= 0) ){
            vision=true;
        }
        System.out.println("Verificado");
        if(prime == true){
            return "Lente Prime";
        }else if(vision == true){
            return "Lente Vision";
        }else{
            return "Nenhuma Lente";
        }

    }
    

    
    
    // ----------------------------------------------------------------------------------//
    

}