/**
 ** A SplayTree Class
 **
 ** You may read up on splay trees here: http://en.wikipedia.org/wiki/Splay_tree
 ** You are to implement splay()
 **/

public class SplayTree {

    public class TreeNode { 
		
	var key:Int;
	var data:String;
	var parent:TreeNode;
	var left:TreeNode; 
	var right:TreeNode;
	def this( inKey: Int, inData:String ) {
	    key = inKey;
	    data = inData;
	    left = right = parent = null; 
	}
		
    }
	
    private var root:TreeNode;
	
    def this() {
	root = null;
    }
        
    public def insert(key:Int,inData:String) {
		
	if ( root == null ) { 
	    root = new TreeNode(key,inData);
	    return; 
	}
		
	// See if the key already exists 
	val node = find(root,key); 
		
		
	if ( (node == null ) || (node.key != key) ) {
		    
	    val newNode:TreeNode = insertBST(key,inData);  
		    
	    // now splay the newly inserted node  
	    splay(newNode);
			
	}
	else {
	    // Overwrite data associated with the key
	    node.data = inData; 
	    splay(node);
	}
    }
	
	
    public def remove(key:Int) {
		
	val node = find(root,key); 
		
	if (node.left == null) { 
	    transplant(node,node.right) ;
	}
	else if (node.right == null){ 
	    transplant(node,node.left);
	}
	else{
	    var y:TreeNode = treeMinimum(node.right);
	    if ( y.parent.key != key ) { 
		transplant(y,y.right); 
		y.right = node.right;
		y.right.parent = y;
				
	    }
	    transplant(node,y);
	    y.left = node.left;
	    y.left.parent = y;
	}
		
	if ( node.parent != null ) { 
	    splay(node.parent);
	}		
    }
	
    public def transplant(u:TreeNode,v:TreeNode) {
	if ( u.parent == null ) { 
	    root = v;
	}
	else if ( u == u.parent.left ) { 
	    u.parent.left = v; 
	}
	else {
	    u.parent.right = v;
	}
	if ( v != null ) { 
	    v.parent = u.parent; 
	}
    }
	
    public def treeMinimum(var x:TreeNode) { 
	while (x.left != null) { 
	    x = x.left;
	}
	return x; 
    }
	
	
    public def search(key:Int):String { 
	
	    
	// See if the key exists 
	val node = find(root,key);		
	
	if ( (node != null) && (node.key == key) ) {
	    //return node.data;
	    splay(node); 
	    return node.data;
	}
	else { 
	    Console.OUT.println("Key not found. Returning null pointer.");
	    return null;
			
	}
		
	
			
    }
	
    public def find(var x:TreeNode, key:Int):TreeNode { 
		
			
	while ( (x != null) && (key != x.key ) ) {
	    if (key < x.key) {
		x = x.left;
	    }else { 
		x = x.right; 
	    }
			
	}
	
	return x;
    }
	
	
    public def splay(x:TreeNode) { 
   
   	/** Write your code here  **/ 

	/** Write your code here **/ 
		
    }
    
    
    // Insert for a regular binary search tree
    public def insertBST(key:Int, inData:String):TreeNode { 
	val newNode:TreeNode = new TreeNode(key,inData); 
	var x:TreeNode = root; 
	var y:TreeNode = null; 
	while ( x != null ) { 
	    y = x;
	    if ( key < x.key ) { 
		x = x.left; 
	    }else { 
		x = x.right; 
	    }
	}
	newNode.parent = y;
		
	if ( y == null ) {
	    root = newNode;
	}
	else if(newNode.key < y.key ) { 
	    y.left = newNode; 
	}
	else {
	    y.right = newNode; 
	}
		
	return newNode;
		
    }
	
	
    // Print the tree
    public def printTree(x:TreeNode,var str:String) {
	
	if ( x.parent == null ) { 
	    str += "root";
	    Console.OUT.println(str + ".key = " + root.key );
 	} else { 
	    Console.OUT.println(str + ".key = " + x.key + ", " + "with parent key = " + x.parent.key ); 
	    
	}

	var str2:String = null;

	if ( x.left != null ) { 
	    str2 = str + ".left" ;
	    printTree(x.left,str2);
	}

	if ( x.right != null ) { 
	    str2 = str + ".right" ;
	    printTree(x.right,str2);
	}
 
	
   }
    
