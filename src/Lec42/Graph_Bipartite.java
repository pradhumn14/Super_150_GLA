package Lec42;

import java.util.*;

public class Graph_Bipartite {

    class Solution {
        public boolean isBipartite(int[][] graph) {

            int src = 0;
            Map<Integer, Integer> visited = new HashMap<>();
            Queue<bipartitePair> q = new LinkedList<>();
            for (src = 0; src < graph.length; src++) {
                if (visited.containsKey(src)) {
                    continue;
                }
            }

//            q.add(new bipartitePair(src, 0);

            while (!q.isEmpty()) {

                // step-1: remove
                bipartitePair rv = q.poll(); // (1, 0)

                // step-2: if already visited then ignore it
//                if (visited.containsKey(rv.vtx)) {
//                    if (visited.get(rv.vtx != rv.lv)) {
//                        return false;
//                    } else {
//                        continue;
//                    }
//                }

                // step-3: visited mark
                visited.put(rv.vtx, rv.lv);

                //step-5: add neighbours
                for (int nbrs : graph[rv.vtx]) {
                    if (!visited.containsKey(nbrs)) {
                        q.add(new bipartitePair(nbrs, rv.lv + 1));
                    }
                }
            }
            return true;
        }

    }

    class bipartitePair {
        int vtx;
        int lv;

        public bipartitePair(int src, int lv) {
            this.vtx = vtx;
            this.lv = lv;
        }
    }

}
