package AO2;

import java.io.IOException;

/*
Objetivo:Desarrollar el algoritmo de entrenamiento de un modelo neuronal (Unidad Adaline) 
destinado a identificar la tecla presionada sobre un “pad numérico”, a partir de las señales 
recibidas del barrido (“scan”) de las filas y columnas con el fin de detectar las que en cada 
momento estén activadas.  
*/

public class Tema1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el coeficiente de aprendizaje:");
		double coeficiente =  Leer.datoDouble();
		System.out.println("Ingrese la cantidad de iteraciones para el aprendizaje:");
		int it = Leer.datoInt();
		System.out.println("Ingrese la fila 1-4 (de arriba hacia abajo):");
		int fila = Leer.datoInt();
		System.out.println("Ingrese la columna 1-3 (de izquierda a derecha):");
		int columna = Leer.datoInt();
		new Pad_Adaline().Algoritmo(coeficiente, fila, columna, it);
		
	}

}
