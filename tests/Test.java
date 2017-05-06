/**
 * 项目名称： untitled2
 * 创建人： 李栋良
 * 创建日期： 2017/5/6 10:46
 */
public class Test {

    @org.junit.Test
    public void test(){
        System.out.println(Main.lengthOfLongestSubstring(""));
    }

    @org.junit.Test
    public void testnull(){
        System.out.println(Main.lengthOfLongestSubstring(null));
    }

    @org.junit.Test
    public void testEasy(){
        System.out.println(Main.lengthOfLongestSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @org.junit.Test
    public void testNormal(){
        //获得100个随机序列；
        String test=getString(100);
        System.out.println(test);
        System.out.println(Main.lengthOfLongestSubstring(test));
    }

    /**
     *
     * @param n 随机字符的数量
     * @return
     */
    public static String getString(int n){
        String chars = "abcdefghijklmnopqrstuvwxyz";
        char []temp=new char[n];
        for (int i=0;i<n;i++){
            temp[i]=chars.charAt((int) (Math.random()*26));
        }
        return new String(temp);
    }

}
