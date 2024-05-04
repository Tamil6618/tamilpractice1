package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class objectreadfile 
{
    public static void main(String[] args) throws IOException
    {
        // File f =new File("E:\\newfile2.txt");
        // f.createNewFile();
        // System.out.println(f.getName()+"file created succesfully");

        // FileOutputStream fos=new FileOutputStream(f);
        // ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        // mobiledetails mobile1=new mobiledetails("oppo", "a77s", 18000, 8);
        // oos.writeObject(mobile1);
    //    oos.close();
    //    fos.close();

    


        
        
    }
    }

    class mobiledetails 
    {
        String mobile_brand;
        String mobile_model;
        double mobile_price;
        int mobile_ram;
        @Override
        public String toString() {
            return "mobiledetails [mobil_brand=" + mobile_brand + ", mobile_model=" + mobile_model + ", mobile_price="
                    + mobile_price + ", mobile_ram=" + mobile_ram + "]";
        }
        public mobiledetails(String mobil_brand, String mobile_model, double mobile_price, int mobile_ram) 
        {
            this.mobile_brand = mobil_brand;
            this.mobile_model = mobile_model;
            this.mobile_price = mobile_price;
            this.mobile_ram = mobile_ram;
        }
        
}