/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splitstring;

/**
 *
 * @author jonatanLara
 */
public class SplitString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numeros = "1,2,3,4,5,6";
        String[] numerosComoArray = numeros.split(",");
        for (int i = 0; i < numerosComoArray.length; i++) {
            System.out.println(numerosComoArray[i]);
        }
        
        
        	
    //Se puede dividir por medio de comas o palabras
    String dias = "Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo";
    String diaArray[] = dias.split(",");
		
    System.out.println("--Ejemplo 1--");
    for(String dia : diaArray){
	System.out.println(dia);
    }
 
    //El punto se usa en las expresiones regulares por lo que 
    //si se desea usar como tal se debe definir con \\
    //Otros valors son + [ ] ? etc.
    String diasPunto = "Lunes.Martes.Miercoles.Jueves.Viernes.Sabado.Domingo";
    String diaPuntoArray[] = diasPunto.split("\\.");
 
    System.out.println("--Ejemplo 2--");
    for(String diaPunto : diaPuntoArray){
	System.out.println(diaPunto);
    }
		
    //Se pueden usar expresiones mas compleajas como la siguiente que busca
    //dominios .com
    String correos = "test1@dominio.com,test2@dominio.com,test3@dominio2.com,test4@dominio.net";
    String regEx = "@[A-Za-z0-9]+\\.com";
		
    System.out.println("--Ejemplo 3--");
    for(String correoSinDominio : correos.split(regEx)){
	System.out.println(correoSinDominio);
    }
    }
    
}
