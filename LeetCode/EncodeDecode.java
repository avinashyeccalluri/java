/**
 * EncodeDecode
 */import java.util.*;
public class EncodeDecode {
    private static Map<String,String> map=new HashMap<>();

    public static void main(String[] args) {
        
    }
    public String encode(String longUrl) {
        String original=Integer.toHexString(longUrl.hashCode());
        map.put(original, longUrl);
        return original;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}