package tamiljava.oops.inheritance.encapsulation;

public class connection extends bank
{
public static void main(String[] args) 
{
    bank ne=new bank();
  ne.setacc_name("Tamil"); 
  ne.set_accountnumber(357657483);
  ne.set_Branch("valapdy");
  ne.set_mobileno(564775548);
  System.out.println("account holder name :"+ne.getacc_name());
  System.out.println(" acc branch is :"+ne.get_Branch());
  System.out.println(ne.get_accountnumbber());
  System.out.println(ne.get_mobileno());
}

}
