package constructor;

public class paramererizedconstructor 
{
    String Bank_name;
    int Accno;
    public paramererizedconstructor(String bankname,int Acc_no)
    {
       Bank_name=bankname;
       Accno=Acc_no;


    }
    public static void main(String[] args) {
        paramererizedconstructor pm = new paramererizedconstructor("sbi", 87667870);
        System.out.println("my acc no is"+pm.Accno);
        System.out.println("my bank name is"+pm.Bank_name);
        
    }
}
