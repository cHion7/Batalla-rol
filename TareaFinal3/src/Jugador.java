import java.util.Random;
import java.util.Scanner;

public class Jugador {
	private String nombre;
	private int nivel;
	private int puntosVida;
	private int puntosMagia;

	public void presentarse() {
		Monstruo M = new Monstruo();
		Scanner S = new Scanner(System.in);
		System.out.println("¡Hola aventurero! ¿Cómo te llamas?");
		nombre = S.next();
		System.out.println("Bienvenido " + nombre);
		System.out.println("¿Cuánta vida tienes?");
		puntosVida = S.nextInt();
		System.out.println("¿Cuánta vida tiene el monstruo?");
		int puntosVidaM = S.nextInt();
		M.vida(puntosVidaM);
	}

	public void lanzarHechizo() {
		Monstruo M = new Monstruo();
		this.puntosMagia -= 3;
		System.out.println("Has lanzado una bola de fuego. -3 de mana, mana restante: " + puntosMagia);
		M.vidaQuitar(-3);
		System.out.println("Le has quitado 3 de vida al monstruo");
		hacerM();
	}

	public void recuperarMana() {
		Random R = new Random();
		int recuperados = R.nextInt(10 - 1) + 1; 
		this.puntosMagia = Math.min(this.puntosMagia + recuperados, 5); 
		System.out.println("Has recuperado " + recuperados + " puntos de mana. Mana restante: " + puntosMagia);
		hacerM();
	}

	public void recuperarVida() {
		Random R = new Random();
		int recuperados = R.nextInt(4 - 1) + 1; 
		this.puntosVida += recuperados;
		System.out.println("Has recuperado " + recuperados + " puntos de vida. Vida restante: " + puntosVida);
		hacerM();
		System.out.println("Vida de " + nombre + ": " + puntosVida);
	}

	public void vidaQuitar(int danoR) {
		puntosVida =puntosVida- danoR;
	}

	public void hacerM() {
	    Monstruo M = new Monstruo();
	    Random R = new Random();
	    int accion = R.nextInt(2);
	    switch (accion) {
	        case 0:
	            M.atacar();
	            break;
	        case 1:
	            M.morder();
	            break;
	    }
	}

}