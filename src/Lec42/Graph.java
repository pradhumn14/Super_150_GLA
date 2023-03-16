package Lec42;

import java.util.*;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Graph(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);  // v1 -> v2
        map.get(v2).put(v1, cost);  // v2 -> v1
    }

    public boolean containsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean containsVertex(int v1) {
        return map.containsKey(v1);
    }

    public int noOfEdge() {
        int sum = 0;
        for (int key : map.keySet()) {
            sum += map.get(key).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
        if (containsEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void removeVertex(int v1) {
        for (int key : map.get(v1).keySet()) {
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }

    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public boolean hasPath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, des, visited);
                if (ans) {
                    return ans;
                }
            }
        }
        visited.remove(src);
        return false;
    }

    public void printAllPath(int src, int des, HashSet<Integer> visited, String ans) {
        if (src == des) {
            System.out.println(ans + src);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printAllPath(nbrs, des, visited, ans + src);
            }
        }
        visited.remove(src);
//        return false;
    }

    public boolean BFS(int src, int des) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (!q.isEmpty()) {

            // step-1: remove
            int rv = q.poll();

            // step-2: if already visited then ignore it
            if (visited.contains(rv)) {
                continue;
            }

            // step-3: visited mark
            visited.add(rv);

            // step-4: same word
            if (rv == des) {
                return true;
            }

            //step-5: add neighbours
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }

        }

        return false;

    }

    public boolean DFS(int src, int des) {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.push(src);

        while (!st.isEmpty()) {

            // step-1: remove
            int rv = st.pop();

            // step-2: if already visited then ignore it
            if (visited.contains(rv)) {
                continue;
            }

            // step-3: visited mark
            visited.add(rv);

            // step-4: same word
            if (rv == des) {
                return true;
            }

            //step-5: add neighbours
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    st.push(nbrs);
                }
            }

        }

        return false;

    }

    public void BFT() {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for (int src : map.keySet()) {

            if (visited.contains(src)) {
                continue;
            }

            q.add(src);

            while (!q.isEmpty()) {

                // step-1: remove
                int rv = q.poll();

                // step-2: if already visited then ignore it
                if (visited.contains(rv)) {
                    continue;
                }

                // step-3: visited mark
                visited.add(rv);

                // step-4: same word
                System.out.print(rv + " ");

                //step-5: add neighbours
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }

        }
    }

    public void DFT() {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();

        for (int src : map.keySet()) {

            if (visited.contains(src)) {
                continue;
            }

            st.push(src);

            while (!st.isEmpty()) {

                // step-1: remove
                int rv = st.pop();

                // step-2: if already visited then ignore it
                if (visited.contains(rv)) {
                    continue;
                }

                // step-3: visited mark
                visited.add(rv);

                // step-4: same word
                System.out.print(rv + " ");

                //step-5: add neighbours
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }

            }

        }
    }

}
