import java.io.*;

public class fileRead {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("D:\\Btech\\FW.txt");

            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                f.close();
            }
        }

        catch(IOException i){
            System.out.println(i);

        }
    }
}
