package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasABolivianos Bolivianos = new ConvertirMonedasABolivianos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Bolivianos a Dólar", "De Bolivianos a Euro", "De Bolivianos a Libras","De Bolivianos a Yen","De Bolivianos a Won Coreano","De Dólar a Bolivianos", "De Euro a Bolivianos", "De Libras a Bolivianos","De Yen a Bolivianos","De Won Coreano a Bolivianos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Bolivianos a Dólar":
        	monedas.ConvertirBolivianosADolares(Minput);
        	break;
        case "De Bolivianos a Euro":
        	monedas.ConvertirBolivianosAEuros(Minput);
        	break;
        case "De Bolivianos a Libras":
        	monedas.ConvertirBolivianosALibras(Minput);
        	break;
        case "De Bolivianos a Yen":
        	monedas.ConvertirBolivianosAYen(Minput);
        	break;
        case "De Bolivianos a Won Coreano":
        	monedas.ConvertirBolivianosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Bolivianos":
        	Bolivianos.ConvertirDolaresABolivianos(Minput);
        	break;
        case "De Euro a Bolivianos":
        	Bolivianos.ConvertirEurosABolivianos(Minput);
        	break;
        case "De Libras a Bolivianos":
        	Bolivianos.ConvertirLibrasABolivianos(Minput);
        	break;
        case "De Yen a Bolivianos":
        	Bolivianos.ConvertirYenABolivianos(Minput);
        	break;
        case "De Won Coreano a Bolivianos":
            Bolivianos.ConvertirWonABolivianos(Minput);
            break;
        }      
    }
}
