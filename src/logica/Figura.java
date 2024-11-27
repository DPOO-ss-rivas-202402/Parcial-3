package logica;

import presentacion.FLienzo;

public class Figura {
	private int R;
	private int G;
	private int B;
	
	
	public int getR() {
		return R;
	}
	public void setR(int R) {
		this.R = R;
	}
	
	
	public int getG() {
		return G;
	}
	public void setG(int G) {
		this.G = G;
	}
	
	public int getB() {
		return B;
	}
	public void setB(int B) {
		this.B = B;
	}
	
	public Figura(int R, int G, int B) {
		this.R = R;
		this.G = G;
		this.B = B;
	}
	
	
	
}
