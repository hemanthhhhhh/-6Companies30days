class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int i = 0;i + 9 < s.length();i++) {
            String substr = s.substring(i, i + 10);
            if(seen.contains(substr)) {
                repeated.add(substr);
            } 
            seen.add(substr);
        }
        return new ArrayList<String>(repeated);
    }
}
