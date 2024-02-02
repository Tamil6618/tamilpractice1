package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class secureread 
{
    public static void main(String[] args) throws IOException  
    {
        
        File file =new File("E:\\tamil.txt");
    

        FileInputStream fi = new FileInputStream(file);
        int size1 =fi.available();
        InflaterInputStream ifs = new InflaterInputStream(fi);
        
        byte ss[] = new byte[size1];
        ifs.read(ss);
        System.out.println(new String(ss));
        ifs.close();
        fi.close();
        
       
    }
}
