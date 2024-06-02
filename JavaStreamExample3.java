import java.util.stream.*;  
public class JavaStreamExample3 {  
    public static void main(String[] args){  
        Stream.iterate(1, element->element+1)  
        .filter(element->element%2==0)  
        .limit(10)  
        .forEach(System.out::println);  
    }  
}  