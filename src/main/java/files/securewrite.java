package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class securewrite
 {
    public static void main(String[] args) throws IOException
     {
        File file =new File("E:\\tamil.txt");
    
      

        FileOutputStream fo = new FileOutputStream(file);
        DeflaterOutputStream dos=new DeflaterOutputStream(fo);


        Scanner ss = new Scanner(System.in);
        System.out.println("which content to be write the file");
        String con=ss.nextLine();
        dos.write(con.getBytes());

        System.out.println(file.getName()+"written succesfully");
        dos.close();
        fo.close();
    }
}
