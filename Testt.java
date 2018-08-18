import java.util.*;
public class Testt{
public static void main(String args[]){
Scanner type=new Scanner(System.in);
double[] score=new double[5];
int index;
double max;
System.out.println("enter 5 socore============");
score[0]=type.nextDouble();
max=score[0];
for(index=1;index<5;index++){
score[index]=type.nextDouble();
if(score[index]>max){
max=score[index];
}

}

System.out.println("the hihgest score is"+max);
System.out.println("scores=======");
for(index=0;index<5;index++){
System.out.println(score[index]);
}
}
}
