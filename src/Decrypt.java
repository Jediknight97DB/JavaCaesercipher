public class Decrypt {
    public char[] decode(String sentence, int shift){
        char[] letters = sentence.toCharArray();
        int count = 0;
        int ascii1,ascii2;
        for(char ch: letters){
            ascii1 = (int)ch;
            if(ascii1 != 32){
                ascii2 = ascii1 - shift;
            }
            else{
                ascii2 = ascii1;
            }
            letters[count] = (char)ascii2;
            count++;
        }
        return letters;
    }
}
