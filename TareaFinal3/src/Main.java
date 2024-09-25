import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		boolean salir = false;
		Jugador J = new Jugador();
		J.presentarse();
		System.out.println("Te has encontrado un monstruo, ¿qué haces?");
		do {
			System.out.println("1 Lanzar hechizo, 2 Recuperar mana, 3 Recuperar vida, 4 Huir");
			int accion = S.nextInt();
			switch (accion) {
			case 1:
				J.lanzarHechizo();
				break;
			case 2:
				J.recuperarMana();
				break;
			case 3:
				J.recuperarVida();
				break;
			case 4:
				salir = true;
				break;
			}
		} while (salir == false);
	}
}
