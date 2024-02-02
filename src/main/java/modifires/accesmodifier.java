package modifires;

import constructor.defaultconstructor;

public class accesmodifier 
{ 
    public void publicmodifier()
    {
     System.out.println("first acces modifier acces in every where ....methode,variable,class");
    }
     private void privatemodifier()
    {
     System.out.println("2nd acces within class only....methode,variable,class");
    }
    protected void protectedmodifier()
    {
        System.out.println("3rd acces only methode and variables withn same class and same package outside packge need extends and accea other methode");
    }
    void Defaultmodifier()
    {
     System.out.println("4 th acces same class and same package, outside package cannot be accesed defult mehode and variables and class");
    }
    public static void main(String[] args) 
    {
        accesmodifier acc=new accesmodifier();
        acc.publicmodifier();
        acc.Defaultmodifier();
        acc.privatemodifier();
        acc.protectedmodifier();        
    }
}
