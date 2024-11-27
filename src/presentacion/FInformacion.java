package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Controlador;

public class FInformacion extends JPanel {
	private JTextField colorR;
	private JTextField colorG;
	private JTextField colorB;
	private JButton bCuadrado;
	private JButton bCirculo;
	private Controlador controlador;
	private f fListaDoble;
	
	public f getfListaDoble() {
		return fListaDoble;
	}

	public FInformacion(f fListaDoble) {
		this.fListaDoble = fListaDoble;
		this.colorR = new JTextField();
		this.colorG = new JTextField();
		this.colorB = new JTextField();
		this.bCuadrado = new JButton("Cuadrado");
		this.bCirculo = new JButton("Circulo");
		
		
		this.controlador = new Controlador(this);
		this.setLayout(new GridLayout(4, 2, 10, 12));
		this.add(new JLabel("R"));
		this.add(this.colorR);
		this.add(new JLabel("G"));
		this.add(this.colorG);
		this.add(new JLabel("B"));
		this.add(this.colorB);
		this.add(this.bCuadrado);
		this.add(this.bCirculo);
		
		
	}

	
	
	
}
