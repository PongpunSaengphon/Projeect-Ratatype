import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu{

    private JFrame fr,frRule;
    private JPanel p1, p2, p3, p4, pRule;
    private JLabel lbl1, lblRule, lblRule2, lblRule3, lblRule4, lblRule5, lblRule6;
    private JButton start, rule, exit;
    
    public Menu() {
        //   Menu View
        fr = new JFrame("Catatype");
        fr.setSize(500, 370);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        lbl1 = new JLabel("Catatype");
        lbl1.setForeground(Color.ORANGE);
        lbl1.setFont(new Font("JasmineUPC",Font.BOLD,140));

        start = new JButton("Start");
        start.setPreferredSize(new Dimension(150, 50));
        start.setFont(new Font("JasmineUPC",Font.BOLD,35));
        rule = new JButton("Rule");
        rule.setFont(new Font("JasmineUPC",Font.BOLD,35));
        exit = new JButton("Exit");
        exit.setFont(new Font("JasmineUPC",Font.BOLD,35));
        start.setFocusable(false);
        rule.setFocusable(false);
        exit.setFocusable(false);
        
        p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.add(lbl1);
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(3, 1, 10, 10));
        p2.add(start);
        p2.add(rule);
        p2.add(exit);
        
        p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.add(p2);
                
        p4 = new JPanel();
        p4.setLayout(new BorderLayout());
        p4.add(p1, BorderLayout.NORTH);
        p4.add(p3, BorderLayout.CENTER);
        
        fr.add(p4);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        //   Rule View
        frRule = new JFrame("Rule");
        frRule.setSize(510, 570);
        frRule.setResizable(false);
        frRule.setLocationRelativeTo(null);
        
        pRule = new JPanel();
        pRule.setLayout(new BorderLayout());
        
        lblRule = new JLabel("Rule"); lblRule.setFont(new Font("JasmineUPC",Font.BOLD,120));
        lblRule2 = new JLabel("<html>1. When the Start button is clicked, the program starts.<br/><br/><br/>"
                + "2. The program will display a series of messages on the screen. The user must type in the correct letters.<br/><br/><br/>"
                + "3. If the user has typed correctly, the letter will turn green and the next letter can be typed. But if it is not typed correctly, the next letter cannot be typed.<br/><br/><br/>"
                + "4. When typing all the letters The program will show you the speed of typing per word possible and the accuracy of typing. and represents the level of typing.</html>"); lblRule2.setFont(new Font("JasmineUPC",Font.ROMAN_BASELINE,30));
                
        lblRule.setHorizontalAlignment(JLabel.CENTER);
        
        pRule.add(lblRule, BorderLayout.NORTH);
        pRule.add(lblRule2, BorderLayout.CENTER);
        
        frRule.add(pRule);
        frRule.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
    }
    

    public JButton getStart() {return start;}
    public void setStart(JButton start) {this.start = start;}
    
    public JButton getRule() {return rule;}
    public void setRule(JButton rule) {this.rule = rule;}
    
    public JButton getExit() {return exit;}
    public void setExit(JButton exit) {this.exit = exit;}
    
    public JFrame getFrameRule() {return frRule;}
    public void setFrameRule(JFrame FrameRule) {this.frRule = FrameRule;}

}