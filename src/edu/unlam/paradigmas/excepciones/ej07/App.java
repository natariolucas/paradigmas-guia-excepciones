package edu.unlam.paradigmas.excepciones.ej07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new FileReader("file1.txt"))) {
			String otroArchivo = scanner.nextLine();

			try (Scanner otroScanner = new Scanner(new FileReader(otroArchivo))) {
				System.out.println("pudo abrir el segundo");
			} catch (FileNotFoundException e) {
				System.out.println("Error en el segundo archivo");
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error en el primer archivo");
			e.printStackTrace();
		}
	}

}
