package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasABolivianos {
   public void ConvertirDolaresABolivianos(double valor) {
		double monedaDolar = valor * 6.87;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Bolivianos");
	}
	
	public void ConvertirEurosABolivianos(double valor) {
		double monedaEuro = valor * 7.56;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Bolivianos");
	}
	
	public void ConvertirLibrasABolivianos(double valor) {
		double monedaLibra = valor * 0.22;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Bolivianos");
	}
	
	public void ConvertirYenABolivianos(double valor) {
		double monedaYen = valor * 0.049;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Bolivianos");
	}
	
	public void ConvertirWonABolivianos(double valor) {
		double monedaWon = valor * 0.0053;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Bolivianos");
	}
}
