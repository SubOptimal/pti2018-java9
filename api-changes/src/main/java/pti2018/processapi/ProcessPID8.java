package pti2018.processapi;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * example how to get the PID of a child process with Java before version 9
 */
public class ProcessPID8 {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        ProcessBuilder processBuilder = new ProcessBuilder().command("echo", "Hello World!");
        processBuilder.inheritIO();
        Process p = processBuilder.start();

        /// access to the PID only via reflection
        Field pidField = p.getClass().getDeclaredField("pid");
        pidField.setAccessible(true);
        int pid = (int) pidField.get(p);

        System.out.println("PID = " + pid);
    }
}
