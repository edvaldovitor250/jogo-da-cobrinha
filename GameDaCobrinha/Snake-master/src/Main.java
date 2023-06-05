import javax.swing.JFrame;
/*
 * Autor: Edvaldo Vitor
 * Linkedin: Edvaldo Vitor
 */

public class Main {

	public static void main(String[] args) {

		//Criando a janela com todos os seus incríveis recursos de cobra
		Window f1= new Window();
		
		//Definindo as configurações da janela
		f1.setTitle("Jogo da Cobrinha!");
		f1.setSize(400,400);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}
