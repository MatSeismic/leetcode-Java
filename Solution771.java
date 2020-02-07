class Solution771 {
    public int numJewelsInStones(String J, String S) {
        Set<String> uniqueJ = new HashSet<String>();
        for(int i=0;i<J.length();i++){
            String s1=String.valueOf(J.charAt(i));
            uniqueJ.add(s1);
        }
        
        int cnt=0;
        for(int i=0;i<S.length();i++){
            if(uniqueJ.contains(String.valueOf(S.charAt(i)))){
                cnt++;
            }
        }
        return cnt;
    }
}