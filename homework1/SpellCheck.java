
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
    
        
//#line 15 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public x10.array.Array<java.lang.String>
          dict;
        
//#line 17 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public x10.util.HashMap<java.lang.Integer, java.lang.String>
          hashMap;
        
        
//#line 20 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
// creation method for java code
        public static SpellCheck $make(final x10.array.Array<java.lang.String> dictionary,java.lang.Class<?> $dummy0){return new SpellCheck((java.lang.System[])null).$init(dictionary,(java.lang.Class<?>) null);}
        public SpellCheck $init(final x10.array.Array<java.lang.String> dictionary,java.lang.Class<?> $dummy0) { {
                                                                                                                        
//#line 20 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"

                                                                                                                        {
                                                                                                                            
//#line 20 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"

                                                                                                                            
//#line 13 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.__fieldInitializers363();
                                                                                                                        }
                                                                                                                        
//#line 22 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.dict = ((x10.array.Array)(dictionary));
                                                                                                                        
//#line 23 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.hashMap = ((x10.util.HashMap)(new x10.util.HashMap<java.lang.Integer, java.lang.String>((java.lang.System[])null).$init(x10.rtt.Types.INT,
                                                                                                                                                                                                                                                                                                                             x10.rtt.Types.STRING,
                                                                                                                                                                                                                                                                                                                             ((int)(900000)))));
                                                                                                                    }
                                                                                                                    return this;
                                                                                                                    }
        
        
//#line 26 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public static SpellCheck
                                                                                  make(
                                                                                  final java.lang.String filename){
            
//#line 29 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.io.Console.OUT.println(((java.lang.String)((("Reading dictionary from: ") + (filename)))));
            
//#line 32 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.io.File I =
              ((x10.io.File)(new x10.io.File((java.lang.System[])null).$init(((java.lang.String)(filename)))));
            
//#line 33 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int nwords =
              0;
            
//#line 34 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 34 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.lang.Iterator<java.lang.String> line392 =
                                                                                           ((x10.lang.Iterator<java.lang.String>)
                                                                                             ((x10.io.ReaderIterator<java.lang.String>)I.lines()).iterator());
                                                                                         ((x10.lang.Iterator<java.lang.String>)line392).hasNext$O();
                                                                                         ) {
                
//#line 34 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final java.lang.String line =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line392).next$G()));
                
//#line 35 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
nwords = ((nwords) + (((int)(1))));
            }
            
//#line 37 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.io.Console.OUT.println(((java.lang.String)(((((java.lang.Integer)(nwords))) + (" in dictionary")))));
            
//#line 39 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.array.Array<java.lang.String> dict =
              ((x10.array.Array)(new x10.array.Array<java.lang.String>((java.lang.System[])null).$init(x10.rtt.Types.STRING,
                                                                                                       nwords,
                                                                                                       ((java.lang.String)("")),(java.lang.Class<?>[][][][][]) null)));
            
//#line 40 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.util.HashMap<java.lang.Integer, java.lang.String> hashMap =
              ((x10.util.HashMap)(new x10.util.HashMap<java.lang.Integer, java.lang.String>((java.lang.System[])null).$init(x10.rtt.Types.INT,
                                                                                                                            x10.rtt.Types.STRING,
                                                                                                                            ((int)(900000)))));
            
//#line 42 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int i =
              0;
            
//#line 43 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 43 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final x10.lang.Iterator<java.lang.String> line394 =
                                                                                           ((x10.lang.Iterator<java.lang.String>)
                                                                                             ((x10.io.ReaderIterator<java.lang.String>)I.lines()).iterator());
                                                                                         ((x10.lang.Iterator<java.lang.String>)line394).hasNext$O();
                                                                                         ) {
                
//#line 43 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final java.lang.String line =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line394).next$G()));
                
//#line 44 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
((x10.array.Array<java.lang.String>)dict).$set_1_$$x10$array$Array_T$G((int)(i),
                                                                                                                                                               ((java.lang.String)((line).trim())));
                
//#line 45 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
i = ((i) + (((int)(1))));
            }
            
//#line 48 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final SpellCheck s =
              ((SpellCheck)(new SpellCheck((java.lang.System[])null).$init(((x10.array.Array<java.lang.String>)(dict)),(java.lang.Class<?>) null)));
            
//#line 49 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return s;
        }
        
        
