import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Main {

        public static int lengthOfLongestSubstring(String s) {
            if (s==null)
                return 0;
            char []sc=s.toCharArray();
            int max=0;
            int j=0;
            Set<Character> set=new HashSet<Character>();
            for (int i=0;i<sc.length;i++){
                if (!set.contains(sc[i])){
                    set.add(sc[i]);
                    continue;
                }
                int tempj=j;
                while (sc[j]!=sc[i])
                    j++;
                int tempmax=i-tempj;
                if (tempmax>max)
                    max=tempmax;
                set.clear();
                for (int k=j;k<i;k++){
                    set.add(sc[k]);
                }
                j++;
            }
            int tm=sc.length-j;
            if (tm>max)
                max=tm;
            return max;
        }
}
