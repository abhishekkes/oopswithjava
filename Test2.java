interface TestInterface {
   boolean test(int a);
}
class Test2 {
   // lambda expression can be passed as first argument in the check() method
   static boolean check(TestInterface ti, int b) {
      return ti.test(b);
   }
}
public class LambdaExpressionPassMethodTest {
   public static void main(String arg[]) {
      // lambda expression
      boolean result = Test2.check((x) -> (x%2) == 0, 10);
      System.out.println("The result is: "+ result);
   }
}