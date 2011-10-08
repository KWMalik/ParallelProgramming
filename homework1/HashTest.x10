import x10.util.*;
import x10.util.HashMap;

public class HashTest{

       var s1:HashMap[Int, String];

       public def this() {
        s1 = new HashMap[Int, String]();
	}

       public def addIt(i:Int, s:String){
       	  /*
	      var str:String = "";
	      try {
	      	  str = s1.get(i);
		  }catch(e:NullPointerException){
		str = s;
		s1.put(i,s);
		}
		*/
	x10.io.Console.OUT.println(s);

	}

	public static def main(args:Rail[String]) : void{

	var hashMap:HashMap[Int, String];

	hashMap = new HashMap[Int, String](1000);
	
	var one: Int = 1;
	var two: Int = 2;
	var three: Int = 3;

	/* 

	We CANNOT add primitives to the HashMap. 
	We have to wrap it. 


	*/
	hashMap.put(one , "One");
	hashMap.put(two, "Two");
	hashMap.put(three,"Three");

	Console.OUT.println("HashMap contains "+ hashMap.size() + "key value pairs.");		

	/* 

	Finding particular value form the HashMap:

	HashMap's containsValue method returns boolean depending upon 
	the presence of the value in given HashMap

	Signature of the containsValue method is, 
	boolean containsValue(Object value)



	*/

	if(hashMap.containsKey(one)){
		Console.OUT.println("HashMap contains 1 as value");
	}else {
		Console.OUT.println("HashMap does not contain 1 as value");
	} 
	

	
	}

}
		  