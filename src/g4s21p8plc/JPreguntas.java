
package g4s21p8plc;


public class JPreguntas {
    
    String[] preguntas = {
        "¿en que año murio Kennedy?", "¿Qué pais tiene mas islas del mundo?", "¿como se llama la lengua oficial de china?    ",
        "¿en que año ocurrio lo de chernobyl?", "¿cuantos dientes tiene el ser humano adulto"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
