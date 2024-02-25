import java . util . List ;
import java . util . LinkedList ;

public class Listas {
public static void main ( String [] args ) {
 
// Crea un objeto tipo lista de cadenas
List < String > lista = new LinkedList < >() ;

// Guarda cadenas en la lista
lista . add ( " ¡Hola! " ) ;
lista . add ( " Buenos " ) ;
lista . add ( " días " ) ;

// Imprime las palabras en la lista
for ( String palabra : lista ) {
System . out . print ( palabra ) ;
}

// Lee la palabra en la posici ó n 1
String unaPalabra = lista . get (1) ;
System . out . format ( " %nLa palabra en la posición 1 es \" %s\" %n " , unaPalabra);
    }
}
