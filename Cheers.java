// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String quote = args[0].toUpperCase(), anCharacters = "AEFHILMNORSX";
                int numOfCheers = Integer.parseInt(args[1]);
                boolean flag = false; // A flag to check whether or not an 'an' character was found                  
                for (int i = 0; i < quote.length(); i++) {
                        for (int j = 0; j < anCharacters.length(); j++) { // Loop that'll check all special cases
                                if (quote.indexOf(anCharacters.charAt(j), i) == i) {
                                        System.out.println("Give me an " + quote.charAt(i) + ": " + quote.charAt(i) +"!");
                                        flag = true; // If special character was found, break the loop
                                        break;
                                }  
                        }
                        if (flag)
                        flag = false; // Update flag for the next itteration of special character(s)
                        else
                        System.out.println("Give me a  " + quote.charAt(i) + ": " + quote.charAt(i) +"!");            
                }
                // Printing Final results n number of times :
                System.out.println("What does that spell?");
                for (int i = 0; i < numOfCheers; i++) {
                        System.out.println(quote + "!!!");
                }
        }
}
