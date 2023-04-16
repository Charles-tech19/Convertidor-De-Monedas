package Monedas;

import javax.swing.JOptionPane;

public class Monedas {

	public void ConvertirSolesADolares(double valor) {
		double monedaDolar = valor / 3.76;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirSolesAEuros(double valor) {
		double monedaEuro = valor / 4.18;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes € " +monedaEuro+ " Euros");
	}
	
	public void ConvertirSolesALibras(double valor) {
		double monedaLibra = valor / 4.67;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes £ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirSolesAYen(double valor) {
		double monedaYen = valor / 0.028;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ¥ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirSolesAWon(double valor) {
		double monedaWon = valor / 0.0029;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₩ " +monedaWon+ " Wons");
	}
}
