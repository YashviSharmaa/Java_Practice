import java.io.File;

public class fileInfo {
    public static void main(String[] args) {
        File f=new File("D:\\Btech\\LC.txt");
        if(f.exists()){
            System.out.println("File name : "+f.getName());
            System.out.println("Location : "+f.getAbsolutePath());
            System.out.println("File Writeable : "+f.canWrite());
            System.out.println("File Readable : "+f.canRead());
            System.out.println("File size : "+f.length());
            //System.out.println("File removed : "+f.delete());
        }
        else{
            System.out.println("File dosent exist");

        }
    }
}
