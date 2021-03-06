import x10.io.File;
import x10.lang.String;
import x10.lang.Char;
import x10.util.HashMap;

/**
 ** A homemade spellchecker
 **
 ** Facilities to read a dictionary of words are provided. You
 ** must implement check().
 **/

public class SpellCheck {

    var dict:Rail[String];

    var hashMap:HashMap[Int, String];

    // Constructor reads in dictionary from file
    public def this(dictionary:Rail[String]) {
	
	dict = dictionary;
	hashMap = new HashMap[Int, String](900000);
    }
    
    public static def make(filename:String) : SpellCheck {
	
	
	Console.OUT.println("Reading dictionary from: " + filename);

	
	val I  = new File(filename);
	var nwords:Int = 0;
	for (line in I.lines()) 
	    nwords++;

	Console.OUT.println(nwords + " in dictionary");

	val dict = new Rail[String](nwords,"");
	val hashMap = new HashMap[Int,String](900000);
	
	var i:Int = 0;
	for (line in I.lines()) {
	    dict(i) = line.trim();
	    i++;
	}
	
	val s = new SpellCheck(dict); 
	return s;

    }


    public def check(word:String):Boolean {
	/**
	 ** Implement a capitalization-insensitive spellcheck here.
	 **/
	
	
	
	/*

        Finding particular value form the HashMap:

        HashMap's containsValue method returns boolean depending upon
        the presence of the value in given HashMap

        Signature of the containsValue method is,
        boolean containsKey(Object value)



	*/	
	var key:Int;
	key  = Hash(word);	
	if(hashMap.containsKey(key)){
                return true;
        }else {
                return false;
        }

	


	/***** Write your code here *****/
    }



    public def Hash(toHash:String):Int{

    var hashValue:Int = 0;

    for (var Position: Int = 0; Position < toHash.length(); Position++)
    	hashValue = hashValue*31 + Char.ord(toHash.charAt(Position));
	
	hashValue %=900000;
	
	if( hashValue < 0)
    	  hashValue = hashValue + 900000;
        
    	
	return hashValue;


    }

    public def createHashMap():void{

    	  
	  var hashValue:Int = 0;
	  
	  var word:String = "";
	 
	  for(var index:Int = 0; index < 235886; index++){
	  word = dict(index); 	   
	  hashValue = Hash(word);

	  /* Insert Key-Value Pair Into HashMap */
	  hashMap.put(hashValue, word);	  
	  index++;
	  }
	  
	  
    }



    public def checkWithMessage(word:String) {
	if (!check(word))  
	    Console.OUT.println("Misspelled word: " + word);
    }


    public static def main( argv:Array[String] ) {
	// NB: You may need to change the path to the word list on your system.  
	// Feel free to test on a small sample wordlist of your own making.
	// Wordlist should have one word per line.
	// The following path works on Three Musketeers
	val checker = SpellCheck.make("/usr/share/dict/words");  
	
	var hashMap:HashMap[Int,String];
	
	
	checker.createHashMap();
	hashMap = checker.hashMap;
	Console.OUT.println("HashMap Size: "+ hashMap.size());
	Console.OUT.println(hashMap.hash("string"));
	checker.checkWithMessage("apple");
	checker.checkWithMessage("quash");
	checker.checkWithMessage("quasht");
	checker.checkWithMessage("asdf");
	checker.checkWithMessage("boy");
	checker.checkWithMessage("girls");
	checker.checkWithMessage("asdfsd");


    }
}