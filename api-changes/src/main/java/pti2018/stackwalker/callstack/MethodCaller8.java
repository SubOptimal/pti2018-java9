package pti2018.stackwalker.callstack;

/**
 * example how to get the name of the caller method
 */
public class MethodCaller8 {
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
        // we need to retrieve the full stack trace, regardless how
        // many entries from top we need
        StackTraceElement[] stackTrace =
                Thread.currentThread().getStackTrace();

        String caller;
        if (stackTrace.length < 4) {
            caller = "n/a";
        } else {
            String clazz = stackTrace[3].getClassName();
            String method = stackTrace[3].getMethodName();
            caller = clazz + '.' + method;
        }
        return caller;
    }
}

