
package caja;

public class PruebaCaja {
    public static void main(String args[]){
        
        //Variables locales
        int operandoAl = 2;
        int operandoAn = 3;
        int operandoPr = 6;
        
        //Creamos un objeto de la clase Caja enviando argumentos
        Caja obj1 = new Caja(operandoAl, operandoAn, operandoPr);
        
        //Imprimir Operandos
        System.out.println("Operando alto:"+ operandoAl + ", operando ancho:" + operandoAn + " y el operando profundo:" + operandoPr);
        
        //Resultado del Volumen de la Caja
        System.out.println("\nEl volumen de la caja es :"+ obj1.calcular_volumen());
        
    }   

    
}
