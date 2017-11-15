class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        ArrayList<String> arr = new ArrayList<String>();
        HashMap<String, Integer> h= new HashMap<String, Integer>();
        for(int i=0;i<list1.length;i++){
            h.put(list1[i],i);
        }
        
        int sum=0;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(h.containsKey(list2[i])){
                sum = h.get(list2[i])+i;
                
                if(sum<minSum){
                    minSum = sum;
                    arr.clear();
                    arr.add(list2[i]);
                }
                
                else if(sum==minSum){
                    arr.add(list2[i]);
                }
            }
            
        }
        
        return arr.toArray(new String[arr.size()]);
        
    }
}