package edu.unlam.paradigmas.excepciones.ej06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(new FileReader("file1.txt"));
			String otroArchivo = scanner.nextLine();

			try {
				Scanner otroScanner = new Scanner(new FileReader(otroArchivo));
				System.out.println("Cierra el segundo");
				otroScanner.close();
			} catch (FileNotFoundException e) {
				System.out.println("Error en el segundo archivo");
				e.printStackTrace();
			}

			System.out.println("Cierra el primero");
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error en el primer archivo");
			e.printStackTrace();
		}
	}

}
