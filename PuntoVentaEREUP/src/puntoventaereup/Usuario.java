/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntoventaereup;

/**
 *
 * @author User
 */
public class Usuario {
    public static String user = "Lucas"; // nombres por defecto
    public String nombreUser;
    
    
    public static String password = "El roko"; //nombres por defecto
    public String nombrePassword;
    
    int validacion(String nombreUser, String nombrePassword){
        if (user.equals(nombreUser)&&(password.equals(nombrePassword))){
           return 0; 
        }
        else{
            return 1;
        }
    }
}
