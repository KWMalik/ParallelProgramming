import x10.io.File;

/**
 ** A homemade spellchecker
 **
 ** Facilities to read a dictionary of words are provided. You
 ** must implement check().
 **/
public class SpellCheck {
    var dict:Rail[String];

    // Constructor reads in dictionary from file
    public def this(dictionary:Rail[String]) {
	
	dict = dictionary;

    }
    
    public static def make(filename:String) : SpellCheck {
	
	
	Console.OUT.println("Reading dictionary from: " + filename);

	
	val I  = new File(filename);
	var nwords:Int = 0;
	for (line in I.lines()) 
	    nwords++;

	Console.OUT.println(nwords + " in dictionary");

	val dict = new Rail[String](nwords,"");
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
	

	/***** Write your code here *****/

	return false;


	/***** Write your code here *****/
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


	checker.checkWithMessage("apple");
	checker.checkWithMessage("quash");
	checker.checkWithMessage("quasht");
    }
}