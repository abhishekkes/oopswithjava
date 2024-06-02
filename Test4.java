import java.util.ArrayList;
class Test4 {
    public static void main(String args[])
    {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        System.out.println("Using lambda expression to print all elements");
        
        arrL.forEach(n -> System.out.println(n));
        System.out.println("Using lambda expression to print even elements");
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}