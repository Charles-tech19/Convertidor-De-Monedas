package Monedas;

import javax.swing.JOptionPane;

public class MonedasASoles {

	public void ConvertirDolaresASoles(double valor) {
		double monedaDolar = valor * 3.76;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaDolar+ " Soles Peruanos");
	}
	
	public void ConvertirEurosASoles(double valor) {
		double monedaEuro = valor * 4.18;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaEuro+ " Soles Peruanos");
	}
	
	public void ConvertirLibrasASoles(double valor) {
		double monedaLibra = valor * 4.67;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaLibra+ " Soles Peruanos");
	}
	
	public void ConvertirYenASoles(double valor) {
		double monedaYen = valor * 0.028;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaYen+ " Soles Peruanos");
	}
	
	public void ConvertirWonASoles(double valor) {
		double monedaWon = valor * 0.0029;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaWon+ " Soles Peruanos");
	}
}
