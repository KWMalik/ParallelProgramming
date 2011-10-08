
public class HashTest
extends x10.core.Ref
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<HashTest> $RTT = new x10.rtt.NamedType<HashTest>(
    "HashTest", /* base class */HashTest.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    // constructor just for allocation
    public HashTest(final java.lang.System[] $dummy) { super($dummy);}
    
        
//#line 6 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
public x10.util.HashMap<java.lang.Integer, java.lang.String>
          s1;
        
        
//#line 8 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
// creation method for java code
        public static HashTest $make(){return new HashTest((java.lang.System[])null).$init();}
        public HashTest $init() { {
                                         
//#line 8 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"

                                         {
                                             
//#line 8 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"

                                             
//#line 4 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
this.__fieldInitializers210();
                                         }
                                         
//#line 9 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
this.s1 = ((x10.util.HashMap)(new x10.util.HashMap<java.lang.Integer, java.lang.String>((java.lang.System[])null).$init(x10.rtt.Types.INT,
                                                                                                                                                                                                                                      x10.rtt.Types.STRING)));
                                     }
                                     return this;
                                     }
        
        
//#line 12 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
public void
                                                                                addIt(
                                                                                final int i,
                                                                                final java.lang.String s){
            
//#line 22 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
x10.io.Console.OUT.println(((java.lang.String)(s)));
        }
        
        
//#line 26 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        HashTest.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 28 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
x10.util.HashMap<java.lang.Integer, java.lang.String> hashMap =
               null;
            
//#line 30 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
hashMap = new x10.util.HashMap<java.lang.Integer, java.lang.String>((java.lang.System[])null).$init(x10.rtt.Types.INT,
                                                                                                                                                                                      x10.rtt.Types.STRING,
                                                                                                                                                                                      ((int)(1000)));
            
//#line 32 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
int one =
              1;
            
//#line 33 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
int two =
              2;
            
//#line 34 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
int three =
              3;
            
//#line 43 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
((x10.util.HashMap<java.lang.Integer, java.lang.String>)hashMap).put_0_$$x10$util$HashMap_K_1_$$x10$util$HashMap_V((java.lang.Integer)(one),
                                                                                                                                                                                                     ((java.lang.String)("One")));
            
//#line 44 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
((x10.util.HashMap<java.lang.Integer, java.lang.String>)hashMap).put_0_$$x10$util$HashMap_K_1_$$x10$util$HashMap_V((java.lang.Integer)(two),
                                                                                                                                                                                                     ((java.lang.String)("Two")));
            
//#line 45 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
((x10.util.HashMap<java.lang.Integer, java.lang.String>)hashMap).put_0_$$x10$util$HashMap_K_1_$$x10$util$HashMap_V((java.lang.Integer)(three),
                                                                                                                                                                                                     ((java.lang.String)("Three")));
            
//#line 47 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
x10.io.Console.OUT.println(((java.lang.String)((((("HashMap contains ") + (((java.lang.Integer)(((x10.util.HashMap<java.lang.Integer, java.lang.String>)hashMap).size$O()))))) + ("key value pairs.")))));
            
//#line 63 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
if (((x10.util.HashMap<java.lang.Integer, java.lang.String>)hashMap).containsKey_0_$$x10$util$HashMap_K$O((java.lang.Integer)(one))) {
                
//#line 64 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
x10.io.Console.OUT.println(((java.lang.String)("HashMap contains 1 as value")));
            } else {
                
//#line 66 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
x10.io.Console.OUT.println(((java.lang.String)("HashMap does not contain 1 as value")));
            }
        }
        
        
//#line 4 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
final public HashTest
                                                                               HashTest$$HashTest$this(
                                                                               ){
            
//#line 4 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
return HashTest.this;
        }
        
        
//#line 4 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
final private void
                                                                               __fieldInitializers210(
                                                                               ){
            
//#line 4 "/Users/ktran/ParallelProgramming/homework1/HashTest.x10"
this.s1 = null;
        }
        
        final public static void
          __fieldInitializers210$P(
          final HashTest HashTest){
            HashTest.__fieldInitializers210();
        }
    
}
