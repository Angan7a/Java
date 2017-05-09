/*
Program do:
  - rysownaia kwadratów (lewym klawiszem myszy, lub trzymaniu lewego klawisza myszy oraz przemieszczanie jej)
  - kasowanie kw. (prawym  klawiszem myszy)
  - przesuowanie kw. (najechanie na zadany kw. wciśnięcie i trzymanie lewego klawisza myszy, przesuniecie myszy)
*/
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Mysz extends JPanel implements MouseListener, MouseMotionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int DEFAULT_WIDTH = 200;
    private static final int DEFAULT_HEIGHT = 200;
 
    private int x, y;	
    private int clickKwadrat = 0;
    private int xToMove = 0;
    private int yToMove = 0;
 
    ArrayList<Point> points = new ArrayList<Point>();
 

	public Mysz() {
		addMouseListener(this);
		addMouseMotionListener(this);
		setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
	}
	@Override
    public void mouseDragged(MouseEvent e) {
		x = e.getX();
 	   	y = e.getY();
        if((e.getModifiers()== MouseEvent.BUTTON1_MASK) && (clickKwadrat == 0)){
           points.add(new Point(x, y));
           repaint();   
        } else if((e.getModifiers()== MouseEvent.BUTTON1_MASK) && (clickKwadrat == 1)){
        	points.remove(new Point(xToMove, yToMove));
            points.add(new Point(x-5, y-5));
            repaint();
    		xToMove = x-5;
    		yToMove = y-5;
        } else if(e.getModifiers()== MouseEvent.BUTTON3_MASK){
            Point toRemove = null;
            boolean usunac = false;
            for(Point p: points) {
            	int xc = (int)p.getX();
            	int yc = (int)p.getY();
            	if(((xc <= x) && (x <= (xc+10))) && ((yc <= y) && (y <= (yc+10)))) {
            		toRemove = p;
            		usunac = true;
            	}
            }
            if(usunac) {
            	points.remove(toRemove);
            	repaint();
            }
        }
    }
 
    @Override
    public void mouseMoved(MouseEvent arg0) {
    }
 
    @Override
    public void mouseClicked(MouseEvent e) {
    }
 
    @Override
    public void mouseEntered(MouseEvent e) {
    }
 
    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
	    if(e.getButton() == MouseEvent.BUTTON1) {
	        for(Point p: points) {
	        	int xc = (int)p.getX();
	        	int yc = (int)p.getY();
	        	if(((xc <= x) && (x <= (xc+10))) && ((yc <= y) && (y <= (yc+10)))) {
	        		clickKwadrat = 1;
	        		xToMove = xc;
	        		yToMove = yc;
	        	}
	        }
	        if(clickKwadrat == 0) {
	        	points.add(new Point(x, y));
	        	repaint();
	        }
	    } else if(e.getButton() == MouseEvent.BUTTON3) {
            Point toRemove = null;
            boolean usunac = false;
            for(Point p: points) {
            	int xc = (int)p.getX();
            	int yc = (int)p.getY();
            	if(((xc <= x) && (x <= (xc+10))) && ((yc <= y) && (y <= (yc+10)))) {
            		toRemove = p;
            		usunac = true;
            	}
            }
            if(usunac) {
            	points.remove(toRemove);
            	repaint();
            }
        }
    }
 
    @Override
    public void mouseReleased(MouseEvent e) {
    	clickKwadrat = 0;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        g2d.setColor(Color.BLACK);
        drawRectangles(g2d);
    }
    private void drawRectangles(Graphics2D g2d) {
        int x, y;
        for(Point p: points) {
            x = (int)p.getX();
            y = (int)p.getY();
            g2d.fillRect(x, y, 10, 10);
        }
    }
}
