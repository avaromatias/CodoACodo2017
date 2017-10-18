package objetos.calculadoraSencilla;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame{

	Container ventana = getContentPane();
	
	JTextField texto1 = new JTextField(10);
	JTextField texto2 = new JTextField(10);
	JTextField resultado = new JTextField(10);
	
	JButton boton = new JButton("Sumar");
	
	JLabel label1 = new JLabel("Número 1: ");
	JLabel label2 = new JLabel("Número 2: ");
	JLabel labelResultado = new JLabel("Resultado: ");
	
	public Vista(){
		this.setTitle("Calculadora sencilla");
		this.setLayout(new FlowLayout());
		this.setSize(220, 160);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		resultado.setEditable(false);
		ventana.add(label1);
		ventana.add(texto1);
		ventana.add(label2);
		ventana.add(texto2);
		ventana.add(labelResultado);
		ventana.add(resultado);
		ventana.add(boton);
	}
	
}
