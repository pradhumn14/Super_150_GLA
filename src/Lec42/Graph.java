package Lec42;

import java.util.HashMap;

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

    public boolean hasPath(int src, int des) {
        if (src == des) {
            return true;
        }
        for (int nbrs : map.get(src).keySet()) {
            boolean ans = hasPath(nbrs, des);
            if (ans) {
                return ans;
            }
        }
        return false;
    }

}
