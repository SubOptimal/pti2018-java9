package pti2018.processapi;

import java.io.IOException;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * https://docs.oracle.com/javase/9/core/process-api1.htm
 */
public class ProcessHandleDemo {

    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        getUserJavaProcesses();
    }

    /**
     * get all Java processes of the current user
     */
    private static void getUserJavaProcesses() {
        Optional<String> currUser = ProcessHandle.current().info().user();
        ProcessHandle.allProcesses()
                .filter(filterOnUserName(currUser))
                .filter(filterOnCommandName("/java"))
                .forEach(ProcessHandleDemo::printProcessInfo);
    }

    private static Predicate<ProcessHandle> filterOnCommandName(String command) {
        return ph -> ph.info().command().toString().contains(command);
    }

    private static Predicate<ProcessHandle> filterOnUserName(Optional<String> currUser) {
        return ph -> ph.info().user().equals(currUser);
    }

    private static void printProcessInfo(ProcessHandle ph) {
        System.out.printf("%d : %s%n", ph.pid(), ph.info().commandLine().orElse("n/a"));
    }
}
