import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu implements ActionListener{

    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JLabel lbl1;
    private JButton start, rule, exit;

    public Menu() {
        fr = new JFrame("Catatype");
        fr.setSize(520, 500);
        fr.setLocation(600, 280);
   
        lbl1 = new JLabel("Catatype");
        lbl1.setFont(new Font("JasmineUPC",Font.BOLD,140));
        
        start = new JButton("Start");
        start.setPreferredSize(new Dimension(150, 50));
        start.setFont(new Font("JasmineUPC",Font.BOLD,40)); start.addActionListener(this);
        rule = new JButton("Rule");
        rule.setFont(new Font("JasmineUPC",Font.BOLD,40)); rule.addActionListener(this);
        exit = new JButton("Exit");
        exit.setFont(new Font("JasmineUPC",Font.BOLD,40)); exit.addActionListener(this);
        
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
    }
    
    public void actionPerformed(ActionEvent ae) {
        double total;
        String answer;
        
        if (ae.getSource().equals(exit)) {
             System.exit(0);
        }
    }

}