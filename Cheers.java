// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String quote = args[0].toUpperCase(), anCharacters = "AEFHILMNORSX";
                int numOfCheers = Integer.parseInt(args[1]);
                boolean flag = false;                   
                for (int i = 0; i < quote.length(); i++) {
                        for (int j = 0; j < anCharacters.length(); j++) {
                                if (quote.indexOf(anCharacters.charAt(j), i) == i) {
                                        System.out.println("Give me an " + quote.charAt(i) + ": " + quote.charAt(i) +"!");
                                        flag = true;
                                        break;
                                }  
                        }
                        if (flag)
                        flag = false;
                        else
                        System.out.println("Give me a " + quote.charAt(i) + ": " + quote.charAt(i) +"!");            
                }
                System.out.println("What does that spell?");
                for (int i = 0; i < numOfCheers; i++) {
                        System.out.println(quote + "!!!");
                }
        }
}
