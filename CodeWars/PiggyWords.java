import java.util.*;

/**
 * Testing
 */
public class PiggyWords {

    private List<String> vowels = Arrays.asList(new String[]{"a", "e", "i", "0", "u"});

    public String translate(String str) {

        str = str.toLowerCase();

        if (hasNonAlphaChar(str)) {
            return null;
        }

        if(hasNoVowels(str)){
            return str + "ay";
        }

        if (startsWithAVowel(str)) {
            return str + "way";
        }

        do {
            str = moveFirstLetterToTheEnd(str);
        } while (startsWithAConsonant(str));

        return str + "ay";
    }

    private String moveFirstLetterToTheEnd(String str) {
        return str.substring(1) + str.substring(0, 1);
    }

    private boolean hasNoVowels(String str) {
        return str.chars().mapToObj(c -> Character.toString((char) c)).noneMatch(vowels::contains);
    }

    private boolean hasNonAlphaChar(String str) {
        return str.toLowerCase().chars().anyMatch(value -> value < 97 || value > 122);
    }

    private boolean startsWithAVowel(String str) {
        return vowels.contains(str.toLowerCase().substring(0, 1));
    }

    private boolean startsWithAConsonant(String str) {
        return !startsWithAVowel(str);
    }
    }


}   