
package caja;
// Agregando comentario con fecha 12-11-2018 0:37
public class Caja {
    
    // Atributos de Clase
    int alto;
    int ancho;
    int profundo;
    
    //Constructor vacío.
    Caja (){}
    
    //Constructor con 3 argumentos
    Caja (int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    
    //Éste método toma los atributos de la clase
    int calcular_volumen(){
        return alto * ancho * profundo;
    }
   
}
