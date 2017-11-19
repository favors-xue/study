import java.util.HashMap;
import java.util.Map;

class Solution {
  private int lo,maxLen;

  public String longestPalindrome(String s) {
    if (s.length() == 1) return s;
    if (s.length() == 2) return s.charAt(0) == s.charAt(1)?s:s.substring(0,1);
    if (s.length() == 3 && s.charAt(0) == s.charAt(2)) return s;
    Map<Character,Integer> reco = new HashMap<>();
    int length =0,start =0;
    for (int i=0;i<s.length();i++){
      char c = s.charAt(i);
      if (reco.get(c) == null) {
        reco.put(c,i);
      }
      else {
        int pos = reco.get(c);
        if (pos == i - 2 ) {
            findPalind(pos,i,s);
        }
        else if (pos == i -1){
            findPalind(pos,i,s);
            if (pos-1>=0&& s.charAt(i) == s.charAt(pos-1))
            findPalind(pos-1,i,s);
        }
        reco.put(c,i);

      }
      if (maxLen == s.length()) break;
    }
    return s.substring(lo,lo+(maxLen==0?1:maxLen));
  }

  private void findPalind(int l, int r,String s) {
    while (l>=0 && r<s.length() &&s.charAt(l) == s.charAt(r)) {
        l--;
        r++;
    }
    if (this.maxLen < r-l-1) {
      this.lo = l +1;
      this.maxLen = r-l-1;
    }
  }
}
