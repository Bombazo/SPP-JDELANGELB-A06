
package spp.jdelangelb.t02.pkg1;
import java.util.Scanner;

public class SPPJDELANGELBT021 {

   
    public static void main(String[] args) {
        // PROGRAMA DE IMPRESION DE INTERVALO DE NUMEROS
        int valorInferior, valorSuperior;
        valorInferior = pedirValorInferior();
        valorSuperior = pedirValorSuperior();
        impresionSerie(valorInferior, valorSuperior);
    }
    
    public static int pedirValorInferior(){
        int valorInferior;
        System.out.println("Introduce el numero que tomara el valor inferior:");
        Scanner entradaValorInferior = new Scanner(System.in);
        valorInferior = entradaValorInferior.nextInt();
        return valorInferior;
    }
    
    public static int pedirValorSuperior(){
        int valorSuperior;
        System.out.println("Introduce el numero que tomara el valor del valor superior:");
        Scanner entradaValorSuperior = new Scanner(System.in);
        valorSuperior = entradaValorSuperior.nextInt();
        return valorSuperior;
    }
    
    public static void impresionSerie(int valorInferior, int valorSuperior){
        int contador;
        contador = valorInferior;
        System.out.println("==================================");
        System.out.println("    TABLA DE LA SERIE NUMERICA    ");
        System.out.println("==================================");
        do{
            if(contador %2 == 0 & contador %5 == 0){
                System.out.println(contador + " - NUMERO PAR  Y DIVISIBLE ENTRE 5");
            } else {
                if (contador %2 == 0){
                    System.out.println(contador + " - NUMERO PAR");
                } else {
                    if (contador %3 == 0){
                        System.out.println(contador + " - NUMERO DIVISIBLE ENTRE 3");
                    } else {
                        if (contador %5 == 0){
                            System.out.println(contador + " - NUMERO DIVISIBLE ENTRE 5");
                        }
                    }
                }
            }  
            contador++;
        } while (contador < (valorSuperior + 1));
    }
    
}


        
        
  