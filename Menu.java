
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;

public class Menu {

    private JFrame fr, frScore, frAdd;
    private JTextField Addname;
    private JPanel p1, p2, p3, p4, pScore, pAdd, pAdd2;
    private JLabel lbl1, lblAdd, lblScore, lblRule3, lblRule4, lblRule5, lblRule6;
    private JButton start, score, exit, Add;
    private JScrollPane scrollPane;
    private JTable table;

    public Menu() {
        //   Menu View
        fr = new JFrame("Catatype");
        fr.setSize(500, 370);
        fr.setLocationRelativeTo(null);
        fr.setResizable(false);

        lbl1 = new JLabel("Catatype");
        lbl1.setFont(new Font("JasmineUPC", Font.BOLD, 140));

        start = new JButton("Start");
        start.setPreferredSize(new Dimension(150, 50));
        start.setFont(new Font("JasmineUPC", Font.BOLD, 40));
        score = new JButton("Score");
        score.setFont(new Font("JasmineUPC", Font.BOLD, 40));
        exit = new JButton("Exit");
        exit.setFont(new Font("JasmineUPC", Font.BOLD, 40));
        start.setFocusable(false);
        score.setFocusable(false);
        exit.setFocusable(false);

        p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.add(lbl1);
        lbl1.setHorizontalAlignment(JLabel.CENTER);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(3, 1, 10, 10));
        p2.add(start);
        p2.add(score);
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

        //   Score View
        frScore = new JFrame("Score Board");
        frScore.setSize(510, 570);
        frScore.setLocationRelativeTo(null);
        frScore.setVisible(false);

        pScore = new JPanel();
        pScore.setLayout(new BorderLayout());

        lblScore = new JLabel("Score Board");
        lblScore.setFont(new Font("JasmineUPC", Font.BOLD, 120));

        lblScore.setHorizontalAlignment(JLabel.CENTER);

        pScore.add(lblScore, BorderLayout.NORTH);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(33, 41, 494, 90);
        pScore.add(scrollPane, BorderLayout.CENTER);
// Table
        table = new JTable();
        scrollPane.setViewportView(table);
// Model for Table
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Name");
        model.addColumn("WPM");
// Data Row
        for (int i = 0; i < 10; i++) {
            model.addRow(new Object[0]);
            model.setValueAt(i + 1, i, 0);
            model.setValueAt("Data Col 1", i, 1);
            model.setValueAt("Data Col 2", i, 2);
            model.setValueAt("Data Col 3", i, 3);
        }

        frScore.add(pScore);
        frScore.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // Addname
        frAdd = new JFrame("");
        frAdd.setLocationRelativeTo(null);
        frAdd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frAdd.setSize(350, 170);
        frAdd.setVisible(false);

        pAdd = new JPanel();
        pAdd.setLayout(new GridLayout(3, 1, 10, 10));

        lblAdd = new JLabel("Please Enter Your Name");
        lblAdd.setHorizontalAlignment(JLabel.CENTER);
        lblAdd.setFont(new Font("JasmineUPC", Font.BOLD, 35));
        Addname = new JTextField();

        Add = new JButton("Add");
        Add.setFont(new Font("JasmineUPC", Font.BOLD, 35));
        Add.setFocusable(false);

        pAdd.add(lblAdd);
        pAdd.add(Addname);
        pAdd.add(Add);

        pAdd2 = new JPanel();
        pAdd2.setLayout(new FlowLayout(FlowLayout.CENTER));
        pAdd2.add(pAdd);

        frAdd.add(pAdd2);
        frAdd.setResizable(false);

    }

    public JButton getStart() {
        return start;
    }

    public void setStart(JButton start) {
        this.start = start;
    }

    public JButton getScore() {
        return score;
    }

    public void setScore(JButton score) {
        this.score = score;
    }

    public JButton getExit() {
        return exit;
    }

    public void setExit(JButton exit) {
        this.exit = exit;
    }

    public JButton getAddname() {
        return Add;
    }

    public void setAddname(JButton Add) {
        this.Add = Add;
    }

    public JFrame getFrameScore() {
        return frScore;
    }

    public void setFrameScore(JFrame FrameScore) {
        this.frScore = FrameScore;
    }

    public JFrame getFrameAdd() {
        return frAdd;
    }

    public void setFrameAdd(JFrame FrameAdd) {
        this.frAdd = FrameAdd;
    }

    public JTextField getName() {
        return Addname;
    }

    public void setName(JTextField Addname) {
        this.Addname = Addname;
    }

}
