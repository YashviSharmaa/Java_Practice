import java.io.File;
import java.io.IOException;

public class fileHand {
    public static void main(String[] args) {
        File f=new File("D:\\Btech\\LC.txt");
        try{

            if(f.createNewFile()){
                System.out.println("file created successfully");
            }
            else{
                System.out.println("already exist file");
            }
        }
        catch(IOException e){
            System.out.println("exception handelled");
        }

    }
}
