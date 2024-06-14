class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> temp = new HashMap<>();

        for(int a : arr){
            temp.put(a, temp.getOrDefault(a,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int a : temp.values()){
            if(set.contains(a)){
                return false;
            }
            set.add(a);
        }
        return true;
    }
}
