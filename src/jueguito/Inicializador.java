package jueguito;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Inicializador extends JComponent implements KeyListener, Runnable {

	private static final long serialVersionUID = 1L;
	public static int anchoVentana = 1058;
	public static int largoVentana = 650;
	public static void main(String[] args) {
		
		int tiempoDeEsperaEntreActualizaciones = 5;
		


		// Activar aceleracion de graficos en 2 dimensiones
		System.setProperty("sun.java2d.opengl", "true");

		// Crear un objeto de tipo JFrame que es la ventana donde va estar el juego
		JFrame ventana = new JFrame("E L  M A T E  F E L I Z");
		//ventana.setLayout(new BoxLayout(ventana,BoxLayout.Y_AXIS));


		// Cerrar la aplicacion cuando el usuario hace click en la 'X'
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// Abrir la ventana en el centro de la pantalla
		ventana.pack();
		ventana.setLocationRelativeTo(null);

		// Mostrar la ventana
		ventana.setVisible(true);
        ventana.setIconImage(new ImageIcon("Resources/Imagenes/IconoJuegoMate.jpg").getImage());
        ventana.setResizable(false);

		// Crear un "JComponent" llamado Juego y agregarlo a la ventana
		Inicio  inicio = new Inicio(anchoVentana, largoVentana); 		
		
		//Boton de START:
		JButton button = new JButton("Button1");
		button.setText("START");	         
		button.setForeground(Color.white);
		button.setToolTipText("PRESS BUTTON TO START");
		button.setBackground(Color.green);
		inicio.add(button);
		ventana.add(inicio);
		ventana.pack();
		
		//Boton Instrucciones:
		JButton button2 = new JButton("Button2");
		button2.setText("INSTRUCCIONES");	         
		button2.setForeground(Color.white);
		button2.setBackground(Color.green);
		inicio.add(button2);
		ventana.add(inicio);
		ventana.pack();
		
		JButton button3 = new JButton("Button3");
		button3.setText("SALIR");	         
		button3.setForeground(Color.white);
		button3.setBackground(Color.green);
		inicio.add(button3);
		ventana.add(inicio);
		ventana.pack();
		
		
		//Accion al apretar start
		button.addActionListener(e -> {
			Juego juego = new Juego(anchoVentana, largoVentana, tiempoDeEsperaEntreActualizaciones);
			ventana.add(juego);
			inicio.setVisible(false);
			juego.setVisible(true);
			ventana.addKeyListener(juego);
		
			// Achicar la ventana lo maximo posible para que entren los componentes
			ventana.pack();

			// Crear un thread y pasarle como parametro al juego que implementa la interfaz
			// "Runnable"
			Thread thread = new Thread(juego);
			// Arrancar el juego
			thread.start();
		}); 
		button.setFocusable(false);
		
		//Accion al apretar instrucciones
		button2.addActionListener(e -> {
			Juego juego = new Juego(anchoVentana, largoVentana, tiempoDeEsperaEntreActualizaciones);
			ventana.add(juego);
			inicio.setVisible(false);
			juego.setVisible(true);
			ventana.addKeyListener(juego);
			// Achicar la ventana lo maximo posible para que entren los componentes
			ventana.pack();

			// Crear un thread y pasarle como parametro al juego que implementa la interfaz
			// "Runnable"
			Thread thread = new Thread(juego);
			// Arrancar el juego
			thread.start();
		
		});
		
		button3.addActionListener(e -> {
			Juego juego = new Juego(anchoVentana, largoVentana, tiempoDeEsperaEntreActualizaciones);
			ventana.add(juego);
			inicio.setVisible(false);
			juego.setVisible(true);
			ventana.addKeyListener(juego);
			// Achicar la ventana lo maximo posible para que entren los componentes
			ventana.pack();

			// Crear un thread y pasarle como parametro al juego que implementa la interfaz
			// "Runnable"
			Thread thread = new Thread(juego);
			// Arrancar el juego
			thread.start();
		
		});
	}



	@Override
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getKeyCode() == 38) {
		}
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == 38) {
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getKeyCode() == 37) {
		}
	}
	@Override
	public void run() {
	}
}