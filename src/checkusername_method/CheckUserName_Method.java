/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkusername_method;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class CheckUserName_Method {

    public static boolean checkusername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return true;
        }else{
     return false;
    }
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        //capture user details
        System.out.println("Please enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();
        
        while(true){
            System.out.println("Enter Username: ");
            String userName = scan.nextLine();
            
            if (checkusername(userName)){
                System.out.println("Username successfully captured");
                break;
            }else{
                System.out.println("Username is incorrectly formatted, please ensure it must have an underscore and it must not be more than 5 characters long");
            }
        }
                
    }

}
