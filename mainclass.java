public class Main {

   public static void main(String[] args) {

   String input = "";

   System.out.println("Enter your name");
   input = System.console() .readline();

   while( !input.equals("Exit")) {
   System.out.println("Hello " + input);
   System.out.println("Enter your name");
   input = System.console() .readline();
   }
 }
}
