import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class PresentationWindow extends JFrame implements MouseListener,KeyListener, Serializable {
	
	Presentation presentation = new Presentation();
	String currentString = "";
	int currentSlide;
	
	JLabel label;
	//A method for writing on slides 
	public void paint(Graphics g){
		super.paint(g);
		presentation.drawYourself(g);
		repaint();
	}
	public PresentationWindow(){
		super();
		JPanel p = new JPanel();
        label = new JLabel("Slide Show");
        p.add(label);
        add(p);
		addKeyListener(this);
		addMouseListener(this);
		
		
	}
	//mouse clicking shows what you write on the window
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		Entity e = new Entity(currentString,arg0.getX(),arg0.getY());
		presentation.slides.get(currentSlide).entities.add(e);
		currentString = "";
		repaint();
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		currentString += arg0.getKeyChar();
		System.out.println("Current String is: "+currentString);
		
		if(arg0.getKeyCode() == 39){		//if right key is pressed
			currentSlide ++;
			presentation.rightPressed();
		}
		else if(arg0.getKeyCode() == 37){		//if left key is pressed
			if(currentSlide>=1){
				currentSlide --;
				}else{
				currentSlide =0;	
				}
			presentation.leftPressed();
		}
		
		else if(arg0.getKeyCode() == 40){		//if down key is pressed
			presentation.downPressed();
		}
		else if(arg0.getKeyCode()==KeyEvent.VK_BACK_SPACE ){		//if back space key is pressed
			presentation.delete();
		}
		else{
			System.out.print(arg0.getKeyCode()+ " ");
			System.out.println("Key Pressed");
		}
		
		repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
