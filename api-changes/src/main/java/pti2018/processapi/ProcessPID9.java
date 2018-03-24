package pti2018.processapi;

import java.io.IOException;

/**
 * example how to get the PID of a child process with Java since version 9
 */
public class ProcessPID9 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("echo", "Hello World!");
        pb.inheritIO();
        Process pid = pb.start();

        System.out.println("pid = " + pid);
    }
}
