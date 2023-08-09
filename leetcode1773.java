class leetcode1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res=0;
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type") && ((List<List<String>>) items.get(i)).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && ((List<List<String>>) items.get(i)).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && ((List<List<String>>) items.get(i)).get(2).equals(ruleValue)) res++;
            
        }
        return res;
    }
}
