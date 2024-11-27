package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class FLienzo extends JPanel implements Observer {

	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(255, 255, 255));
		