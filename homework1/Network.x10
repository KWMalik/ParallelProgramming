import x10.util.Random;

public class Network {
	
	public static val nil:Int = -1;
	
	val allNodes:Region(1);
	val allPairs:Region(2);
	var numNodes:Int = nil; 
	var degree:Int = nil;
	
	/**
	 * * Adjacency matrix of edges in the network:
	 * *     edges[src][dst] == nil: no edge from src to dst
	 * *     edges[src][dst] != nil: edge from src to dst
	 * */
	val adjMatrix:Array[Int](2);
	
	/**
	 * * Each node may have path coming in on an incoming edge and out
	 * * on an outgoing edge.
	 * *     incomingPath(n) == nil: no path incoming to node n
	 * *     incomingPath(n) == x:   path incoming to node n from node x
	 * *
	 * *     outgoingPath(n) == nil: no path outgoing from node n
	 * *     outgoing(n)     == x:   path outgoing from node n to node x
	 * */
	var incomingPath:Array[Int];
	var outgoingPath:Array[Int];
	
	/**
	 * * Generates a random network with 'nodes' switches, each with 'degree' neighbors,
	 * * using 'seed' as a random number generator seed.  Use this 'seed' parameter to 
	 * * control the creation of multiple different networks of equivalent size.
	 * */
	def this(nodes:Int, nodeDegree:Int, seed:Int) {
		Console.OUT.println("New network: nodes=" + nodes + ", degree=" + nodeDegree + ", seed=" + seed);
		
		if ( (nodes < 0 ) || (nodeDegree < 0) || (nodeDegree > (nodes-1)) ) {
			Console.OUT.println("Invalid Parameters!");
		}
		
		numNodes = nodes;
		degree = nodeDegree;
		allNodes = (0..(nodes-1));
		val adjs = (0..(degree-1));
		allPairs = allNodes * adjs; 
		adjMatrix = new Array[Int](allPairs,nil); 
		incomingPath = new Array[Int](numNodes,nil);
		outgoingPath = new Array[Int](numNodes,nil);
		
		
		var d:Int = 0; 
		val r = new Random(seed);
		for (s in (0..(numNodes-1))){
			// need to make sure adj matrix does not contain duplicate entries in a row
			val eligibleAdj:Rail[Boolean] = new Rail[Boolean](numNodes,true); 
		        eligibleAdj(s) = false; 
			for ( i in (0..(degree-1))) { 
				d = r.nextInt(numNodes-1); 
				while ( !eligibleAdj(d) ) { 
					d = r.nextInt(numNodes-1); 
				} // loop until we find a non-duplicate
				
				adjMatrix(s,i) = d;
				eligibleAdj(d) = false; 
			}
		}
			
	}

	/**
	 * * Manually create a network with the adjacency matrices described below
	 * */
	def this() {
		
		
		val nodes:Int = 5;
		degree = 2;
		
		Console.OUT.println("New network: nodes=" + nodes + ", degree=" + degree );
		
		numNodes = nodes;
		allNodes = (0..(nodes-1));
		val adjs = (0..(degree-1));
		allPairs = allNodes * adjs; 
		adjMatrix = new Array[Int](allPairs,nil); 
		incomingPath = new Array[Int](numNodes,nil);
		outgoingPath = new Array[Int](numNodes,nil);
		
		
		// Manually created adjacency matrix 
		adjMatrix(0,0) = 1;
		adjMatrix(0,1) = 2;
		adjMatrix(1,0) = 2;
		adjMatrix(1,1) = nil;
		adjMatrix(2,0) = nil;
		adjMatrix(2,1) = nil;
		adjMatrix(3,0) = 0;
		adjMatrix(3,1) = 4;
		adjMatrix(4,0) = nil;
		adjMatrix(4,1) = nil;
	}
	
		
	/**
	 * * Establish connection in all of the switches along the shortest route from source
	 * * node (s) to destination node (d).
	 * */
	public def createPath(s:Int, d:Int) {
		// Write your code here
	         Console.OUT.println(" Creating path from " + s + " to " + d + " ...");
		
		clearPath();
		
		/***** Write your code here *****/
		
		Console.OUT.println(" path NOT created from " + s + " to " + d + " ...");
	

		/***** Write your code here *****/
		
	}
	
	
	/**
	 * * Helper function to print the adjacency matrix
	 * */
	public def printNetwork() {
		var n:Int; 
		Console.OUT.print("adjMatrix = {\n");
		for ( s in (0..(numNodes-1)) ) {  
			for ( d in (0..(degree-1)) ) { 
				n = adjMatrix(s,d);
				Console.OUT.print(" (" + s + "," + d + ")=" + n + ",");
			}
			Console.OUT.print("\n");
		}
		Console.OUT.println("}");
	
	}
	
	/**
	 * * Helper function to print the path in the network
	 * */
	public def printPath(s:Int) {
		
		
		if ( (s<0) || (s >= numNodes) ) { 
			Console.OUT.println(" PrintPath: Node " + s + " does not exist!");
			return;
		}
		
		if (outgoingPath(s) == -1) {
			Console.OUT.println(" PrintPath: Node " + s + " has no outgoing switch set!");
			return;
		}
		
		var n:Int = s;
		Console.OUT.print("shortest path = ( ");
		while (outgoingPath(n) != -1) {
			Console.OUT.print(n + ", ");
			n = outgoingPath(n);
		}
		Console.OUT.println(n + " )");
	}
	
	
	/**
	 * * Clear all paths in the network
	 * */
	public def clearPath() {
				
		 for (n in allNodes) {
		  incomingPath(n) = nil;
		  outgoingPath(n) = nil;
		 }
		 	
	}
	
	public static def main( argv:Array[String] ) {
	        
	    Console.OUT.println("\nNetwork Main ...\n"); 

	    // you may test on different neworks by adjusting the constructor parameters
	    val net:Network = new Network(6,3,100); // A network with 6 nodes, each node is adjacent
	    // to 3 other nodes. 
		
	    // a manual constructor you can play with to set up a network of your choosing. 
	    // May want to use this constructor for initial testing.
	    //val net:Network = new Network();  
	    
	    net.printNetwork();
	    net.createPath(2,0);
	    net.printPath(2);
	    
		
	    // clear the previously set path
	    net.clearPath();

	    Console.OUT.println("\nDone ...\n"); 
	}
}