    // Helper for validating results
    public def validateString(expectedString:String, actualString:String, caseId:String ) { 
		
	if ( (actualString!= null) && (expectedString.compareTo(actualString) == 0) ) { 
	    Console.OUT.println("String Test PASSED for " + caseId + "!" );
			
	}else { 
	    Console.OUT.println("String Test FAILED for " + caseId + ", expected = " + expectedString + ", " + "actual = " + actualString + ".");
			
	}
		
    }
	
    // Helper for validating results
    public def validateKey(expectedKey:Int, actualKey:Int, caseId:String ) { 
		
	if ( expectedKey == actualKey ) { 
	    Console.OUT.println("Key    Test PASSED for " + caseId + "!" );
			
	}else { 
	    Console.OUT.println("Key    Test FAILED for " + caseId + ", expected key = " + expectedKey + ", " + "actual key = " + actualKey + ".");
			
	}
		
    }



    public static def main( argv:Array[String] ) {
		

	Console.OUT.println("\nSplayTree Main ... \n");

	var str:String = "";
		
	val spTree = new SplayTree(); 
		
	spTree.insert(3,"hello3"); 
	// After each insertion, the inserted node should become the root. This 
	// is what validateKey is testing
	spTree.validateKey(3,spTree.root.key,"Test1 ( Insert 3 ) "); 
	spTree.insert(5,"hello5");
	spTree.validateKey(5,spTree.root.key,"Test2 ( Insert 5 ) "); 
	spTree.insert(7,"hello7");
	spTree.validateKey(7,spTree.root.key,"Test3 ( Insert 7 ) "); 
	spTree.insert(2,"hello2");
	spTree.validateKey(2,spTree.root.key,"Test4 ( Insert 2 ) "); 
	spTree.insert(14,"hello14");
	spTree.validateKey(14,spTree.root.key,"Test5 ( Insert 14 ) "); 

	spTree.insert(11,"hello11");
	spTree.validateKey(11,spTree.root.key,"Test6 ( Insert 11 ) "); 
	spTree.insert(12,"hello12");
	spTree.validateKey(12,spTree.root.key,"Test7 ( Insert 12 ) "); 
	spTree.insert(10,"hello10");
	spTree.validateKey(10,spTree.root.key,"Test8 ( Insert 10 ) "); 
	
	// Handy little utility to print out a tree. Really helpful for debugging.  
	Console.OUT.println("\nLet's print the tree after inserting 10 ...");
	spTree.printTree(spTree.root,"TreeAfter10 "); 
	Console.OUT.println("");

	// Not only should we get the correct string associated with the 
	// key, the node that we searched for should now become the root 
	// node
	str = spTree.search(7); 
	spTree.validateString("hello7",str,"Test9 ( Search 7 )"); 
	spTree.validateKey(7,spTree.root.key,"Test10 ( Search 7 )"); 
		
	//spTree.printTree(spTree.root,"After Searching 7 "); 

	str = spTree.search(5); 
	spTree.validateString("hello5",str,"Test11 ( Search 5 )"); 
	spTree.validateKey(5,spTree.root.key,"Test12 ( Search 5 )");

	//spTree.printTree(spTree.root,"After Searching 5 "); 
		
	str = spTree.search(14); 
	spTree.validateString("hello14",str,"Test13 ( Search 14 )"); 
	spTree.validateKey(14,spTree.root.key,"Test14 ( Search 14 )");

	//spTree.printTree(spTree.root,"After Searching 14 "); 

	Console.OUT.println("\nDone...\n");
	
    }
}

	

