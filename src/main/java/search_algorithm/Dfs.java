package search_algorithm;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class Dfs {

    static boolean[] visit;
    static int[][] graph;

    public static void dfs(int v) {
        visit[v] = true;
        System.out.println(v);
        for(int nextV : graph[v]){
            if(!visit[nextV]) dfs(nextV);
        }
    }
}
