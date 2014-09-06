import java.io.BufferedReader;import java.io.File;import java.io.FileReader;

/**
 *
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * 
 */

public class Lector {
 
    /*
    * Metodo que obtiene el texto de un archivo.txt de corrido en un string y lo guarda en un arreglo
    */
    public String[] obtieneDatos(String archivo,String tipoSeparacion) {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        String [] arrayDatos = null;
        
        try {
            String sFichero = System.getProperty("user.dir");
            file = new File (sFichero+"\\"+archivo+".txt");
            fr = new FileReader (file);
            br = new BufferedReader(fr);

            String linea="",siguienteLinea="";         //String obtenido del texto
            while((linea=br.readLine())!=null){
                siguienteLinea+=linea;
            }
            arrayDatos=siguienteLinea.split(tipoSeparacion);          
        }catch(Exception e){
          e.printStackTrace();
        }finally{
            try{                    
                if( null != fr ){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
             e2.printStackTrace();
            }
       }
        return arrayDatos;                
   }  
}
    

