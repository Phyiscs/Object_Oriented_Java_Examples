/**Program documentation
* @authors Name: Nijat 
* @authors Surname:Shukurov
* @authors ID:1784222
* @version 1.0
* @since 11.08.2010
*/
import java.util.Scanner;
import javax.swing.*;
public class Test{
public static void main(String args[]){
    Scanner yaz=new Scanner(System.in);
    System.out.println("Type 1 for project 2.7");
    System.out.println("Type 2 for project 3.11");
    System.out.println("Type 3 for project 4.3");
    System.out.println("Type -1 for exit program");
    int a=yaz.nextInt();
 while(a!=-1){
     if(a==1){
        System.out.println("==============>>"+a);
        SpeedSound speed = new SpeedSound();
        speed.solve_speed();
        System.out.println("Type 1 for project 2.7");
        System.out.println("Type 2 for project 3.11");
        System.out.println("Type 3 for project 4.3");
        System.out.println("Type -1 for exit program");
        a=yaz.nextInt();}
     else if(a==2){
        System.out.println("==============>>"+a);
        String rad=JOptionPane.showInputDialog(null,"Please enter the radius of circle");// Get the radius in String type.
        double radius = Double.parseDouble(rad);// Converts String type radius value to Double type.
        CircleParams circle = new CircleParams(radius);
        circle.solve_circle();
        System.out.println("Type 1 for project 2.7");
        System.out.println("Type 2 for project 3.11");
        System.out.println("Type 3 for project 4.3");
        System.out.println("Type -1 for exit program");
        a=yaz.nextInt();}
     else if(a==3){
        System.out.println("==============>>"+a);
        Policy pol=new Policy();
        pol.solve_policy();
        System.out.println("Type 1 for project 2.7");
        System.out.println("Type 2 for project 3.11");
        System.out.println("Type 3 for project 4.3");
        System.out.println("Type -1 for exit program");
        a=yaz.nextInt();}
  else {
       System.out.println("!!!WARNING!!!  " + a + " is wrong input");
       System.out.println("Type 1 for project 2.7");
       System.out.println("Type 2 for project 3.11");
       System.out.println("Type 3 for project 4.3");
       System.out.println("Type -1 for exit program");
       a=yaz.nextInt();
        }
    }
    System.out.println("The program is exited");
}
}
