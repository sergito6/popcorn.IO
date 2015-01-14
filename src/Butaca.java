/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davesnx
 */
public class Butaca {
    private int nfila;
    private int nseient;
    private String persona;
    
    public Butaca(int nfila,int nseient, String persona){
        this.nfila = nfila;
        this.nseient = nseient;
        this.persona = persona;
        
    }

    /**
     * @return the nfila
     */
    public int getNfila() {
        return nfila;
    }

    /**
     * @return the nseient
     */
    public int getNseient() {
        return nseient;
    }

    /**
     * @return the persona
     */
    public String getPersona() {
        return persona;
    }
    
    public boolean equals(Butaca a , Butaca b){
         return a.nfila == b.nfila && a.nseient == b.nseient;
    }
    // Fila: 3, Seient: 25, Persona: Pepito Pérez
    @Override
    public String toString(){
        
     return "Fila: "+nfila+ ", Seient: "+ nseient+", Persona: "+ persona;   
    }
}
