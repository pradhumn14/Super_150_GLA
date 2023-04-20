package sem2Test6;

import java.util.*;

public class Main {

    private HashMap<Integer, List<Integer>> map = new HashMap<>();

    public Main(int v) {

        for (int p = 1; p <= v; p++) {

            map.put(p, new ArrayList<>());

        }

    }

    public void addEdg(int v1, int v2) {

        map.get(v1).add(v2);
        map.get(v2).add(v1);
    }

    public class primPair {

        int vtx;
        int acqvtx;
        int cst;

        public primPair(int vtx, int acqvtx, int cst) {

            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cst = cst;

        }

        public String toString() {

            return this.vtx + " " + this.acqvtx + " @ " + this.cst;

        }

    }

    public int algoPrims() {

        PriorityQueue<primPair> pq = new PriorityQueue<>(new Comparator<primPair>() {

            @Override
            public int compare(primPair o1, primPair o2) {
                return o1.cst - o2.cst;
            }

        });
        pq.add(new primPair(1, 1, 0));
        HashSet<Integer> visited = new HashSet<>();
        int sum = 0;

        while (!pq.isEmpty()) {

            primPair rp = pq.poll();
            if (visited.contains(rp.vtx)) {
                continue;
            }
            sum += rp.cst;
            visited.add(rp.vtx);
            for (int nbrs = 1; nbrs <= map.size(); nbrs++) {
                if (!visited.contains(nbrs)) {
                    int cost = 0;
                    if (map.get(rp.vtx).contains(nbrs)) {
                        cost = 1;
                    }
                    primPair np = new primPair(nbrs, rp.vtx, cost);
                    pq.add(np);
                }
            }

        }
        return sum + 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Main mst = new Main(n);
        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            mst.addEdg(v1, v2);
        }
        System.out.println(mst.algoPrims());

    }

}