/**
Write a function to find the longest common prefix string amongst an array of strings.
*/
class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 1) return strs[0];
    if (strs.length ==2) return strs[0] == strs[1]? strs[0]+strs[1]:strs[0];
    StringBuffer sb = new StringBuffer();
    sb.append(strs[0]);
    for (int i=0;i<strs.length;i++) {
      if (i == strs.length -1 ) break;
      if (strs[i] == strs[i+1]) {
        sb.append(strs[i+1]);
      }
      break;
    }
    return sb.toString();

  }
}
