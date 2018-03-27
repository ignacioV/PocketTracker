
package pockettracker;

import java.util.ArrayList;

public class Lentele {
    ArrayList<Irasas> irasai = null;
    
    public void setIrasai(ArrayList<Irasas> ir){
        this.irasai = ir;
    }
    public ArrayList getIrasai(){
        return irasai;
    }
    public double skaiciuotiSuma(){
        double suma=0;
        for(Irasas ir:irasai){
            System.out.println("|"+ir.getPajamosIslaidos()+ "|");
            if("pajamos".equals(ir.getPajamosIslaidos())){
                suma+=Double.parseDouble(ir.getSuma().substring(0,ir.getSuma().length()-4));
            }else{
                suma-=Double.parseDouble(ir.getSuma().substring(0,ir.getSuma().length()-4));
            }
            
        }
        
        return suma;
    }
    
}
