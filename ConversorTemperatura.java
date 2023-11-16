import javax.swing.JOptionPane;
public class ConversorTemperatura {

	public static void main(String[] args) {
		String inputCelsius = JOptionPane.showInputDialog("Digite a Temperatura em Celsius:");
		
		
//		*Inserindo dados das temperaturas e as formulas nas saídas. 
		
		double temperaturaCelsius = Double.parseDouble(inputCelsius);
		double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
		double temperaturaKelvin = (temperaturaCelsius + 273.15);
		
//		Impressão dos resultados
		
		String mensagem = String.format("Temperatura em  Celsius: %.2f\nTemperatura em Fahrenheit: %.2f\nTemperatura em Kelvin %.2f\n",
					temperaturaCelsius, temperaturaFahrenheit, temperaturaKelvin);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
