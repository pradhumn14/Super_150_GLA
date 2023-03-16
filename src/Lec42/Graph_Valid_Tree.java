package Lec42;

// premium leetcode question
// https://leetcode.com/problems/graph-valid-tree/

import java.util.*;

public class Graph_Valid_Tree {

    public static void main(String[] args) {
        int n =5;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        System.out.println(validTree(n, edges));
    }

    public static boolean validTree(int n, int[][] edges) {
        // write your code here
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }

        return isValid(map);

    }

    public static boolean isValid(HashMap<Integer, List<Integer>> map ) {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        int count = 0;

        for (int src : map.keySet()) {

            if (visited.contains(src)) {
                continue;
            }
            count++;

            st.push(src);

            while (!st.isEmpty()) {

                // step-1: remove
                int rv = st.pop();

                // step-2: if already visited then ignore it
                if (visited.contains(rv)) {
                    return false;
                }

                // step-3: visited mark
                visited.add(rv);

                // step-4: same word
//                System.out.print(rv + " ");

                //step-5: add neighbours
                for (int nbrs : map.get(rv)) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }

            }

        }
        return count == 1;
    }

}
