class Solution {
  public int reverse(int x) {
    StringBuffer sb = new StringBuffer();
    if ((x < 10 && x>=0)||(x<=0 && x > -10)) return x;
    int y = Math.abs(x);
    Boolean flag = false;
    while (y!=0) {
      int r = y%10;
      if (r !=0 || flag == true) {
        sb.append(r);
        flag = true;
      }

      y = y/10;
    }
    try {
      return Integer.valueOf(x<0?"-"+sb.toString():sb.toString());
    }
    catch(Exception e) {
      return 0;
    }

  }
}
