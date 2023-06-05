public static String getSmallestAndLargest(String s, int k) {
// 'smallest' must be the lexicographically smallest substring of length 'k'
// 'largest' must be the lexicographically largest substring of length 'k'
String s2 = s.substring(0, k);
String Min = s2;
String Max = s2;
for (int i = k; i < s.length(); i++) {
s2 = s2.substring(1, k) + s.charAt(i);
if (Max.compareTo(s2) < 0)
Max = s2;
if (Min.compareTo(s2) > 0)
Min = s2;
}
return Min + "\n" + Max;
}
