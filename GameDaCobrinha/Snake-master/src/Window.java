import java.awt.GridLayout;
/*
 * Autor: Edvaldo Vitor
 * Linkedin: Edvaldo Vitor
 */
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


class Window extends JFrame{
	private static final long serialVersionUID = -2542001418764869760L;
	public static ArrayList<ArrayList<DataOfSquare>> Grid;
	public static int width = 20;
	public static int height = 20;
	public Window(){
		
		
		// Cria o arraylist que conterá os threads
		Grid = new ArrayList<ArrayList<DataOfSquare>>();
		ArrayList<DataOfSquare> data;
		
		// Cria Threads e seus dados e os adiciona ao arrayList
		for(int i=0;i<width;i++){
			data= new ArrayList<DataOfSquare>();
			for(int j=0;j<height;j++){
				DataOfSquare c = new DataOfSquare(2);
				data.add(c);
			}
			Grid.add(data);
		}
		
		// Configurando o layout do painel
		getContentPane().setLayout(new GridLayout(20,20,0,0));
		
		// Inicia e pausa todas as threads, então adiciona cada quadrado de cada thread ao painel
		for(int i=0;i<width;i++){
			for(int j=0;j<height;j++){
				getContentPane().add(Grid.get(i).get(j).square);
			}
		}
		
		// posição inicial da cobra
		Tuple position = new Tuple(10,10);
		// passando esse valor para o controlador
		ThreadsController c = new ThreadsController(position);
		//Vamos começar o jogo agora..
		c.start();

		// Vincula a janela ao ouvinte de teclado.
		this.addKeyListener((KeyListener) new KeyboardListener());

		//Para fazer: lidar com multiplayers .. O acima funciona, teste e veja o que acontece
		
		//Tuple position2 = new Tuple(13,13);
		//ControlleurThreads c2 = new ControlleurThreads(position2);
		//c2.start();
		
	}
}
