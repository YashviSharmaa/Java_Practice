import java.io.*;

public class fileWrite {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("D:\\Btech\\FW.txt");

            try{
                f.write("Hi ... my name is YASHVI ...");
            }
            finally{
                f.close();
            }
            System.out.println("Success :)");
    }
        catch(IOException i){
            System.out.println(i);
        }
    }
}
