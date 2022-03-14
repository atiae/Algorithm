package leetcode;

import java.util.Arrays;

public class leet455 {
    public int findContentChildren(int[] childrens,int[] cookies){
        Arrays.sort(childrens);
        Arrays.sort(cookies);
        int children = 0;
        int cookie = 0;
        while(children<childrens.length && cookie<cookies.length){
            if(childrens[children]<=cookies[cookie]){
                children++;
            }
            cookie++;
            
        }
        return children;
    }
}
