class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character , Integer> map1=new HashMap<>();
        HashMap<Character , Integer> map2=new HashMap<>();
        for(int i=0;i<m;i++){
            char x=s.charAt(i);
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        for(int i=0;i<n;i++){
            char y=t.charAt(i);
            map2.put(y,map2.getOrDefault(y,0)+1);
        }
        for(int i=0;i<m;i++){
            char x=s.charAt(i);
            if(!map1.getOrDefault(x,0).equals((int)map2.getOrDefault(x,0))){
                return false;
            }
        }
        return true;
        

    }
}
