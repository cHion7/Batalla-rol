import java.util.*;

public class Monstruo {
	private int nivel;
	private int puntosVida;
	private String goblin;

	public Monstruo() {
		this.nivel = 4;
		this.puntosVida =20; 
		this.goblin = "Goblin"; 
	}
	public void atacar() {
		Random R = new Random();
		Jugador J = new Jugador();
		int dano = R.nextInt(7 - 1); 
		System.out.println("El Monstruo ha dado un zarpazo de " + dano + " de daño");
		J.vidaQuitar(dano);
		System.out.println("Vida restante Monstruo: " + puntosVida);
	}

	public void morder() {
		Random R = new Random();
		Jugador J = new Jugador();
		int dano = R.nextInt(7 - 3) + 3;
		System.out.println("El Monstruo ha mordido con fuerza " + dano + " de daño");
		J.vidaQuitar(dano);
		System.out.println("Vida restante Monstruo: " + puntosVida);
	}

	public void vida(int vida) {
		puntosVida = vida;
	}

	public void vidaQuitar(int danoR) {
		puntosVida = puntosVida-danoR;
		System.out.println("Vida restante Monstruo: " + puntosVida);
	}
}