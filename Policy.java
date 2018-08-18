/**Policy.java class
 * Description:
 * using the inputs of growthRate and inflation percentages
 * and processing them in solve_policy method
 * displays the Recomenned Economy Policy.
   */
import javax.swing.JOptionPane;
public class Policy{
    //Variables
    int growthRate;
    int inflation;
    //Construcors.
    Policy(){
    }//default constructor
    //Methods
    public void solve_policy(){
        /**Solve_policy() methods takes int growthRate and int inflation variables
         * and using if else logical operators displays on screen recomenned economy policty*/
        String gr=JOptionPane.showInputDialog(null,"Please enter annual growth rate");//Inputs growthRate as String type
        String inf=JOptionPane.showInputDialog(null,"Please enter infilation");//Inputs inflation as String type
        growthRate=Integer.parseInt(gr);//converts String growthrate to integer type
        inflation=Integer.parseInt(inf);//converts String inflation to integer type
        int b=0;
        while(b==0/*if gr is true loop works*/){//if unputs are negatvie using this while loop you can input the variables again.
            if(growthRate<1 && inflation<3 && inflation>=0 && growthRate>=0){
                //Displays the Recommenden economy policy on screen box
                JOptionPane.showMessageDialog(null,"Increase welfare spending, reduce personal taxes, and decrease discount rate.","Recommenden economy policy",JOptionPane.PLAIN_MESSAGE);
                break;//breaks the loop 
              }
            else if(growthRate<1&& inflation>3&&growthRate>=0 && inflation<=100){
                //Displays the Recommenden economy policy on screen box
                JOptionPane.showMessageDialog(null,"Reduce business taxes","Recommenden economy policy",JOptionPane.PLAIN_MESSAGE); 
                break;//breaks the loop
              }
            else if(growthRate>4 && inflation<1 && growthRate<=100 && inflation>=0){
                //Displays the Recommenden economy policy on screen box
                JOptionPane.showMessageDialog(null,"Increase personal and business taxes, and decrease discount rate.","Recommenden economy policy",JOptionPane.PLAIN_MESSAGE);
                break;//breaks the loop
              }
            else if(growthRate>4 && inflation>3 && inflation<=100 && growthRate<=100 ){
                //Displays the Recommenden economy policy on screen box
               JOptionPane.showMessageDialog(null,"Increase discount rate.","Recommenden economy policy",JOptionPane.PLAIN_MESSAGE);
               break;//breaks the loop
              }
            else if(growthRate>1 && growthRate<4){
                //Displays the Recommenden economy policy on screen box
              JOptionPane.showMessageDialog(null,"No change in economic policy","Recommenden economy policy",JOptionPane.PLAIN_MESSAGE);
              break;//breaks the loop
              }
            else if(growthRate<0 || growthRate>100 ||inflation <0 ||inflation>100){
                /**in this part if inputs are not reliable 
                 * you input the growth rate and infilation till will they reliable*/
              JOptionPane.showMessageDialog(null,"growthRate and infilation must be between 0% and 100 %","WaRNING",JOptionPane.PLAIN_MESSAGE);
              gr=JOptionPane.showInputDialog(null,"Please enter annual growth rate");//Inputs growthRate as String type
              inf=JOptionPane.showInputDialog(null,"Please enter infilation");//Inputs inflation as String type
              growthRate=Integer.parseInt(gr);//converts String growthrate to integer type
              inflation=Integer.parseInt(inf);//converts String inflation to integer type
              }
       }
}
    
    
}