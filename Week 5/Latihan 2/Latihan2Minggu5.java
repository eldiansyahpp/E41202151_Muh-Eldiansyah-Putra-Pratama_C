package latihan2minggu5;

public class Latihan2Minggu5 {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4
        
        
        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(2, 3); //AD
        theGraph.addEdge(3, 4); //DE
        
        
        theGraph.bfs();
        theGraph.dfs();
    }
    
}
