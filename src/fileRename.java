import java.io.*;

public class fileRename {
    public static void main(String[] args) {
        File f=new File("D:\\Btech\\FW.txt");
        File r=new File("D:\\Btech\\FileWrite.txt");

        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File dosent exist ...");
        }
    }
}
