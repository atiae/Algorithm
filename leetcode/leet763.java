package leetcode;

public class leet763 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if((flowerbed[i]==0)&&(i==0||flowerbed[i-1]==0)&&(flowerbed.length-1==0||flowerbed[i+1]==0)){
                n--;
                if(n<0){
                    return true;
                }
                flowerbed[i]=1;
            }
        }
        return n<=0;
    }
}
