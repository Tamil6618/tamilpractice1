package tamiljava.oops.inheritance.encapsulation;

public class bank 
{
    public String acc_name;
    private double accountnumbber;
    private String branch;
    private String bankname;
    private long mobileno;
    
    public String getacc_name()
    {
    return acc_name;
    }
    public void setacc_name(String name)
    {
        this.acc_name=acc_name;
    }
    public double get_accountnumbber()
    {
       return accountnumbber; 
    }
    public void set_accountnumber(double accountnumbber)
    {
        this.accountnumbber=accountnumbber;
    }
    public String get_Branch()
    {
        return branch;
    }
    public void set_Branch(String branch)
    {
     this.branch=branch;
    }
    public long get_mobileno()
    {
        return mobileno;
    }
    public void set_mobileno(long mobileno)
    {
     this.mobileno=mobileno;
    }


}
