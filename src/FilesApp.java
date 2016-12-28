import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by liveuser on 16.12.16.
 */
public class FilesApp {
    public FilesApp(){
        File file = new File("texttest.txt");
        try(FileWriter writer = new FileWriter(file, false))
        {
            String text = "random text here";
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileReader reader = new FileReader(file))
        {

            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args){
        new FilesApp();
    }

}