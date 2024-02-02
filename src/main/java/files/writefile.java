package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class writefile 
{
    public static void main(String[] args) throws IOException
     {
        File f =new File("E:\\newfile.txt");
        f.createNewFile();
        System.out.println(f.getName()+"file created succesfully");

        FileOutputStream fo = new FileOutputStream(f);
        Scanner ss = new Scanner(System.in);
        System.out.println("which content to be write the file");
        String con=ss.nextLine();
        fo.write(con.getBytes());

        System.out.println(f.getName()+"written succesfully");
    }
}
