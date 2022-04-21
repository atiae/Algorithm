package leetcode;


public class leet76 {
    public static  String minWindow(String s, String t) {
        int[] chars = new int[60];
        boolean[] flag = new boolean[60];

        for(int i=0;i<t.length();i++){
            int dx = t.charAt(i)-'A';
            chars[dx]++;
            flag[dx] = true;
        }

        int cnt=0;
        int l=0;
        int min_l=0;
        int min_size = s.length()+1;
        for(int r=0;r<s.length();r++){
            int dx = s.charAt(r) - 'A';
            if(flag[dx]){
                if(--chars[dx] >= 0){
                    ++cnt;
                }
                while(cnt == t.length()){
                    int d = s.charAt(l) - 'A';
                    if(r-l +1 <min_size){
                        min_l = l;
                        min_size = r-l+1;
                    }
                    if(flag[d]&& ++chars[d]>0){
                        --cnt;
                    }
                    ++l;
                }
            }
        }
        return min_size > s.length()?"":s.substring(min_l, min_size+min_l);
    }
    
    public static void main(String[] args){
        String s = minWindow("ADOBECODEBANC", "ABC");
        System.out.println(s);
    }
}
