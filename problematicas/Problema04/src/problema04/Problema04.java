/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Pole
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double resultadoFinal;
        double contador = 0;
        double resultado = 0;
        int numerador = 1;
        int contadorSigno = 1;
        String signo = "";
        String mensaje = "";

        while (contador <= 15) {
            if (contadorSigno % 2 == 0) {
                signo = "-";
            } else {
                signo = "+";
            }
            resultado = (contador + 1);
            mensaje = String.format("%s%s%d/%.0f ", mensaje, signo,
                    numerador, resultado);
            contador = contador + 2;
            contadorSigno = contadorSigno + 1;
            
        }
        resultadoFinal = (1.0-(1.0/3.0)+(1.0/5.0)-(1.0/7.0)+(1.0/9.0)-
                (1.0/11.0)+(1.0/13.0)-(1.0/15.0));
        System.out.printf("%s\nEl resultado es:\n%.4f\n", mensaje,
                resultadoFinal);
// TODO code application logic here
    }

}
