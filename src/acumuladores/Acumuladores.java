package acumuladores;

public class Acumuladores {

	/**
	 * Dada una matriz de enteros y un número, verifica si existe alguna fila 
	 * donde todos sus elementos sean múltiplos del número recibido por 
	 * parámetro.
	 * 
	 * Si la matriz está vacía o si el número no es positivo, devuelve falso.
	 * 
	 * @param mat
	 * @param num
	 * @return
	 */
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) { 
		if (mat.length==0 || num<1) {
			return false;
		}
		for (int f=0; f<mat.length;f++) {
			boolean todosMultiplos= true;
			for (int c=0; c<mat[f].length;c++) {
				todosMultiplos= todosMultiplos && mat[f][c]%num==0;
			}
			if (todosMultiplos) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Dado 2 matrices se verifica si hay intersección entre las filas de cada
	 * matriz, fila a fila.
	 * 
	 * Si las matrices tienen distinta cantidad de filas o si alguna matriz 
	 * está vacía, devuelve falso.
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {
	    if (mat1.length==0 || mat2.length==0 || mat1.length!=mat2.length) {
	        return false;
	    }
	    for (int f=0; f<mat1.length; f++) {
	        boolean hayInterseccion = false;
	        for (int c1=0; c1<mat1[f].length; c1++) {
	            for (int c2=0; c2<mat2[f].length; c2++) {
	                hayInterseccion = hayInterseccion || (mat1[f][c1] == mat2[f][c2]);
	            }
	        }
	        if (!hayInterseccion) {
	            return false;
	        }
	    }
	    return true;
	}

	/**
	 * Dada una matriz y el índice de una columna, se verifica si existe alguna
	 * fila cuya suma de todos sus elementos sea mayor estricto que la suma de
	 * todos los elementos de la columna indicada por parámetro.
	 * 
	 * Si el índice de la columna es inválido o la matriz está vacía, devuelve 
	 * falso.
	 * 
	 * @param mat
	 * @param nColum
	 * @return
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
		
	    if (mat.length==0 || nColum<0 || nColum>=mat[0].length) {
	        return false;
	    }
	    int sumaColumna=0;
	    for (int f=0; f<mat.length; f++) {
	        sumaColumna += mat[f][nColum];
	    }
	    for (int f=0; f<mat.length; f++) {
	        int sumaFila = 0;
	        for (int c=0; c<mat[f].length; c++) {
	            sumaFila += mat[f][c];
	        }
	        if (sumaFila>sumaColumna) {
	            return true;
	        }
	    }
	    return false;
	}
	
	/**
	 * Dadas 2 matrices, se verifica si hay intersección entre las columnas de
	 * cada matriz, columna a columna.
	 * 
	 * Si las matrices tienen distinta cantidad de columnas o alguna matriz 
	 * está vacía, devuelve falso. 
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) {
		if (mat1.length==0 || mat2.length==0 || mat1[0].length!=mat2[0].length) {
	        return false;
	    }
	    for (int c=0; c<mat1[0].length; c++) {
	        boolean hayInterseccion = false;
	        for (int f1=0; f1<mat1.length; f1++) {
	            for (int f2=0; f2<mat2.length; f2++) {
	                hayInterseccion = hayInterseccion || (mat1[f1][c] == mat2[f2][c]);
	            }
	        }
	        if (!hayInterseccion) {
	            return false;
	        }
	    }
	    return true;
	}
}