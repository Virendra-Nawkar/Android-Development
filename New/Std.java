import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

// design a class student with data memeber roll number names and brach and
// member funtion set data and showdata
// accept the data for 5 students and print it
class Student {
    int Roll_No;
    String Name, Brach;
    float Percentage;

    void showdata() {
        JOptionPane.showMessageDialog(null, "Roll No. of Student :" + Roll_No + "\n"+
                "Name of Student :" + Name + "\n"+
                "Brach of Student :" + Brach + "\n"+
                "Percentage of Student :" + Percentage);
        // JOptionPane.showMessageDialog(null, "Name of Student :" + Name);
        // JOptionPane.showMessageDialog(null, "Brach of Student :" + Brach);
        // JOptionPane.showMessageDialog(null, "Percentage of Student :" + Percentage);
    }

    void setdata(int Roll_No, String Name, String Brach, Float Percentage) {
        this.Roll_No = Roll_No;
        this.Name = Name;
        this.Brach = Brach;
        this.Percentage = Percentage;

    }
}

public class Std {
    public static void main(String[] args) {
        System.out.println("This is Program to Print number and Marks of the Students");
        Student S = new Student();
        int Roll_No = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Roll No."));
        String Name = JOptionPane.showInputDialog(null, "Enter your Name");
        String Brach = JOptionPane.showInputDialog(null, "Enter your Brach");
        float Percentage = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Percentage"));
        S.setdata(Roll_No, Name, Brach, Percentage);
        S.showdata();

        for (int i = 0; i < 5; i++) {
            Student j = new Student();
            int Roll_Noj = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Roll No."));
            String Namej = JOptionPane.showInputDialog(null, "Enter your Name");
            String Brachj = JOptionPane.showInputDialog(null, "Enter your Brach");
            float Percentagej = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Percentage"));
            j.setdata(Roll_Noj, Namej, Brachj, Percentagej);
            j.showdata();
        }
    }
}
