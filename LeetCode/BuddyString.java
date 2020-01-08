// package LeetCode;

// /**
//  * BuddyString
//  */
// public class BuddyString {

//   public static void main(String[] args) {
    
//   }
//   public static boolean buddyStrings(String A, String B) {
//         if(A.length()!=B.length()) return false;
//         if(A.length()==2 && B.length()==2){
//           StringBuilder a=new StringBuilder(B);          
//           return A==a.reverse().toString();
//         }
//         for(int i=0;i<A.length();i+=2){
//           if(A.length()%2==0){

//           }
//         }
//   }
// }
// public int longestPalindrome(String s) {
//   int[] map = new int[256];
//   for (char c : s.toCharArray()) {
//       map[c]++;
//   }
//   boolean hasOdd = false;
//   int cnt = 0;
//   for (int i = 0; i < 256; ++i) {
//       if (map[i] % 2 == 1) hasOdd = true;
//       cnt += map[i]/2;
//   }
//   cnt *= 2;
//   if (hasOdd) cnt++;
//   return cnt;
// }