package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class readfile 
{
    public static void main(String[] args) throws IOException  
    {

        File f =new File("E:\\newfile.txt");
    

        FileInputStream fi = new FileInputStream(f);
        int size =fi.available();
        byte [] gettingAndvalues= new byte[fi.available()];
        fi.read(gettingAndvalues);
        String obj =new String(gettingAndvalues);
        System.out.println(obj);
       
        
        
        
    }
    
}
