
public class SpellCheck
extends x10.core.Ref
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<SpellCheck> $RTT = new x10.rtt.NamedType<SpellCheck>(
    "SpellCheck", /* base class */SpellCheck.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    // constructor just for allocation
    public SpellCheck(final java.lang.System[] $dummy) { super($dummy);}
    
        
//#line 14 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public x10.array.Array<java.lang.String>
          dict;
        
//#line 16 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public x10.util.HashMap<java.lang.Integer, java.lang.String>
          hashMap;
        
        
//#line 19 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
// creation method for java code
        public static SpellCheck $make(final x10.array.Array<java.lang.String> dictionary,java.lang.Class<?> $dummy0){return new SpellCheck((java.lang.System[])null).$init(dictionary,(java.lang.Class<?>) null);}
        public SpellCheck $init(final x10.array.Array<java.lang.String> dictionary,java.lang.Class<?> $dummy0) { {
                                                                                                                        
//#line 19 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"

                                                                                                                        {
                                                                                                                            
//#line 19 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"

                                                                                                                            
//#line 12 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.__fieldInitializers512();
                                                                                                                        }
                                                                                                                        
//#line 21 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.dict = ((x10.array.Array)(dictionary));
                                                                                                                        
//#line 22 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.hashMap = ((x10.util.HashMap)(new x10.util.HashMap<java.lang.Integer, java.lang.String>((java.lang.System[])null).$init(x10.rtt.Types.INT,
                                                                                                                                                                                                                                                                                                                             x10.rtt.Types.STRING,
                                                                                                                                                                                                                                                                                                                             ((int)(235886)))));
                                                                                                                    }
                                                                                                                    return this;
                                                                                                                    }
        
        
//#line 25 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public static SpellCheck
                                                                                  make(
                                                                                  final java.lang.String filename){
            
//#line 28 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.io.Console.OUT.println(((java.lang.String)((("Reading dictionary from: ") + (filename)))));
            
//#line 31 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.io.File I =
              ((x10.io.File)(new x10.io.File((java.lang.System[])null).$init(((java.lang.String)(filename)))));
            
//#line 32 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int nwords =
              0;
            
//#line 33 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 33 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.lang.Iterator<java.lang.String> line541 =
                                                                                           ((x10.lang.Iterator<java.lang.String>)
                                                                                             ((x10.io.ReaderIterator<java.lang.String>)I.lines()).iterator());
                                                                                         ((x10.lang.Iterator<java.lang.String>)line541).hasNext$O();
                                                                                         ) {
                
//#line 33 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final java.lang.String line =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line541).next$G()));
                
//#line 34 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
nwords = ((nwords) + (((int)(1))));
            }
            
//#line 36 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.io.Console.OUT.println(((java.lang.String)(((((java.lang.Integer)(nwords))) + (" in dictionary")))));
            
//#line 38 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.array.Array<java.lang.String> dict =
              ((x10.array.Array)(new x10.array.Array<java.lang.String>((java.lang.System[])null).$init(x10.rtt.Types.STRING,
                                                                                                       nwords,
                                                                                                       ((java.lang.String)("")),(java.lang.Class<?>[][][][][]) null)));
            
//#line 39 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.util.HashMap<java.lang.Integer, java.lang.String> hashMap =
              ((x10.util.HashMap)(new x10.util.HashMap<java.lang.Integer, java.lang.String>((java.lang.System[])null).$init(x10.rtt.Types.INT,
                                                                                                                            x10.rtt.Types.STRING,
                                                                                                                            nwords)));
            
//#line 41 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int i =
              0;
            
//#line 42 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 42 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.lang.Iterator<java.lang.String> line543 =
                                                                                           ((x10.lang.Iterator<java.lang.String>)
                                                                                             ((x10.io.ReaderIterator<java.lang.String>)I.lines()).iterator());
                                                                                         ((x10.lang.Iterator<java.lang.String>)line543).hasNext$O();
                                                                                         ) {
                
//#line 42 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final java.lang.String line =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line543).next$G()));
                
//#line 43 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
((x10.array.Array<java.lang.String>)dict).$set_1_$$x10$array$Array_T$G((int)(i),
                                                                                                                                                               ((java.lang.String)((line).trim())));
                
//#line 44 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
i = ((i) + (((int)(1))));
            }
            
