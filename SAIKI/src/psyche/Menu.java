package psyche;

import java.util.Scanner;

public class Menu {

	Usuarios usuarios;
	protected Scanner sc;

	public int mostrarMenu() {

		System.out.println("Elige entre las 4 opciones");
		System.out.println("1. Agregar usuario");
		System.out.println("2. Listar usuario");
		System.out.println("3. Editar usuario");
		System.out.println("4. Borrar usuario");
		System.out.println("0. Salir");
		return sc.nextInt();
	}

	public int mostrarMenuUsuarios() {
		// cantidad de usuarios. Usuario (cantidad de usuarios) PABLO COME PENE
		return sc.nextInt();
	}

}
