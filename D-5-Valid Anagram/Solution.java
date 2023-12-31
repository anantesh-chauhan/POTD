class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;
    int[] cnt = new int[26];
    for (int i = 0; i < s.length(); i++)
      cnt[s.charAt(i) - 'a']++;

    for (int i = 0; i < t.length(); i++) {
      if (cnt[t.charAt(i) - 'a'] > 0)
        cnt[t.charAt(i) - 'a']--;
      else
        return false;
    }
    return true;
  }
}