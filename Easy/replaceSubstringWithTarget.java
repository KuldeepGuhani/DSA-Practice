package DSA_Learnig2025.Arrays;

public class replaceSubstringWithTarget {

    public static void main(String[] args) {
        String orStr = "the cat sat on the cat mat";
        String target = "cat";
        String replacement = "dog";
//        System.out.print(" " + replaceSubstring(orStr, target, replacement));
        System.out.print(" "+replaceSubstringOPT(orStr, target, replacement));
        System.out.println();
    }

    public static String replaceSubstring(String orgStr, String target, String replacement) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = orgStr.length();
        int tLen = target.length();
        System.out.println("n " + n + " tlen " + tLen + " n-Len" + (n - tLen));

        while (i <= n - tLen) {
            if (orgStr.substring(i, i + tLen).equals(target)) {
                sb.append(replacement);
                i += tLen;
            } else {
                sb.append(orgStr.charAt(i));
                i++;
            }
        }
        System.out.println("i2 : "+i);
        while (i<n) {
            sb.append(orgStr.charAt(i));
            i++;
        }
        return sb.toString();
    } //TC =O(n * m) where n is the length of original and m is the length of target.
    
    
    
    public static String replaceSubstringOPT(String orgStr, String target, String replacement) {
        
        return orgStr.replace(target, replacement); //TC=O(N) roughly
    }

}

