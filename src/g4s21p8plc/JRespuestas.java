    
package g4s21p8plc;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "1963","suecia","mandarin","1986","32 dientes"
    };
    
    String[] radioR = {
        "1963,2003,1819,hoy",
        "suecia,quien sabe,mexico,rusia",
        "mandarin,chinangense,taka taka,no se",
        "1986,4562,1987, 1678",
        "32 dientes,56 dientes,26 dientes,no se "
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
