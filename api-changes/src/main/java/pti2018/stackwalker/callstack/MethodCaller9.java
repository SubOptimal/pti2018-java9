package pti2018.stackwalker.callstack;

/**
 * example how to get the name of the caller method
 *
 * https://docs.oracle.com/javase/9/docs/api/java/lang/StackWalker.html
 */
public class MethodCaller9 {
    public static void main(String[] args) {
        methodOne();
    }

    static void methodOne() {
        methodTwo();
    }

    static void methodTwo() {
        methodThree();
    }

    static void methodThree() {
        String caller = whoCalledMe();
        System.out.printf("caller was: %s%n", caller);
    }

    private static String whoCalledMe() {
        // the StackWalker stream returns the entries lazily
        // we need to skip the first two entries
        // first entry is the StackWalker
        // second entry is the methodThree
        StackWalker.StackFrame stackFrame = StackWalker.getInstance()
                .walk(s -> s.skip(2).findFirst()
                ).get();
        String clazz = stackFrame.getClassName();
        String method = stackFrame.getMethodName();
        String caller = clazz + '.' + method;
        return caller;
    }
}

