package Matrices;
import java.util.Arrays;
public class mainMatriz {

	public static void main(String[] args) {
		
		//multiplicacion de matrices
		int[][] matriz1= {{4,5},{3,3}};
		int[][] matriz2= {{1,2},{4,5}};
		int[][] resmulti= Matrices.multiplicar(matriz1, matriz2);
		System.out.println("1.Multiplicacion: " + Arrays.deepToString(resmulti));
		
		//Transposicion de una raiz
		int [][]matriztrans= {{5,6},{2,1}};
		int [][]restrans=Matrices.Transponer(matriztrans);
		System.out.println("2.Transpuesta: " + Arrays.deepToString(restrans));
		
		//Diagonal
		int [][] matrizdiagonal= {{2,5},{6,8}};
		int resdiagonal=Matrices.sumaDiagonal(matrizdiagonal);
		System.out.println("3.Diagonal: " + resdiagonal);
		
		//Maximo
		int[][] matrizMax= {{4,5},{4,7}};
		int MAX=Matrices.encontrarMax(matrizMax);
		System.out.println("4.Maximo: " + MAX);
		
		//Suma
		int [][] matrizsuma= {{3,7},{7,9}};
		int[][] matrizsuma2= {{1,2},{4,5}};
		int [][]suma=Matrices.suma(matrizsuma, matrizsuma2);
		System.out.println("5.Suma: " + Arrays.deepToString(suma));
		
		// multi con escalar
		int[][] matrizescalar= {{3,5},{10,3}};
		int escalar=100;
		int [][] resescalar=Matrices.multiplicarEscalar(matrizescalar, escalar);
		System.out.println("6.Multiplicacion por escalar: " + Arrays.deepToString(resescalar));

	
	
	
	}

}
