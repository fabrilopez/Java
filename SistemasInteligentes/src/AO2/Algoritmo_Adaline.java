package AO2;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

/*
Objetivo:Desarrollar el algoritmo de entrenamiento de un modelo neuronal (Unidad Adaline) 
destinado a identificar la tecla presionada sobre un “pad numérico”, a partir de las señales 
recibidas del barrido (“scan”) de las filas y columnas con el fin de detectar las que en cada 
momento estén activadas.  
*/

public class Algoritmo_Adaline {

	double salidaD = 1;
	int x1, x2, x3;
	double[] dw = new double [3];
	double[] w = {0.84, 0.394, 0.783};
	static double aprendizaje = 0.3;
	
	public void Algoritmo() throws IOException{
		double err	= 0, delta = 0, salida = 0;
		
		while (salidaD > salida){
			definirEntradas();
			if (salidaD > 7){
					salidaD = 1;
					dw[0] =  0;
					dw[1] =  0;
					dw[2] =  0;
					x1 = 0; x2 = 0; x3 = 1;					
				}
				salida = x1 * w[0] + x2 * w[1] + x3 * w[2];
				delta = salidaD - salida;
				err = 0.5 * delta * delta;
				dw[0] =  aprendizaje * delta * x1;
				dw[1] =  aprendizaje * delta * x2;
				dw[2] =  aprendizaje * delta * x3;
				
				System.out.println("Salida Obtenida: " + salida);
				System.out.println("Salida deseada: " + salidaD);
				System.out.println("Salida error: " + err);
				System.out.println("Salida delta: " + delta);
				System.out.println("Pesos Actuales: W1 = " + w[0] + " W2 = " + w[1] + " W3 = " + w[1]);
				w[0] += dw[0];
				w[1] += dw[1];
				w[2] += dw[2];
				System.out.println("Pesos Nuevos: W1 = " + w[0] + " W2 = " + w[1] + " W3 = " + w[1] + "\n");
				
				salidaD++;
				
		}//while
		
	}//algoritmo
	
	public void definirEntradas(){
		if (salidaD == 1.0){
			x1 = 0; x2 = 0; x3 = 1; 
		}else if(salidaD == 2.0){
			x1 = 0; x2 = 1; x3 = 0;
		}else if(salidaD == 3.0){
			x1 = 0; x2 = 1; x3 = 1;
		}else if(salidaD == 4.0){
			x1 = 1; x2 = 0; x3 = 0;
		}else if(salidaD == 5.0){
			x1 = 1; x2 = 0; x3 = 1;
		}else if(salidaD == 6.0){
			x1 = 1; x2 = 1; x3 = 0;
		}else if(salidaD == 7.0){
			x1 = 1; x2 = 1; x3 = 1;
		}	
	}//definirEntradas
	
}//class

