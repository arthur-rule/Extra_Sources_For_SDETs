package extraSources.interviewQuestions;

import java.util.*;

public class GraphsWithNodes_Edges {
    /*Task:
    Alice and Bob are playing a game on a simple connected graph with nodes and edges.

Alice colors each edge in the graph red or blue.

A path is a sequence of edges where each pair of consecutive edges have a node in common. If the first edge in the pair is of a different color than the second edge, then that is a “color change.”

After Alice colors the graph, Bob chooses a path that begins at node and ends at node . He can choose any path on the graph, but he wants to minimize the number of color changes in the path. Alice wants to choose an edge coloring to maximize the number of color changes Bob must make. What is the maximum number of color changes she can force Bob to make, regardless of which path he chooses?

Input

The first line contains two integer values and with and . The next lines contain two integers and indicating an undirected edge between nodes and (, ).

All edges in the graph are unique.

Output

Output the maximum number of color changes Alice can force Bob to make on his route from node to node .

Sample Input 1
3 3
1 3
1 2
2 3

Sample Output 1
0

Sample Input 2
7 8
1 2
1 3
2 4
3 4
4 5
4 6
5 7
6 7

Sample Output 2
3
     */

    /*
    ChatGPT Solution:
    To solve the problem of maximizing the number of color changes on a path from node
𝑠
s to node
𝑡
t in a given undirected graph, we need to strategically color the edges such that the number of color changes is maximized for any path Bob might take.

Here's a step-by-step approach to implement this solution in Java:

Graph Representation: Use an adjacency list to represent the graph.
DFS/BFS for Path Exploration: To explore possible paths and determine the color
To solve the problem of maximizing the number of color changes Bob has to make on his route from node
𝑠
s to node
𝑡
t in a given undirected graph, we need to strategically color the edges such that the number of color changes is maximized for any path Bob might take.

Here’s the detailed approach to implementing the solution in Java:

Step-by-Step Solution:
Graph Representation: Use an adjacency list to represent the graph.
DFS/BFS for Path Exploration: To explore possible paths and determine the number of color changes.
Coloring Strategy: Since Alice wants to maximize the number of color changes, we can use a strategy where each edge connected to a node is alternately colored to ensure maximum changes.
Implementation Details:
Reading Input: Read the number of nodes and edges, followed by the edges themselves.
Graph Construction: Construct the graph using an adjacency list.
Edge Coloring: Color the edges alternately to maximize the number of color changes.
Path Traversal: Use BFS or DFS to find all paths from
𝑠
s to
𝑡
t and count the color changes for each path. The number of color changes in the worst-case scenario will be our answer.
Here is the complete Java code for this problem:
     */

        static class Edge {
            int node;
            int color; // 0 for red, 1 for blue

            Edge(int node, int color) {
                this.node = node;
                this.color = color;
            }
        }

        static int n, m;
        static List<Edge>[] graph;
        static boolean[] visited;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            n = input.nextInt();
            m = input.nextInt();

            graph = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                int u = input.nextInt();
                int v = input.nextInt();
                // Add undirected edges with alternating colors
                graph[u].add(new Edge(v, i % 2));
                graph[v].add(new Edge(u, i % 2));
            }

            // Find the maximum number of color changes between any two nodes
            int maxColorChanges = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    maxColorChanges = Math.max(maxColorChanges, bfs(i, j));
                }
            }

            System.out.println(maxColorChanges);
        }

        private static int bfs(int start, int end) {
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{start, -1, 0}); // node, previous color, color changes
            visited = new boolean[n + 1];
            visited[start] = true;

            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int node = curr[0];
                int prevColor = curr[1];
                int colorChanges = curr[2];

                if (node == end) {
                    return colorChanges;
                }

                for (Edge edge : graph[node]) {
                    if (!visited[edge.node]) {
                        visited[edge.node] = true;
                        if (edge.color != prevColor) {
                            queue.add(new int[]{edge.node, edge.color, colorChanges + 1});
                        } else {
                            queue.add(new int[]{edge.node, edge.color, colorChanges});
                        }
                    }
                }
            }

            return 0; // Should not reach here if the graph is connected
        }

/*
Explanation:
Graph Construction: The graph is constructed using an adjacency list. Each edge is alternately colored (0 for red and 1 for blue) as it's added to ensure that we maximize the number of color changes.
BFS for Path Finding: A BFS traversal is used to find the minimum number of color changes required for Bob to travel from
𝑠
s to
𝑡
t. For each path, the number of color changes is counted and the maximum over all paths is returned.
This code efficiently constructs the graph, colors it, and finds the maximum number of color changes Bob will have to make, given any starting and ending nodes.
 */
}
