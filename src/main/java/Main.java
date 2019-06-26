import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean comp(int[] a, int[] b) {

        if (a == null && b == null) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (a.length == 0 && b.length == 0) {
            return true;
        }

        if (a.length != b.length) {
            return false;
        }

        Set<Integer> aset = new HashSet();
       Set<Integer> set = new HashSet();

        for(int n : a ){
            set.add(n*n);
            aset.add(n);
        }
        for(int m : b ){
            set.add(m);
        }

        System.out.println(set.size() );
        System.out.println(a.length);

        if(set.size() == aset.size() ){
            return  true;
        }
        return  false;

    }
}
