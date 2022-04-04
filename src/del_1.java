import javax.swing.*;

public class del_1 {
    public static void main (String[]args){
        String s = JOptionPane.showInputDialog("Ord ge");
        String r = reverse(s);
        System.out.println(s);
        System.out.println(r);
    }

    private static String reverse(String s) {
        char x = 0;
        String y = "";
        for (int i = 0; i < s.length(); i++){
            x = s.charAt(i);
            y = x + y;
        }
        return y;
    }
}
