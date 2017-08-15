
package practica1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ancer
 */
public class Practica1 {
    public static char[][] matriz1 = new char[4][4];
    public static char[][] matriz2 = new char[6][6];
    public static char[][] matriz3 = new char[8][8];
    public static int filas = 0;
    public static int columnas = 0;
    public static int minas = 0;
    public static int mov1 = 0;
    public static int mov2 = 0;
    public static int win = 0;
    public static boolean fipartida = false;
    public static boolean debug = false;
    public static int count = 0;
    public static boolean fi = false;
    
public static void Menu (){
    Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("BUSCAMINAS");
        System.out.println("=========================");
        System.out.println("Menu:");
        System.out.println("1. Jugar Nivel Principiante");
        System.out.println("2. Jugar Nivel Intermedio");
        System.out.println("3. Jugar Nivel Experto");
        System.out.println("4. Jugar Modo Debug");
        System.out.println("5. Salir");
        System.out.println("");
        int opcion = sc.nextInt();
        System.out.println("");
        switch (opcion) {
            case 1:
                filas = 4;
                columnas = 4;
                minas = 4;
                win = (4 * 4) - 4;
                break;
            case 2:
                filas = 6;
                columnas = 6;
                minas = 8;
                win = (6 * 6) - 8;
                break;
            case 3:
                filas = 8;
                columnas = 8;
                minas = 12;
                win = (8 * 8) - 12;
                break;
            case 4:
                
                break;
            case 5:
                fi = true;
                System.exit(0);
                break;
            default:
                System.out.println("!!!Introduce una opción valida!!!");
                break;
        }
        
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
