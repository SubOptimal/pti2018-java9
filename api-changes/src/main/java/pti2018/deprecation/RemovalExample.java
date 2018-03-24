package pti2018.deprecation;

public class RemovalExample {
    /**
     * the compilation results in a warning
     *
     * .../RemovalExample.java:5: warning: [removal] runFinalizersOnExit(boolean) in System has been deprecated and marked for removal
     */
    public static void main(String[] args) {
        System.runFinalizersOnExit(true);
    }
}
