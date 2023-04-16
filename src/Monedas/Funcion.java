package Monedas;

import javax.swing.JOptionPane;

public class Funcion {

	Monedas monedas = new Monedas();
	MonedasASoles pesos = new MonedasASoles();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Soles a Dólar", "De Soles a Euro", "De Soles a Libras","De Soles a Yen","De Soles a Won Coreano","De Dólar a Soles", "De Euro a Soles", "De Libras a Soles","De Yen a Soles","De Won Coreano a Soles"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Soles a Dólar":
        	monedas.ConvertirSolesADolares(Minput);
        	break;
        case "De Soles a Euro":
        	monedas.ConvertirSolesAEuros(Minput);
        	break;
        case "De Soles a Libras":
        	monedas.ConvertirSolesALibras(Minput);
        	break;
        case "De Soles a Yen":
        	monedas.ConvertirSolesAYen(Minput);
        	break;
        case "De Soles a Won Coreano":
        	monedas.ConvertirSolesAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Soles":
        	pesos.ConvertirDolaresASoles(Minput);
        	break;
        case "De Euro a Soles":
        	pesos.ConvertirEurosASoles(Minput);
        	break;
        case "De Libras a Soles":
        	pesos.ConvertirLibrasASoles(Minput);
        	break;
        case "De Yen a Soles":
        	pesos.ConvertirYenASoles(Minput);
        	break;
        case "De Won Coreano a Soles":
            pesos.ConvertirWonASoles(Minput);
            break;
        }      
    }
}
