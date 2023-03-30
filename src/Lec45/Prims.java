package Lec45;

import java.util.*;

public class Prims {

    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Prims(int v) {

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }

    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);// v1--> v2
        map.get(v2).put(v1, cost);// v2--> v1

    }

    public class PrimsPair {
        int vtx;
        int acqvrtx;
        int cost;

        public PrimsPair(int vtx, int acqvrtx, int cost) {
            this.vtx = vtx;
            this.acqvrtx = acqvrtx;
            this.cost = cost;
        }

        public String toString() {
            return this.vtx + " " + this.acqvrtx + " @ " + this.cost;
        }

    }

    public void PrimsAlgo() {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost - o2.cost;
            }
        });

        pq.add(new PrimsPair(1, 1, 0));
        HashSet<Integer> visited = new HashSet<>();

        while (!pq.isEmpty()) {
            PrimsPair rp = pq.poll();

            if (visited.contains(rp.vtx)) {
                continue;
            }

            visited.add(rp.vtx);
            System.out.println(rp);

            for (int nbrs : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    PrimsPair np = new PrimsPair(nbrs, rp.vtx, map.get(rp.vtx).get(nbrs));
                    pq.add(np);
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Prims p = new Prims(n);
        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            int v3 = in.nextInt();
            int cost = in.nextInt();
            p.AddEdge(v1,v2,cost);
        }

        p.PrimsAlgo();

    }

}
