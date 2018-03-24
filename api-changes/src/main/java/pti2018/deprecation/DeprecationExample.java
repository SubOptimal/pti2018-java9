package pti2018.deprecation;

import javax.swing.*;

public class DeprecationExample {
    /**
     * the compilation results in a warning
     *
     * Note: src/main/java/pti2018/deprecation/DeprecationExample.java uses or overrides a deprecated API.
     */
    public static void main(String[] args) {
        JList jlist = new JList();
        Object[] values = jlist.getSelectedValues();
    }
}
