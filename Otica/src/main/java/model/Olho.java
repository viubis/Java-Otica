/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Victor
 */
public class Olho {
    float cilindricoEsquerdo;
    float cilindricoDireito;
    float esfericoEsquerdo;
    float esfericoDireito;

    public float getCilindricoEsquerdo() {
        return cilindricoEsquerdo;
    }

    public void setCilindricoEsquerdo(float cilindricoEsquerdo) {
        this.cilindricoEsquerdo = cilindricoEsquerdo;
    }

    public float getCilindricoDireito() {
        return cilindricoDireito;
    }

    public void setCilindricoDireito(float cilindricoDireito) {
        this.cilindricoDireito = cilindricoDireito;
    }

    public float getEsfericoEsquerdo() {
        return esfericoEsquerdo;
    }

    public void setEsfericoEsquerdo(float esfericoEsquerdo) {
        this.esfericoEsquerdo = esfericoEsquerdo;
    }

    public float getEsfericoDireito() {
        return esfericoDireito;
    }

    public void setEsfericoDireito(float esfericoDireito) {
        this.esfericoDireito = esfericoDireito;
    }

    public Olho(float cilindricoEsquerdo, float cilindricoDireito, float esfericoEsquerdo, float esfericoDireito) {
        this.cilindricoEsquerdo = cilindricoEsquerdo;
        this.cilindricoDireito = cilindricoDireito;
        this.esfericoEsquerdo = esfericoEsquerdo;
        this.esfericoDireito = esfericoDireito;
    }
    
    
}
