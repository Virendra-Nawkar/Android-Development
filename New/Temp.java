import java.util.Scanner;

import javax.swing.JOptionPane;

public class Temp {
    public static void main(String[] args) {
       int temp[] = new int[8];
       int sum=0;
       for (int i = 0; i < 7; i++) {
           temp[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the temp"));
           sum = sum + temp[i];
       }
       System.out.println("The sum of temp is "+sum);
       System.out.println("The avrage of the temp is "+sum/7);
    }
}
