
package pockettracker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Irasas {
    String pajamosIslaidos;
    String suma;
    String paskirtis;
    String data;

    public Irasas(String pajamosIslaidos, String suma, String paskirtis) {
        this.pajamosIslaidos = pajamosIslaidos;
        this.suma = suma;
        this.paskirtis = paskirtis;
        this.data=getTime();
    }

    public Irasas(String pajamosIslaidos, String suma, String paskirtis,String data) {
        this.pajamosIslaidos = pajamosIslaidos;
        this.suma = suma;
        this.paskirtis = paskirtis;
        this.data = data;
    }
    
    
    public String getPajamosIslaidos() {
        return pajamosIslaidos;
    }

    public void setPajamosIslaidos(String pajamosIslaidos) {
        this.pajamosIslaidos = pajamosIslaidos;
    }

    public String getSuma() {
        
        return String.valueOf(suma)+" Eur";
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    public String getPaskirtis() {
        return paskirtis;
    }

    public void setPaskirtis(String paskirtis) {
        this.paskirtis = paskirtis;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    private String getTime(){
        long yourmilliseconds = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date resultdate = new Date(yourmilliseconds);
        String s = sdf.format(resultdate).toString();
        
        StringBuilder ss = new StringBuilder(s);
        
        
        return ss.toString();
        
        
        
    }
    
    
}
