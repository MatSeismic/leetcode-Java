/** 811. Subdomain Visit Count */

class Solution811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> counts = new HashMap();
        for (String s : cpdomains) {
            String[] cpinfo = s.split("\\s+");
            String[] domains = cpinfo[1].split("\\.");
            int count = Integer.parseInt(cpinfo[0]);
            String cur = "";
            for (int i = domains.length - 1; i >= 0; i--) {
                cur = domains[i] + (i < domains.length - 1 ? "." : "") + cur;
                counts.put(cur, counts.getOrDefault(cur, 0) + count);
            }
        }

        List<String> ans = new ArrayList();
        for (String dom : counts.keySet())
            ans.add("" + counts.get(dom) + " " + dom);
        return ans;
    }
}