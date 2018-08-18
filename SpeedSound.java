/**SpeedSound.java method
 * using this method you will input the names of material to find the speed of 
 * sound in this material. you will input the material name (iron ,polystyrene,water and air)
 * and the solve_speed() method will generate the speed of sound in this material
 */
import javax.swing.JOptionPane;
public class SpeedSound{
    //variables
    String material;
    int degree;
    //Construtors
    SpeedSound(){
    }//default constructor
    //Methods
    public void solve_speed(){
        /**in solve_speed method using else if will find if your input are same as the name of materials
         * and if input is air you will input temprature as Celcie skale
           */
        material=JOptionPane.showInputDialog(null, "Please , input the material type");// inputs the material as String type.
        int b=0;
        while(b==0 /*helps while loop do work*/){//if the answer will not be reliable the loop will help work till we enter reliable input
            if (material.equals("iron")){
                JOptionPane.showMessageDialog(null,"5950 meters/sec","IRON",JOptionPane.PLAIN_MESSAGE);//shows the answer on screen message box
                break;// breaks the loop
            }
            else if (material.equals("polystyrene")){
                JOptionPane.showMessageDialog(null,"2350 meters/sec","POLYSTYRENE",JOptionPane.PLAIN_MESSAGE);//shows the answer on screen message box
                break;// breaks the loop
            }
            else if (material.equals("water")){
                JOptionPane.showMessageDialog(null,"1531 meters/sec","WATER",JOptionPane.PLAIN_MESSAGE);//shows the answer on screen message box
                break;// breaks the loop
            }
            else if (material.equals("air")){// if input the air you should input the temprature 
                String degree_str=JOptionPane.showInputDialog(null,"Please , input temprature in C skale ");// input temprature as String type.
                degree=Integer.parseInt(degree_str);//converst String type temprature to integer type
                double a = 331.5+0.6*degree;// calculates the speed of sound in air in this temprature
                JOptionPane.showMessageDialog(null,a+" meters/sec","AIR",JOptionPane.PLAIN_MESSAGE);//shows the answer on screen message box
                break;// breaks the loop
            }
            else{
                /**if the input is not reliable using this we will input the reliable name of material*/
                JOptionPane.showMessageDialog(null,"Please type,'iron' , 'polystyrene', 'water' or 'air' ","WARNING",JOptionPane.PLAIN_MESSAGE);//shows the answer on screen message box
                material=JOptionPane.showInputDialog(null, "Please , input the material type");// inputs the material as String type
            }
        }// end of while loop
    }//end of solve_speed() method.
}// end of class.