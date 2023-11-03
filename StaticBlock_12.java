package accenture_programs;



public class StaticBlock_12
{
  static String sentence;
  static int number;
  static
   {
        sentence = "Welcome to DataFlair";
        number = 69;
   }
   public static void main(String args[])
   {
        System.out.println(sentence);
        System.out.println("Value of Integer: "+number);
   }
}

