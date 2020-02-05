/** 929. Unique Email Address */

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set set = new HashSet();
        int count = 0;
        for (String s : emails) {
            int idx = s.indexOf('@');
            String ln = s.substring(0, idx).replace(".", "").split("\\+")[0];
            String dn = s.substring(idx);
            s = ln.concat(dn);
            if (set.add(s)) {
                count++;
            }
        }

        return count;
    }
}