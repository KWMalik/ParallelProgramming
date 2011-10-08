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
	hashMap = new HashMap[Int, String](235886);
    }
    
    public static def make(filename:String) : SpellCheck {
	
	
	Console.OUT.println("Reading dictionary from: " + filename);

	
	val I  = new File(filename);
	var nwords:Int = 0;
	for (line in I.lines()) 
	    nwords++;

	Console.OUT.println(nwords + " in dictionary");

	val dict = new Rail[String](nwords,"");
	val hashMap = new HashMap[Int,String](nwords);
	
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
	
	for(var k: Int = 1; k <= 10; k++){
	

	
	}
	    
	/***** Write your code here *****/

	return false;


	/***** Write your code here *****/
    }



    public def Hash(toHash:String):Int{

    var hashValue:Int = 7;

    for (var Position: Int = 0; Position < toHash.length(); Position++)
    	hashValue = hashValue*31 + Char.ord(toHash.charAt(Position));
	
	hashValue %=235886;
	
	if( hashValue < 0)
    	  hashValue = hashValue + 235886;
        
    	
	return hashValue;


    }

    public def createHashMap():void{

    	  
	  var hashValue:Int = 0;
	  
	  var word:String = "";
	  for(var index:Int = 0; index < 10; index++){
	  word = dict(index); 	   
	  hashValue = Hash(word);
	  
	  Console.OUT.println("Word: "+word+"Key: "+hashValue);
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

	checker.createHashMap();
	checker.checkWithMessage("apple");
	checker.checkWithMessage("quash");
	checker.checkWithMessage("quasht");
    }
}