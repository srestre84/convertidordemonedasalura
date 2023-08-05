package ConversorDeMonedas;

// Asigno los valores de las monedas mediante enums//


public enum ConversorDeMonedas{

	
	//Si bien estos datos son variables se suministra en esta ocasión la fecha en la cual se ingresaron que seria 05/08/2023

    DOLAR ("Estadounidense", "4140"), 

    EURO ("Europeo", "4565"),

    LIBRA ("Inglatera", "5277"),

    YEN ("Japones", "29"),

    WONSUL ("Coreano", "3"),; 

//Defino el tipo de modificadores y el tipo de variable, en los dos casos son strings//
	
    private final String País; 

    private final String ValorDivisa; 

  

 

    /**

     
El constructor tiene dos OBJETOS , uno es el país que simplemente sirve para llamarlo desde otra clase y un un string i que cambiara segun el tipo de pais y asignara el valor de este 
@author sebas
@
     */ 

    ConversorDeMonedas (String País, String i) { 

        this.País = País;

        this.ValorDivisa = i;

    } 
    
    // Asigno getters and setters para los metodos privados de esta sección para poderlos manejar asignar en los botones//

    public String getPaís() { return País; }

    public String getValorDivisa() { return ValorDivisa; }

	
	}

