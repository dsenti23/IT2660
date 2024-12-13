class Main {
  public static void main(String[] args) {
    String[] vertices = {
     "Theatre",
     "Liberal Arts",
     "Business & Technology",
     "Student Services",
     "Technology Learning Center",
     "Health Careers & Sciences",
     "Health Technologies Center",
     "Recreation Center"
    };

    int[][] edges = {
      {0,1}, {0,2},
      {1,3}, 
      {2,3},
      {3,4},  
      {3,5},
      {5,6}, {5,7}

    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology")); // Get a dfs starting at the Business and Technology Building. Change this is you called it something different in your vertices!

    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();

    for (int i = 0; i < searchOrders.size(); i++)
      if (dfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) +
          " is " + graph.getVertex(dfs.getParent(i)));

    dfs.printPath(graph.getIndex("Health Technologies Center"));
    System.out.println();
    dfs.printPath(graph.getIndex("Student Services"));
    System.out.println();
    dfs.printPath(graph.getIndex("Recreation Center"));

    dfs.printTree();
  }
}