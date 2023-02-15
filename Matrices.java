package Matrices;

public class Matrices {
// multiplicacion
	public static int[][]multiplicar(int [][]matriz1, int [][]matriz2){
		int filas1 = matriz1.length;
		int columnas1 = matriz1[0].length;
		int columnas2 = matriz2[0].length;
		
		int[][]matriz3 = new int[filas1][columnas2];
		
		for(int i=0;i<filas1; i++) {
			for(int j=0;j<columnas2;j++) {
				for (int k=0;k<columnas1;k++) {
					matriz3[i][j]+=matriz1[i][k]*matriz2[k][j];
				}
			}
		}
		return matriz3;
	}
	
	//multiplicar por un escalar
	public static int[][]multiplicarEscalar(int[][] matriz,int num){
		int filas=matriz.length;
		int columnas=matriz[0].length;
		
		int resultado[][]=new int[filas][columnas];
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				resultado[i][j]=matriz[i][j]*num;
			}
		}
		return resultado;
	}
	
	//Encontrat el valor maximo
	public static int encontrarMax(int[][]matriz) {
		int MAX=matriz[0][0];
		for (int[] fila:matriz) {
		    for (int NUM:fila) {
		      if (NUM>MAX) {
		        MAX = NUM;
		      }
		    }
		  }

		  return MAX;
		  }
	//Sunmar dos matrices 
	public static int[][] suma(int[][]matriz1, int[][]matriz2){
		int filas=matriz1.length;
		int columnas=matriz1[0].length;
		
		int[][]matriz3=new int[filas][columnas];
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
			}
		}
		return matriz3;
	}
	
	//transponer una matriz
	public static int[][] Transponer(int[][] matriz) {
		  int filas=matriz.length;
		  int columnas=matriz[0].length;

		  int[][] res = new int[columnas][filas];

		  for (int i=0;i<filas;i++) {
		    for (int j=0;j<columnas;j++) {
		      res[j][i] = matriz[i][j];
		    }
		  }
          return res;
          }
	//sumar diagonal
	public static int sumaDiagonal(int[][] matriz) {
		  int dimension = matriz.length;
		  int suma = 0;
		  for (int i = 0; i < dimension; i++) {
		    suma += matriz[i][i];
		  }

		  return suma;
		  }
	 //imprimir matriz
	 public static void imprimir(int matriz[][]){
		 int filas=matriz.length;
		 int columnas=matriz[0].length;
		 for (int i=0;i<filas;i++) {
			 for(int j=0;j<columnas;i++) {
				 System.out.println(matriz[i] [j]);
			 }
			 System.out.println("\n");
		 }

	 }
	}

