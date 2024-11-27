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
	private f fFigura;
	
	public f getfFigura() {
		return fFigura;
	}

	public FInformacion(f fFigura) {
		this.fFigura = fFigura;
		this.colorR = new JTextField();
		this.colorG = new JTextField();
		this.colorB = new JTextField();
		this.bCuadrado = new JButton("Cuadrado");
		this.bCuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadrado();
				
			}
		});
		this.bCirculo = new JButton("Circulo");
		this.bCirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				circulo();
				
			}
		});
		
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
	public void cuadrado() {
		try {
			this.controlador.cuadrado(Integer.parseInt(this.colorR.getText()),Integer.parseInt(this.colorG.getText()), Integer.parseInt(this.colorB.getText()));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this.fFigura, "El RGB debe de ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this.fFigura, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void circulo() {
		try {
			this.controlador.circulo(Integer.parseInt(this.colorR.getText()), Integer.parseInt(this.colorG.getText()), Integer.parseInt(this.colorB.getText()));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this.fFigura, "El RGB debe de ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this.fFigura, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
}
