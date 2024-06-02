import java.io.ByteArrayInputStream;  
  
public class ByteStreamExample   
{  
    public static void main(String[] args)   
      {  
        // Creates the array of bytes  
        byte[] array = {10,20,30,40};  
        try {  
            ByteArrayInputStream input=new ByteArrayInputStream(array);  
            System.out.println("The bytes read from the input stream:");  
            for (int i=0;i<array.length;i++)   
            {  
                // Reads the bytes  
                int data=input.read();  
                System.out.print(data+",");  
            }  
            input.close();  
        } catch (Exception ex)   
{  
            ex.getStackTrace();  
        }  
    }  
}  