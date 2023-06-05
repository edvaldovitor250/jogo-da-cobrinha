/*
 * Autor: Edvaldo Vitor
 * Linkedin: Edvaldo Vitor
 */
import java.awt.Color;
import java.util.ArrayList;

public class DataOfSquare {

	
	//ArrayList que conterá as cores
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2:cobra, 1: comida, 0: vazio
	SquarePanel square;
	public DataOfSquare(int col){
		
		//Vamos adicionar a cor ao arrayList
		C.add(Color.darkGray);//0
		C.add(Color.RED);    //1
		C.add(Color.white);   //2
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
