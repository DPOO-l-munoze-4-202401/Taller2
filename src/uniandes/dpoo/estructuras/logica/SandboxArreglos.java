package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( ){
    	int[]copiaarreglo =new int[arregloEnteros.length];
    	for (int i =0;i<arregloEnteros.length;i++){
    		copiaarreglo[i]=arregloEnteros[i];
    	}
    	
        return copiaarreglo;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( ){
    	String[]copiaarreglocad= new String [arregloCadenas.length];
    	for(int i =0;i<arregloCadenas.length;i++) {
    		copiaarreglocad[i]=arregloCadenas[i];
    	}
        return copiaarreglocad;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( ){
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( ){
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero ){
    	int[]arreglo_aumento = new int[arregloEnteros.length+1];
    	for (int i=0;i<arregloEnteros.length;i++) {
    		arreglo_aumento[i]=arregloEnteros[i];
    	}
    	arreglo_aumento[arreglo_aumento.length-1]=entero;
    	arregloEnteros=arreglo_aumento;

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena ){
    	String[]arreglo_aumentocad =new String [arregloCadenas.length+1];
    	for(int i =0; i<arregloCadenas.length;i++) {
    		arreglo_aumentocad[i]=arregloCadenas[i];    		
    	}
    	arreglo_aumentocad[arreglo_aumentocad.length-1]=cadena;
    	arregloCadenas=arreglo_aumentocad;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor ){
    	int cant_borrados=0;
    	for (int i=0;i<arregloEnteros.length;i++) {
    	if(arregloEnteros[i]==valor) {
    		cant_borrados ++;    	
    	}
    	else if (cant_borrados>0) {
    		arregloEnteros[i-cant_borrados]=arregloEnteros[i];
    	}
    	}
    	int nueva_long=arregloEnteros.length-cant_borrados;
    	int[]arreglo_limpio=new int[nueva_long];
    	System.arraycopy(arregloEnteros, 0, arreglo_limpio, 0, nueva_long);
        arregloEnteros = arreglo_limpio;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena ){
    	int cant_borrados2=0;
    	for(int i=0;i<arregloCadenas.length;i++){
    		if(arregloCadenas[i].equals(cadena)) {
    			cant_borrados2 ++;
    		}
    		else if (cant_borrados2>0) {
    			arregloCadenas[i-cant_borrados2]=arregloCadenas[i];
    		}
    	}
    	int nueva_long2= arregloCadenas.length-cant_borrados2;
    	String [] arreglo_limpio2=new String[nueva_long2];
    	System.arraycopy(arregloCadenas, 0, arreglo_limpio2,0, nueva_long2);
    	arregloCadenas=arreglo_limpio2;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion ){
        if (posicion < 0) {
            int[] arreglo_nuevo = new int[arregloEnteros.length + 1];
            arreglo_nuevo[0] = entero;
            System.arraycopy(arregloEnteros, 0, arreglo_nuevo, 1, arregloEnteros.length);
            arregloEnteros = arreglo_nuevo;
        } else if (posicion > arregloEnteros.length) {
            int[] arreglo_nuevo = new int[arregloEnteros.length + 1];
            System.arraycopy(arregloEnteros, 0, arreglo_nuevo, 0, arregloEnteros.length);
            arreglo_nuevo[posicion] = entero;
            arregloEnteros = arreglo_nuevo;
        } else {
            int[] arreglo_nuevo = new int[arregloEnteros.length + 1];
            System.arraycopy(arregloEnteros, 0, arreglo_nuevo, 0, posicion);
            arreglo_nuevo[posicion] = entero;
            System.arraycopy(arregloEnteros, posicion, arreglo_nuevo, posicion + 1, arregloEnteros.length - posicion);
            arregloEnteros = arreglo_nuevo;
        }
    }
    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )  {
        if (posicion >= 0 && posicion < arregloEnteros.length) {
            int[] arreglo_limpio = new int[arregloEnteros.length - 1];
            System.arraycopy(arregloEnteros, 0, arreglo_limpio, 0, posicion);
            System.arraycopy(arregloEnteros, posicion + 1, arreglo_limpio, posicion, arregloEnteros.length - posicion - 1);
            arregloEnteros = arreglo_limpio;
        }
    }
    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores ){
    	int[]arreglo_reinicio=new int[valores.length];
    	for(int i =0; i<valores.length;i++) {
    		arreglo_reinicio[i]=(int) valores[i];
    	}
    	arregloEnteros=arreglo_reinicio;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos ){
    	String[]arreglo_reiniciocad= new String[objetos.length];
    	for(int i=0;i<objetos.length;i++) {
    		arreglo_reiniciocad[i]= objetos[i].toString(); 		
    	}
    	arregloCadenas=arreglo_reiniciocad;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( ) {
    	for(int i =0;i<arregloEnteros.length;i++) {
    		if (arregloEnteros[i]<0) {
    			arregloEnteros[i]*=-1; 			
    		}
    	}

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )  {
 
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( ){
        int n = arregloCadenas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) > 0) {
                    // Swap
                    String temp = arregloCadenas[j];
                    arregloCadenas[j] = arregloCadenas[j + 1];
                    arregloCadenas[j + 1] = temp;
                }
            }
        }
    }
    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )  {
    	int contador_valor=0;
    	for (int i=0; i<arregloEnteros.length;i++) {
    		if (arregloEnteros[i]==valor){
    			contador_valor ++;    			
    		}
    	}
        return contador_valor;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena ){
    	int contador_valor=0;
    	String cadena_minus= cadena.toLowerCase();
    	for(int i=0;i<arregloCadenas.length;i++) {
    		String elemento = arregloCadenas[i].toLowerCase();
    		if (elemento.equals(cadena_minus)) {
    			contador_valor ++;
    		}
    		
    	}
        return contador_valor;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor ) {
    	int contador=contarApariciones(valor);
    	if (contador==0) {
    		return new int[0];
    	}
    	
    	int[]posicion= new int[contador];
    	int posiciones=0;
    	for (int i=0;i<arregloEnteros.length;i++) {
    		if(arregloEnteros[i]==valor) {
    			posicion[posiciones++]=i;
    		}
    	}
  
        return posicion;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( ){
    	if (arregloEnteros.length==0) {
    		return new int [0];    		
    	}
    	int min= arregloEnteros[0];
    	int max= arregloEnteros[0];
    	
    	for(int i =0;i<arregloEnteros.length;i++) {
    		if(arregloEnteros[i]<min) {
    			min= arregloEnteros[i];
    			}
    		if(arregloEnteros[i]>max) {
    			max= arregloEnteros[i];
    	}
    }
    	return new int [] {min,max};
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( ){
        HashMap<Integer, Integer> histograma = new HashMap<>();
        
        for (int valor : arregloEnteros) {
            if (histograma.containsKey(valor)) {
                histograma.put(valor, histograma.get(valor) + 1);
            } else {
                histograma.put(valor, 1);
            }
        }
        
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( ){
        int contadorRepeticiones = 0;

        for (int i = 0; i < arregloEnteros.length; i++) {
            for (int j = i + 1; j < arregloEnteros.length; j++) {
                if (arregloEnteros[i] == arregloEnteros[j]) {
                    contadorRepeticiones++;
                    break; // Salir del bucle interno una vez que se haya encontrado una repetición
                }
            }
        }

        return contadorRepeticiones;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo ) {
    	if (otroArreglo.length!=arregloEnteros.length) {
    		return false;
    	}
    	for(int i=0;i<arregloEnteros.length;i++) {
    		if(otroArreglo[i]!=arregloEnteros[i]) {
    			return false;
    		}
    	}
    	
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo ) {
        int n = arregloEnteros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arregloEnteros[j] > arregloEnteros[j + 1]) {
                    // Swap
                    int temp = arregloEnteros[j];
                    arregloEnteros[j] = arregloEnteros[j + 1];
                    arregloEnteros[j + 1] = temp;
                }
            }
        }
        return false;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo ) {
        arregloEnteros = new int[cantidad]; 
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
            arregloEnteros[i] = numeroAleatorio;
        }
    }

    }
