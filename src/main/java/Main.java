import java.util.*;

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

        TreeMap<Integer, Integer> mapA = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> mapB = new TreeMap<Integer, Integer>();

        for (int n : a) {
            if (!mapA.keySet().contains(n * n)) {
                mapA.put(n * n, 1);
            } else if (mapA.keySet().contains(n * n)) {
                int tempValue = mapA.get(n * n);
                mapA.put(n * n, tempValue + 1);
            }
        }

        for (int m : b) {
            if (!mapB.keySet().contains(m)) {
                mapB.put(m, 1);
            } else if (mapB.keySet().contains(m)) {
                int tempValue = mapB.get(m);
                mapB.put(m, tempValue + 1);
            }
        }

        Object[] keysA = mapA.keySet().toArray();
        Object[] keysB = mapB.keySet().toArray();

        boolean result = true;
        for (Object x : keysA) {

            if (mapA.get(x) == mapB.get(x)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;

    }


//        Set<Integer> aset = new HashSet();
//       Set<Integer> set = new HashSet();
//
//        for(int n : a ){
//            set.add(n*n);
//            aset.add(n);
//        }
//        for(int m : b ){
//            set.add(m);
//        }
//
//        System.out.println(set.size() );
//        System.out.println(a.length);
//
//        if(set.size() == aset.size() ){
//            return  true;
//        }
//        return  false;


}
