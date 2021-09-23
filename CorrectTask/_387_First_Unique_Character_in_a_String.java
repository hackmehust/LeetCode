package CorrectTask;

/*
*   https://leetcode.com/problems/first-unique-character-in-a-string/submissions/
*/

public class _387_First_Unique_Character_in_a_String {
    
    public static int firstUniChar(String s) {
        int min = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            int ind = s.indexOf(i);
            if (ind != -1 && ind == s.lastIndexOf(i)) { //Nếu vị trí đầu và cuối của 1 kí tự bằng nhau thì nó xuất hiện duy nhất
                min = Math.min(ind,min); //Tìm vị trí mà chữ nào xuất hiện 1 lần nhỏ nhất
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
    
    public static void main(String[] args) {
        String s = "leetode";
        System.out.println(firstUniChar(s)); 
    }
}
