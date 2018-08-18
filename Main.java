import java.util.Scanner;
public class Main {
public static void main(String args[]){
Scanner yaz=new Scanner(System.in);
System.out.println("Asdasd");
Abc student3 =new Abc("memmed","novruroc");
Abc student1 = new Abc();
Abc student2 = new Abc();
student1.setName("nicat");
student1.setSurname("shukurov");
student2.setName("kamil");
student2.setSurname("quliyev");
System.out.println(student1.toString());
System.out.println(student2.toString());
System.out.println(student3.getName());
}
}