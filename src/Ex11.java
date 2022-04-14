public class Ex11 {
   public static void main(String[] args) {
     String var = "banana";
     System.out.println(var);  
     StringBuilder varb = new StringBuilder(var); {
         var = varb.reverse().toString();
         System.out.println(var);
     }
   } 
}
