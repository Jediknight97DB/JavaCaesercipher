import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner myObj = new Scanner(System.in);
        int shifter;
        String sentence;
        char[] changed;
        String input;
        boolean want_to_run = true;
        while(want_to_run){
            System.out.print("Do you want to run the program?(Y/N)");
            input = myObj.nextLine();
            input = input.toLowerCase();
            if(input.equals("y")){
                System.out.print("Type 'encode' to encrypt or 'decode' to decrypt: ");
                input = myObj.nextLine();
                input = input.toLowerCase();
                if (input.equals("encode")){
                    System.out.print("Enter the shift number: ");
                    input = myObj.nextLine();
                    try{
                        shifter = Integer.parseInt(input);
                    }
                    catch(NumberFormatException e){
                        shifter = 4;
                        System.out.printf("You entered the wrong format %d, so default value of 4 will be used.\n",input);
                    }
                    System.out.print("Enter the sentence for encoding: ");
                    sentence = myObj.nextLine();
                    Encrypt code1 = new Encrypt();
                    changed = code1.encode(sentence, shifter);
                    sentence = String.copyValueOf(changed);
                    System.out.printf("The encoded sentence is %s\n", sentence);
                }
                else if(input.equals("decode")){
                    System.out.print("Enter the shift number: ");
                    input = myObj.nextLine();
                    try{
                        shifter = Integer.parseInt(input);
                    }
                    catch(NumberFormatException e){
                        shifter = 4;
                        System.out.printf("You entered the wrong format %d, so default value of 4 will be used.\n",input);
                    }
                    System.out.print("Enter the sentence for decoding: ");
                    sentence = myObj.nextLine();
                    Decrypt code2 = new Decrypt();
                    changed = code2.decode(sentence, shifter);
                    sentence = String.copyValueOf(changed);
                    System.out.printf("The decoded sentence is %s\n", sentence);
                }

            } else if (input.equals("n")) {
                want_to_run = false;

            }
        }





    }
}