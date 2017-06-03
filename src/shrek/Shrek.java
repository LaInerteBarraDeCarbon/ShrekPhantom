package shrek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Shrek {

	private String[] accesos;
	private int[] pesos;
	private int[] posicionDragones;
	private int cantidadClaros;
	private int cantidadSenderos;
	private int cantidadDragones;
	private int nodoIniPrincipe;
	private int nodoPrincesa;

	public Shrek(String path) {
		try {
			leerArchivo(path);
		} catch (Exception e) {
			System.out.println("Error abrir archivo.");
			e.printStackTrace();
		}
	}

	public void leerArchivo(String path) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(path));
			this.cantidadClaros = sc.nextInt();
			this.cantidadSenderos = sc.nextInt();
			this.cantidadDragones = sc.nextInt();
			this.nodoPrincesa = sc.nextInt();
			this.nodoIniPrincipe = sc.nextInt();
			this.posicionDragones = new int[this.cantidadDragones];
			this.accesos = new String[this.cantidadClaros];
			this.pesos = new int[this.cantidadClaros];

			// for (int j = 0; j < this.dimension; j++)
			// for (int i = 0; i < this.dimension; i++)
			// this.tablero[i][j] = sc.nextInt();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		sc.close();
	}
}
