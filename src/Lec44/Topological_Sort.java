package Lec44;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort {

    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Topological_Sort(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);  //v1 -> v2
    }

    public void TopologicalSort() {
        int[] in = Inderge();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < in.length; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            
        }

    }

    public int[] Inderge() {
        int[] in = new int[map.size() + 1];

        for (int key : map.keySet()) {
            for (int nbrs : map.get(key).keySet()) {
                in[nbrs]++;
            }
        }
        return in;
    }

}
