import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;



	public class Slide implements Serializable{
		ArrayList<Entity> entities = new ArrayList();
		
	
		public void drawYourself(Graphics g){		//draws all the entities on the slide
			for(int i=0; i<entities.size();i++){
				entities.get(i).drawYourself(g);
			}
		}
		
	}
