import java.util.*;
public class Stringname
{
   public static void main(String args[]){
    Student st;
    Student[] studentlist= new Student[3];
    Scanner yaz=new Scanner(System.in);
    System.out.println("enter the student information");
    for(int index=0;index<studentlist.length;index++){
    int a=index+1;
    System.out.println("student #"+a);
    System.out.println("Name");
    String name=yaz.nextLine();
    System.out.println("surName");
    String surname=yaz.nextLine();
    System.out.println("id");
    String Idd=yaz.nextLine();
    int Id=Integer.parseInt(Idd);
    st=new Student(name,surname,Id);
    studentlist[index]=st;
    }
    for(int index=0;index<studentlist.length;index++){
        int a=index+1;
    System.out.println("student #"+a+studentlist[index].toString());
    
    }
    }
    }
