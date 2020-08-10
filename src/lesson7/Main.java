package lesson7;

public class Main {
    public static void main(String[] args) {
        int vertexCount = 10;
        Graph graph = new Graph(vertexCount);

        for (int i = 0; i < vertexCount; i++) {
            if (i + 1 < vertexCount) graph.addEdge(i, i + 1);
            if (i + 2 < vertexCount) graph.addEdge(i, i + 2);
            if (i + 3 < vertexCount) graph.addEdge(i, i + 3);
            if (i + 4 < vertexCount) graph.addEdge(i, i + 4);
        }

        System.out.println(graph.getAdjList(9));
        System.out.println(graph.getAdjList(5));
        System.out.println(graph.getEdgeCount());

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 2);

        System.out.println(bfp.pathTo(9));

//        graph.addEdge(1,2);
//        graph.addEdge(0,4);
//        graph.addEdge(1,4);
//        graph.addEdge(3,4);
//        graph.addEdge(2,4);

//        System.out.println(graph.getAdjList(1));
//
//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 2 );
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));
//        System.out.println(dfp.hasPathTo(3));


//        BreadthFirstPath bfp = new BreadthFirstPath(graph, 2);
//        System.out.println(bfp.hasPathTo(0));
//        System.out.println(bfp.pathTo(0));
//        System.out.println(bfp.hasPathTo(3));

    }
}
