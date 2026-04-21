class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
             if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
             }else{
                map.put(ch,1);
             }
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch2:t.toCharArray()){
             if (map2.containsKey(ch2)){
                map2.put(ch2,map2.get(ch2)+1);
             }else{
                map2.put(ch2,1);
             }
        }
        if(map.equals(map2)){
        return true;
        }else{
            return false;
        }

    }
}
