package leetcode;

public class leet344 {
    public void reverseString(char[] s){
        swap(0,s.length-1,s);
    }

    public void swap(int start,int end,char[] s){
        if(start >= end){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        swap(start+1,end-1,s);
    }

    public void reverseStringFor(char[] s){
        int n = s.length;
        for(int start=0,end=n-1;start>=end;++start,--end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }
    }
}
