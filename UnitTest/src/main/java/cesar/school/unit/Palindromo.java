package cesar.school.unit;

public class Palindromo {
    public static boolean checkPalindromo(String wordToBeChecked){
        int wordLen = wordToBeChecked.length();

        if (wordToBeChecked.length() <=1){
            return true;
        }

        if(wordToBeChecked.charAt(0) == wordToBeChecked.charAt(wordLen)){

            return checkPalindromo(wordToBeChecked.substring(1,wordLen-1));
        }
            return false;
    }

}
