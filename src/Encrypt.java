public class Encrypt {
    public char[] encode(String sentence,int shift){
        char[] letters = sentence.toCharArray();
        int ascii1;
        int count = 0;
        for(char ch:letters){
            ascii1 = (int)ch;
            if (ascii1 != 32){
                ascii1 += shift;
                letters[count] = (char)ascii1;
                count++;
            }
            else{
                letters[count] = (char)ascii1;
                count++;
            }
        }

        return letters;
    }
}
