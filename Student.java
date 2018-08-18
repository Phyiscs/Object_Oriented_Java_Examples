
public class Student
{
    String name;
    String surname;
    int Id;
    public Student(){}
    public Student(String name, String surname, int Id){
        this.name=name;
        this.surname=surname;
        this.Id=Id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int Id){
        this.Id=Id;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getId(){
        return Id;
    }
    public String toString(){
    return ("Information:"+this.name+" "+this.surname+" " +this.Id);
    }
}
