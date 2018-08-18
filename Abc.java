public class Abc{
    String name;
    String surname;
    
    public Abc(){
    }
    public Abc(String name, String surname){
    this.name=name;
    this.surname=surname;
    }
    
    public void setName(String nam){
        name=nam;
    }
    public void setSurname(String surnam){
        surname=surnam;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    
    }
    public String toString(){
    return ("NAME:"+name+"\n"+"SURNAME:"+surname);
    }
}