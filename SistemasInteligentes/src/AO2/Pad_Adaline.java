package AO2;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

/*
Objetivo:Desarrollar el algoritmo de entrenamiento de un modelo neuronal (Unidad Adaline) 
destinado a identificar la tecla presionada sobre un “pad numérico”, a partir de las señales 
recibidas del barrido (“scan”) de las filas y columnas con el fin de detectar las que en cada 
momento estén activadas.  

Algoritmo de aprendizaje:

PASO 1:	Inicializar los pesos (aleatoriamente)
PASO 2:	Ingresar patron de entrada
PASO 3: Calcular la salida, compararla con la deseada, obtener el error 
PASO 4: Para todos los pesos, multiplicar la diferencia por la entrada y ponderala con la taza de aprendizaje.
PASO 5: Modificar el peso sumando el valor antiguo a la cantidad obtenida
PASO 6: Repetir los pasos 2, 3 y 4 para todos los patrones. 
PASO 7: Repetir los pasos 2, 3, 4, 5 y 6 tantos ciclos hasta cumplir el criterio de parada.

Criterio de parada usado: numero fijo de ciclos.  


Criterios de Parada: Adaline

	Criterio 1: Fijar un número de ciclos máximo. Dicho número debe garantizar que el error cuadrático para los patrones 
				de entrenamiento se haya estabilizado.
	Criterio 2: Cuando el error cuadrático sobre los patrones de entrenamiento no cambia durante x ciclos
				
				Nunca se puede utilizar un conjunto de test para decidir cuando parar el aprendizaje.
				
	Criterio 3: Sí se puede utilizar un conjunto de validación, que correspondería con una porción aleatoria del 
				conjunto de entrenamiento. En este caso, el criterio sería: cuando el error cuadrático sobre los 
				patrones de validación no aumenta o se mantiene estable a lo largo de x ciclos.

*/

public class Pad_Adaline {

	double salidaD = 0;
	int x1, x2, x3, x4, x5, x6, x7;
	int b=1;
	int i, j;
	double[] dw = new double [8];
	//PASO 1:	Inicializar los pesos (aleatoriamente)
	double[] w = {1.0, 0.394, 0.783, 0.84, 0.394, 0.783, 0.84, 0.394};
			
	public void Algoritmo(double a, int f, int c, int it) throws IOException{
		double aprendizaje = a;
		double err	= 0, delta = 0, salida = 0;
		for(i=0;i<it;i++){
			salidaD=0;
//para todos los patrones de entrada			
	for(j=0;j<10;j++){
		//PASO 2: ingresar patron de entrada
		definirEntradas();			
		//PASO 3: Calcular la salida, compararla con la deseada, obtener el error
			salida = x1*w[1] + x2*w[2] + x3*w[3] + x4*w[4] + x5*w[5] + x6*w[6] + x7*w[7] + b*w[0];
			delta = salidaD - salida;
			err = 0.5 * delta * delta;
			//PASO 4: Para todos los pesos, multiplicar la diferencia por la entrada y ponderala con la taza de aprendizaje.
			dw[0] =  aprendizaje * delta * b;
			dw[1] =  aprendizaje * delta * x1;
			dw[2] =  aprendizaje * delta * x2;
			dw[3] =  aprendizaje * delta * x3;
			dw[4] =  aprendizaje * delta * x4;
			dw[5] =  aprendizaje * delta * x5;
			dw[6] =  aprendizaje * delta * x6;
			dw[7] =  aprendizaje * delta * x7;
			
			System.out.println("Salida Obtenida(salida): " + salida);
			System.out.println("Salida Deseada(dalidaD): " + salidaD);
			System.out.println("Salida Error(err): " + err);
			System.out.println("Salida Delta(delta): " + delta);
			System.out.println("Patron ingresado: x1 = " + x1 + " x2 = " + x2 + " x3 = " + x3 + " x4 = " + x4 + " x5 = " + x5 + " x6 = " + x6 + " x7 = " + x7 + " b = " + b);
			System.out.println("Pesos Actuales: W1 = " + w[1] + " W2 = " + w[2] + " W3 = " + w[3] + " W4 = " + w[4] + " W5 = " + w[5] + " W6 = " + w[6] + " W7 = " + w[7] + " W8 = " + w[0]);
			
			//PASO 5: Modificar el peso sumando el valor antiguo a la cantidad obtenida
			w[0] += dw[0]; w[1] += dw[1]; w[2] += dw[2]; w[3] += dw[3]; w[4] += dw[4]; w[5] += dw[5]; w[6] += dw[6]; w[7] += dw[7];
			
			System.out.println("Pesos Nuevos  : W1 = " + w[1] + " W2 = " + w[2] + " W3 = " + w[3] + " W4 = " + w[4] + " W5 = " + w[5] + " W6 = " + w[6] + " W7 = " + w[7]+ " W8 = " + w[0] + "\n");
				
			salidaD++;	
			}//for j	PASO 6: Repetir los pasos 2, 3 y 4 para todos los patrones.
		}//for i		PASO 7: Repetir los pasos 2, 3, 4, 5 y 6 tantos ciclos hasta cumplir el criterio de parada.

		//asignar patron a filas y columnas
		if (f == 1){
			x1=1; x2=0; x3=0; x4=0; 
		}else if(f == 2){
			x1=0; x2=1; x3=0; x4=0;
		}else if(f == 3){
			x1=0; x2=0; x3=1; x4=0;
		}else if(f == 4){
			x1=0; x2=0; x3=0; x4=1;
		}

		if (c == 1){
			x5=1; x6=0; x7=0; 
		}else if(c == 2){
			x5=0; x6=1; x7=0;
		}else if(c == 3){
			x5=0; x6=0; x7=1;
		}
		
		
		//calcular
		salida = x1*w[1] + x2*w[2] + x3*w[3] + x4*w[4] + x5*w[5] + x6*w[6] + x7*w[7] + b*w[0];
		//redondear salida obtenida.
		System.out.println("Cálculo de salida:"+salida);
		int salidaC = (int) Math.rint(salida);
		System.out.println("Tecla precionada:"+salidaC);
		
	}//algoritmo
	
	public void definirEntradas(){
		if (salidaD == 0.0){
			x1=0; x2=0; x3=0; x4=1; x5=0; x6=1; x7=0; b=1; 
		}else if(salidaD == 1.0){
			x1=0; x2=0; x3=1; x4=0; x5=0; x6=0; x7=1; b=1;
		}else if(salidaD == 2.0){
			x1=0; x2=0; x3=1; x4=0; x5=0; x6=1; x7=0; b=1;
		}else if(salidaD == 3.0){
			x1=0; x2=0; x3=1; x4=0; x5=1; x6=0; x7=0; b=1;
		}else if(salidaD == 4.0){
			x1=0; x2=1; x3=0; x4=0; x5=0; x6=0; x7=1; b=1;
		}else if(salidaD == 5.0){
			x1=0; x2=1; x3=0; x4=0; x5=0; x6=1; x7=0; b=1;
		}else if(salidaD == 6.0){
			x1=0; x2=1; x3=0; x4=0; x5=1; x6=0; x7=0; b=1;
		}else if(salidaD == 7.0){
			x1=1; x2=0; x3=0; x4=0; x5=0; x6=0; x7=1; b=1;
		}else if(salidaD == 8.0){
			x1=1; x2=0; x3=0; x4=0; x5=0; x6=1; x7=0; b=1;
		}else if(salidaD == 9.0){
			x1=1; x2=0; x3=0; x4=0; x5=1; x6=0; x7=0; b=1;
		}
	}//definirEntradas
}
