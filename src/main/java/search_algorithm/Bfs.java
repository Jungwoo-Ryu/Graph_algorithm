package search_algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    static boolean[] visit;
    static LinkedList<Integer>[] graph;
    //static int[][] graph;

    public static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visit[v] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();
            System.out.println(temp);

            for(int nextV : graph[temp]){
                if(!visit[nextV]){
                    queue.add(nextV);
                    visit[nextV] = true;
                }
            }
        }
    }

}
