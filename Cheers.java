//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String text = args[0];
                String textUpp = text.toUpperCase();
                int num = Integer.parseInt(args[1]);
                int x = text.length();
                int i = 0;

                String spl = "AEFHILMNORSX";
 
                while (i != x) {
                        char letter = textUpp.charAt(i);
                        if (spl.indexOf(letter) == -1) {
                        System.out.print("Give me a  ");
                        } else {
                        System.out.print("Give me an ");
                        }

                        System.out.println(textUpp.charAt(i) + ": " +
                        textUpp.charAt(i) + "!");
                        i = i +1;                        
                }
                System.out.println("What does that spell?");
                while (num > 0) {
                        System.out.println(textUpp + "!!!");
                        num = num - 1;
                }


	
        }
}
