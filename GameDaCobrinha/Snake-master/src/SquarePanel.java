import java.awt.Color;
/*
 * Autor: Edvaldo Vitor
 * Linkedin: Edvaldo Vitor
 */
import javax.swing.JPanel;

public class SquarePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public SquarePanel(Color d){
		this.setBackground(d);
	}
	
	public void ChangeColor(Color d){
		this.setBackground(d);
		this.repaint();
	}
	
}