//#line 54 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public boolean
                                                                                  check$O(
                                                                                  final java.lang.String word){
            
//#line 74 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int key =
               0;
            
//#line 75 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
key = this.Hash$O(((java.lang.String)(word)));
            
//#line 76 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
if (((x10.util.HashMap<java.lang.Integer, java.lang.String>)hashMap).containsKey_0_$$x10$util$HashMap_K$O((java.lang.Integer)(key))) {
                
//#line 77 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return true;
            } else {
                
//#line 79 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return false;
            }
        }
        
        
//#line 90 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public int
                                                                                  Hash$O(
                                                                                  final java.lang.String toHash){
            
//#line 92 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int hashValue =
              0;
            
//#line 94 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 94 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int Position =
                                                                                           0;
                                                                                         ((Position) < (((int)((toHash).length()))));
                                                                                         
//#line 94 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
Position = ((Position) + (((int)(1))))) {
                
//#line 95 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashValue = ((((hashValue) * (((int)(31))))) + (((int)(((int) (((char)((toHash).charAt(((int)(Position)))))))))));
            }
            
//#line 97 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashValue = ((hashValue) % (((int)(900000))));
            
//#line 99 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
if (((hashValue) < (((int)(0))))) {
                
//#line 100 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashValue = ((hashValue) + (((int)(900000))));
            }
            
//#line 103 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return hashValue;
        }
        
        
//#line 108 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public void
                                                                                   createHashMap(
                                                                                   ){
            
//#line 111 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int hashValue =
              0;
            
//#line 113 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
java.lang.String word =
              "";
            
//#line 115 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
for (
//#line 115 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
int index =
                                                                                            0;
                                                                                          ((index) < (((int)(235886))));
                                                                                          
//#line 115 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
index = ((index) + (((int)(1))))) {
                
//#line 116 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
word = ((x10.array.Array<java.lang.String>)dict).$apply$G((int)(index));
                
//#line 117 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashValue = this.Hash$O(((java.lang.String)(word)));
                
//#line 120 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
((x10.util.HashMap<java.lang.Integer, java.lang.String>)hashMap).put_0_$$x10$util$HashMap_K_1_$$x10$util$HashMap_V((java.lang.Integer)(hashValue),
                                                                                                                                                                                                            ((java.lang.String)(word)));
                
//#line 121 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
index = ((index) + (((int)(1))));
            }
        }
        
        
//#line 129 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
public void
                                                                                   checkWithMessage(
                                                                                   final java.lang.String word){
            
//#line 130 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
if (!(this.check$O(((java.lang.String)(word))))) {
                
//#line 131 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.io.Console.OUT.println(((java.lang.String)((("Misspelled word: ") + (word)))));
            }
        }
        
        
//#line 135 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
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
            
//#line 140 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final SpellCheck checker =
              SpellCheck.make(((java.lang.String)("/usr/share/dict/words")));
            
//#line 142 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.util.HashMap<java.lang.Integer, java.lang.String> hashMap =
               null;
            
//#line 145 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.createHashMap();
            
//#line 146 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
hashMap = checker.
                                                                                                 hashMap;
            
//#line 147 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
x10.io.Console.OUT.println(((java.lang.String)((("HashMap Size: ") + (((java.lang.Integer)(((x10.util.HashMap<java.lang.Integer, java.lang.String>)hashMap).size$O())))))));
            
//#line 148 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("apple")));
            
//#line 149 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("quash")));
            
//#line 150 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("quasht")));
            
//#line 151 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("asdf")));
            
//#line 152 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("boy")));
            
//#line 153 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("girls")));
            
//#line 154 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
checker.checkWithMessage(((java.lang.String)("asdfsd")));
        }
        
        
//#line 13 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final public SpellCheck
                                                                                  SpellCheck$$SpellCheck$this(
                                                                                  ){
            
//#line 13 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
return SpellCheck.this;
        }
        
        
//#line 13 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
final private void
                                                                                  __fieldInitializers363(
                                                                                  ){
            
//#line 13 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.dict = null;
            
//#line 13 "/Users/ktran/ParallelProgramming/homework1/SpellCheck.x10"
this.hashMap = null;
        }
        
        final public static void
          __fieldInitializers363$P(
          final SpellCheck SpellCheck){
            SpellCheck.__fieldInitializers363();
        }
    
}
