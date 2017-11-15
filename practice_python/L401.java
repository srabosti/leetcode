class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> l = new ArrayList<>();
        for(int i=0;i<12;i++)
            for(int m=0;m<60;m++)
                if((Integer.bitCount(i) + Integer.bitCount(m))==num)
                    l.add(String.format("%d:%02d",i,m));
        return l; 
    }
}