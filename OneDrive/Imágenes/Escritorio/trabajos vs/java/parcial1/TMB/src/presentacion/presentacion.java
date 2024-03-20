package presentacion;

import homoSapiens.H;
import homoSapiens.M;
import homoSapiens.Persona;

public class presentacion {
    public static void main(String[] args) {
    	
    	int g;
    	
    	System.out.println("Digita tu genero \n1. Hombre \n2. Mujer \n::: ");
    	if (g != 1 && g !=2) {
    		System.out.println("digito MAL");
    	}else {
    		if(g==1) {
    			H m = new H(70, 170, 30);
    			 System.out.println("La tasa Metabolica del hombre es : " + m.calculateTMB() + " calories/day");
    		}else{
    			if(g==2)
    				M w = new M(60, 160, 40);
    			 System.out.println("la tasa metabolica de la mujer es : " + w.calculateTMB() + " calories/day");
    		}
    	}

    }
}
