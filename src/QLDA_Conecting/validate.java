/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_Conecting;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author NGUYEN DUNG
 */
public class validate {
    public static void validateEmpty(JTextField field , StringBuilder sb, String errorMessage){
        if (field.getText().equals("")) {
            sb.append(errorMessage).append("\n"); 
            field.setBackground (Color.red);
            field.requestFocus();
        }else{
            field.setBackground (Color.white);
        }
        
        
    } 
     public static void validateEmpty(JPasswordField field , StringBuilder sb, String errorMessage){
        String password= new String (field.getPassword());
        if (password.equals("")) {
            sb.append(errorMessage).append("\n"); 
            field.setBackground (Color.red);
            field.requestFocus();
        }else{
            field.setBackground (Color.white);
        }
        
        
    } 

}
