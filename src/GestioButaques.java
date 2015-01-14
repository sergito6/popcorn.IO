
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davesnx
 */
public class GestioButaques {
    private ArrayList<Butaca> vButaques;
    public GestioButaques(){
        vButaques = new ArrayList<Butaca>();
    }

    /**
     * @return the vButaques
     */
    public ArrayList<Butaca> getvButaques() {
        return vButaques;
    }
    
    public boolean trobarButaca(Butaca a){
        Iterator<Butaca> nombreiterator =  vButaques.iterator();
        int i=0; 
        while(nombreiterator.hasNext()){
            Butaca butaca1 = nombreiterator.next();
           
                        
        }
        if(i==0){
            return false;
        }
        else{
            return true;
        }
        
    }

        
    }
}
