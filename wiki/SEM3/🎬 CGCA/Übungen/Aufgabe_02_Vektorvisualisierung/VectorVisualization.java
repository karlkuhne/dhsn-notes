import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import vectorlib.Vector;
import java.awt.geom.AffineTransform;

public class VectorVisualization extends Frame {
	public VectorVisualization() {
		this.setSize(640, 480);
		this.setLocation(0,0);
		this.setTitle("Vector Visualization");
		this.setLayout(new BorderLayout());
		this.add(new VectorPanel(),BorderLayout.CENTER);
	    this.addWindowListener
	    (
	    	new WindowAdapter() 
	    	{
	    		public void windowClosing(WindowEvent e) 
	    		{
	    			System.exit(0);
	    		}
	    	}
	    );	
	    
		this.setVisible(true);
	}
	
	public void drawVector(Vector v, Color c, Graphics2D g2d) {
		g2d.drawLine(0, 0, (int) v.getX(), (int) v.getY());

		AffineTransform alt = g2d.getTransform();

		g2d.translate(v.getX(), v.getY());
		g2d.rotate(Math.atan2(v.getY(), v.getX()));

		g2d.drawRect(0, 0, 2, 2);

		g2d.setTransform(alt);
	}
	
	public static void main(String[] args) {
		new VectorVisualization();
	}
	
	private class VectorPanel extends Panel {
		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D)g;
			g2d.translate(getWidth() / 2, getHeight() / 2);
			g2d.scale(10, 10);

			/* g2d.drawRect(0, 0, 100, 100);
			g2d.setColor(Color.BLUE);
			g2d.fillOval(0, 0, 100, 100);
			g2d.drawLine(0, 0, 200, 100);
			g2d.setColor(Color.RED);
			g2d.drawString("Hello", 200, 100); */
			
			Vector v1 = new Vector(10,-1,0);
			drawVector(v1, Color.BLUE, g2d);

			Vector v2 = new Vector(-5,-5,0);
			drawVector(v2, Color.BLUE, g2d);
		}	
			
	}
	
}
