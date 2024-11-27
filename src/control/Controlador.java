package control;

import logica.Figura;
import presentacion.FInformacion;

public class Controlador {
	private Figura Figura;
	private FInformacion fInformacion;
	
	
	public Controlador(FInformacion fInformacion) {
		this.fInformacion =fInformacion;
		this.Figura = new Figura(0, 0, 0);
		this.Figura.addObserver(this.fInformacion.getfListaDoble().getpLienzo());
	
	}





	public void circulo(int R, int G, int B) {
		// TODO Auto-generated method stub
		
	}


	public void cuadrado(int R, int G, int B) {
		// TODO Auto-generated method stub
		
	}

	
}
