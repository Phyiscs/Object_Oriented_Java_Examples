/**CircleParams.java class
 * Description:
 * using radius input solves the diameter,
 * circumefernece and area in solve_circle() method.
   */
import javax.swing.JOptionPane;
public class CircleParams{
    
    //variables
    double radius;
    //Constructors
    //null constructor
    CircleParams(){
     }//defautl constructor
    CircleParams(double radius){
        this.radius=radius;
    }//constructor with one argument
    // Methods
    public void solve_circle(){
        /**this method using the radius input finds the parameters of 
        * circle as diameter ,circumference and area. and displays them as messagebox.
        */
       if(radius>=0){//If radius bigger than or equal to zero program caluclates circle parameters.
           double diameter=2*radius;//Calculates diameter of circle as Double type using radius.
           double circumference = 2 * Math.PI * radius;//Calculates circumference of circle as Double type using radius.
           double area= radius * Math.PI;//Calculates the are of circle as Double type using radius variable.
           //Displays circle parameters diameter , circumference and area on screen. 
           JOptionPane.showMessageDialog(null,"Diameter = "+diameter + "\nCircumference = "+circumference+"\nArea = " + area,"Project 2: Circle Parameters",JOptionPane.PLAIN_MESSAGE);
        } 
        else{//if radius lower than zero 
            //Displays that the input is wrong  
            JOptionPane.showMessageDialog(null,"radius input can not be lower than zero","WARNING",JOptionPane.PLAIN_MESSAGE); 
        }
    }//end of solve_circle method
}//end of class