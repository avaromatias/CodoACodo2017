package objetos.calculadoraSencilla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener{

	Vista miVista;
	Modelo miModelo;
	
	public Controlador(Vista unaVista, Modelo unModelo){
		this.miVista = unaVista;
		this.miModelo = unModelo;
		this.actionListener(this);
	}

	private void actionListener(ActionListener escuchador) {
		miVista.boton.addActionListener(escuchador);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try{
			String numero1 = this.miVista.texto1.getText();
			String numero2 = this.miVista.texto2.getText();
			double resultado = this.miModelo.sumar(numero1, numero2);
			this.miVista.resultado.setText("" + resultado);
		}catch (NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Ingrese un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
			ex.printStackTrace();
		}
	}
	
}
