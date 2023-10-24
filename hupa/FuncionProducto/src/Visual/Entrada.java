/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Entrada {
    
    private static Scanner scanner = new Scanner(System.in);

    
    public static int leerInt(String label){
        
        System.out.printf("> %-20s:", label);
        return scanner.nextInt();
    }
    
    public static int leerInt(String label, char prompt){
        
        System.out.printf("%s %-20s:",prompt, label);
        return scanner.nextInt();
    }
    
    public static String leerString(String label){
        System.out.printf("> %-20s:", label);
        return scanner.next();
    }
    
    public static String leerLinea(String label){
        System.out.printf("> %-20s:", label);
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    public static char leerChar(String label){
        System.out.printf("> %-20s:", label);
        return scanner.next().toUpperCase().charAt(0);
    }
    
    public static LocalDate leerFecha(String label){
        System.out.printf("> %-20s:\n", label);
        
        int anio = leerInt("Year(aaaa)",'>');
        int mes = leerInt("Month(1-12)",'>');
        int dia = leerInt("Day(1-31)",'>');
        
        return LocalDate.of(anio, mes, dia);
    }
    
    public static boolean Control(String label) {
        boolean op;
        char opp;
    
            do{
                opp = Entrada.leerChar(label);
            }while((opp != 'S')&&(opp != 'N'));
        
            op = (opp != 'N');
            
        return op;
    }
    
}
