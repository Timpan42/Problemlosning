import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;

public class del1_u2 {
    public static void main (String[]args) {
        String s = JOptionPane.showInputDialog("Ge ord");
        String camel = camelCase(s);
        System.out.println(s);
        System.out.println(camel);
    }

    private static String camelCase(String s) {
        char x;
        char v;
        char [] sp;
        char ord = 0;
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            v = s.charAt(i);
            sp = char.slpit
            if (v == ' ') {
                x = s.charAt(i + 1);
                ord = Character.toUpperCase(x);
                word = Character.toString(ord);
            }
        }
        return word;
    }
}
