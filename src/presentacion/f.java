package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class f extends JFrame {
	private FInformacion fInformacion;
	private FLienzo pLienzo;

	
	public FLienzo getpLienzo() {
		return pLienzo;
	}

	

	public f() {
		this.setTitle("Figuras");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(new BorderLayout());
		this.pLienzo = new FLienzo();
		
		this.fInformacion = new FInformacion(this);
		
		this.add(this.fInformacion, BorderLayout.WEST);
		this.add(this.pLienzo, BorderLayout.CENTER);

		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new f();
	}
}
