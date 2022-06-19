/*
*   https://leetcode.com/problems/first-unique-character-in-a-string/submissions/
*/

public class _387_First_Unique_Character_in_a_String {
    
    public static int firstUniChar(String s) {
        int min = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            int ind = s.indexOf(i);
            if (ind != -1 && ind == s.lastIndexOf(i)) { 
                min = Math.min(ind,min); 
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
    
    public static void main(String[] args) {
        String s = "leetode";
        System.out.println(firstUniChar(s)); 
    }
}