//#line 47 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final SpellCheck s =
              ((SpellCheck)(new SpellCheck((java.lang.System[])null).$init(((x10.array.Array<java.lang.String>)(dict)),(java.lang.Class<?>) null)));
            
//#line 48 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return s;
        }
        
        
//#line 53 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public boolean
                                                                                  check$O(
                                                                                  final java.lang.String word){
            
//#line 58 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 58 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int k =
                                                                                           1;
                                                                                         ((k) <= (((int)(10))));
                                                                                         
//#line 58 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
k = ((k) + (((int)(1))))) {
                
            }
            
//#line 66 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return false;
        }
        
        
//#line 74 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public int
                                                                                  Hash$O(
                                                                                  final java.lang.String toHash){
            
//#line 76 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int hashValue =
              7;
            
//#line 78 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 78 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int Position =
                                                                                           0;
                                                                                         ((Position) < (((int)((toHash).length()))));
                                                                                         
//#line 78 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
Position = ((Position) + (((int)(1))))) {
                
//#line 79 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashValue = ((((hashValue) * (((int)(31))))) + (((int)(((int) (((char)((toHash).charAt(((int)(Position)))))))))));
            }
            
//#line 81 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashValue = ((hashValue) % (((int)(235886))));
            
//#line 83 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
if (((hashValue) < (((int)(0))))) {
                
//#line 84 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashValue = ((hashValue) + (((int)(235886))));
            }
            
//#line 87 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return hashValue;
        }
        
        
//#line 92 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public void
                                                                                  createHashMap(
                                                                                  ){
            
//#line 95 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int hashValue =
              0;
            
//#line 97 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
java.lang.String word =
              "";
            
//#line 98 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 98 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int index =
                                                                                           0;
                                                                                         ((index) < (((int)(10))));
                                                                                         
//#line 98 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
index = ((index) + (((int)(1))))) {
                
//#line 99 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
word = ((x10.array.Array<java.lang.String>)dict).$apply$G((int)(index));
                
//#line 100 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashValue = this.Hash$O(((java.lang.String)(word)));
                
//#line 102 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.io.Console.OUT.println(((java.lang.String)((((((("Word: ") + (word))) + ("Key: "))) + (((java.lang.Integer)(hashValue)))))));
                
//#line 103 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
index = ((index) + (((int)(1))));
            }
        }
        
        
//#line 110 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public void
                                                                                   checkWithMessage(
                                                                                   final java.lang.String word){
            
//#line 111 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
if (!(this.check$O(((java.lang.String)(word))))) {
                
//#line 112 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.io.Console.OUT.println(((java.lang.String)((("Misspelled word: ") + (word)))));
            }
        }
        
        
//#line 116 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        SpellCheck.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> argv) {
            
//#line 121 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final SpellCheck checker =
              SpellCheck.make(((java.lang.String)("/usr/share/dict/words")));
            
//#line 123 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.createHashMap();
            
//#line 124 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("apple")));
            
//#line 125 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("quash")));
            
//#line 126 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("quasht")));
        }
        
        
//#line 12 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final public SpellCheck
                                                                                  SpellCheck$$SpellCheck$this(
                                                                                  ){
            
//#line 12 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return SpellCheck.this;
        }
        
        
//#line 12 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final private void
                                                                                  __fieldInitializers512(
                                                                                  ){
            
//#line 12 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.dict = null;
            
//#line 12 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.hashMap = null;
        }
        
        final public static void
          __fieldInitializers512$P(
          final SpellCheck SpellCheck){
            SpellCheck.__fieldInitializers512();
        }
    
}
