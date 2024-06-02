import java.io.CharArrayReader;  
import java.io.IOException;  
  
public class CharacterStreamExample   
{  
    public static void main(String[] args) {  
        // Creates an array of characters  
        char[] array = {'H','e','l','l','o'};  
        try {  
            CharArrayReader reader=new CharArrayReader(array);  
            System.out.print("The characters read from the reader:");  
            int charRead;  
            while ((charRead=reader.read())!=-1) {  
                System.out.print((char)charRead+",");  
            }  
            reader.close();  
        } catch (IOException ex)   
{  
            ex.printStackTrace();  
        }  
    }  
}  