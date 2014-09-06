/**
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * 
 */
public class Main {
    public static void main(String[] args) {
        
        String[] palabrasIngles,palabrasEsp,parrafo,arrayAux;                   //Arrays donde se obtendran los datos a utilizar
        palabrasIngles = new String[100];                                       //Definiendo la cantidad de palabras del diccionario
        palabrasEsp = new String[100];                                          //Definiendo la cantidad de palabras del diccionario

        Lector lector=new Lector();                                             
        parrafo=lector.obtieneDatos("Texto"," ");                               //Se crea un array con cada letra del parrafo a leer
        arrayAux=lector.obtieneDatos("diccionario",",");                        //Se obtiene todos los datos del diccionario en un array auxiliar        
        
        int i=0,pares=0,impares=0,auxPar=0,auxImpar=0,indice=0;                 //Contadores para el manejo de los datos.
        while(i<arrayAux.length){                                               //Se hace un ciclo mientras la longitud del arreglo sea menor que la longitud de este
            pares=2*auxPar;                                                     //Indice para los numeros pares=palabras en español
            palabrasIngles[indice]=arrayAux[pares];                             //Se agregan al arreglo
            auxPar++;                                                           //Se le suma al auxilar del contador par
            impares=2*auxImpar+1;                                               //Indice para los numeros impares=numeros en ingles
            palabrasEsp[indice]=arrayAux[impares];                              //Se le agrega esa palabra al arreglo de palabras en español
            auxImpar++;                                                         //Se le suma al auxiliar de los numeros impares
            i+=2;                                                               //Se le suma dos ya que se ira llenando de 2 datos en 2 datos
            indice++;                                                           //Indice para las posiciones de los arreglos que se iran llenando de 1 en 1
        }
        
        for(int j=0;palabrasIngles[j]!=null;j++){
            System.out.println(palabrasIngles[j]);
            
        }
        
        
    }
}
