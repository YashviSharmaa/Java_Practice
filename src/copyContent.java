import java.io.*;
public class copyContent {
    public static void main(String[] args) throws IOException {
        FileInputStream r=new FileInputStream("D:\\Btech\\FileWrite.txt");
        FileOutputStream w=new FileOutputStream("D:\\Btech\\LC.txt");

        int i;
        while((i=r.read())!=-1){
            w.write((char)i);

        }
        System.out.println("Data copied ....");

    }
}
