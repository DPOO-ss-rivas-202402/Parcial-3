package control;

import logica.Figura;
import presentacion.FInformacion;

public class Controlador {
	private Figura Figura;
	private FInformacion fInformacion;
	
	
	public Controlador(FInformacion fInformacion) {
		this.fInformacion =fInformacion;
		this.Figura = new Figura(0, 0, 0);
		this.Figura.addObserver(this.fInformacion.getfFigura().getpLienzo());
	
	}


	public void circulo (int R, int G, int B) throws Exception {
		this.Figura.insertar(R, G, B);
	}


	public void cuadrado (int R, int G, int B) throws Exception {
		this.Figura.insertar(R, G, B);
	}

	
}
