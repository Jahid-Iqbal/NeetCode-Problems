package two_pointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;
        while (l<r){
            while (l<r && !charCheck(s.charAt(l)))
                l++;
            while (r>l && !charCheck(s.charAt(r)))
                r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            l++;
            r--;
        }

        return true;
    }

    boolean charCheck(char c){
        return (c>='a' && c<='z'||
                c>='A' && c<='Z'||
                c>='0' && c<='9');
    }

    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome("race a car"));

    }

}
