package leetcode;

public class test {
    public static void main(String[] args) {      
        String youNumber = "21";      
        // 0 代表前面补充0      
        // 4 代表长度为4      
        // d 代表参数为正数型      
        String str = String.format("%04d", Integer.parseInt(youNumber));      
        System.out.println(str); // 0001      
      }     
  
}
