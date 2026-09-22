class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] ch=s.toCharArray();
        char[] c=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        int flag=0;
        for(int i=0;i<c.length;i++){
            if(ch[i]==c[i])
            continue;
            else
            {
                flag=1;
                break;
            }
        }
            if(flag!=1)
            return true;
            else
            return false;
    }
}