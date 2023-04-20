package sem2Test6;

import java.util.*;

public class Monu_Bhaiya_And_Pairs {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] wrds = new String[n];

        for (int p = 0; p < n; p++) {
            wrds[p] = in.next();
        }

        List<List<Integer>> pairs = pairsPalindrome(wrds);

        int countt = pairs.size();
        int total = 0;

        for (List<Integer> pair : pairs) {
            total += pair.get(0) + pair.get(1);
        }

        System.out.println(countt + " " + total);

    }

    public static boolean isPal(String st) {

        int lft = 0;
        int rgt = st.length() - 1;

        while (lft < rgt) {

            if (st.charAt(lft) != st.charAt(rgt)) {

                return false;

            }

            lft++;
            rgt--;

        }

        return true;
    }

    public static List<List<Integer>> pairsPalindrome(String[] wrds) {

        List<List<Integer>> sol = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (int p = 0; p < wrds.length; p++) {

            String ulta = new StringBuilder(wrds[p]).reverse().toString();
            map.put(ulta, p);

        }

        for (int p = 0; p < wrds.length; p++) {

            for (int k = 0; k <= wrds[p].length(); k++) {

                String lft = wrds[p].substring(0, k);
                String rgt = wrds[p].substring(k);

                if (isPal(lft) && map.containsKey(rgt) && map.get(rgt) != p) {

                    List<Integer> pr = new ArrayList<>();

                    pr.add(map.get(rgt));
                    pr.add(p);

                    sol.add(pr);

                }

                if (isPal(rgt) && map.containsKey(lft) && map.get(lft) != p && k > 0) {

                    List<Integer> pr = new ArrayList<>();

                    pr.add(p);
                    pr.add(map.get(lft));

                    sol.add(pr);

                }

            }

        }

        return sol;
    }


}
