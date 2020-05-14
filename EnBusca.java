
/**
 * Write a description of class EnBusca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class EnBusca
{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ingrese palabra o frase a buscar en el cuento");
        String frase =sc.nextLine();
        try{
        File data = new File("cuento.txt"); 
        if(!data.exists())
                data.createNewFile();
                FileReader leerArchivo = new FileReader(data); 
                BufferedReader textoArchivo = new BufferedReader(leerArchivo);
                String cadena = textoArchivo.readLine();
                while (cadena!=null) {
                   if(cadena.contains(frase)){
                       System.out.println("si se encuentra, en el renglon: "+cadena);
                       break;
                    }
                    cadena=textoArchivo.readLine();
                }
                 if(cadena==null)System.out.println("no se encontro");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
