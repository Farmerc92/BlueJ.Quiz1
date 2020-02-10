
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        byte [] strAsByte = valueToBeReversed.getBytes();
        byte [] result = new byte [strAsByte.length];
        for (int i = 0; i < strAsByte.length; i++){
            result[i] = strAsByte[strAsByte.length-i-1];
        }
        return new String(result);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int wordLength = word.length();
        int middle = wordLength/2;
        char c  = word.charAt(middle);
        return c;
        
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
       String c = String.valueOf(charToRemove);
       String newValue = value.replaceAll(c, "");
       return newValue;
       
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        return lastWord;
    }
}
