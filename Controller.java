import java.awt.event.*;

public class Controller implements ActionListener{
    private Menu menu;
    private Frame frame;
    
    public Controller(){
        menu = new Menu();
        frame = new Frame();
        menu.getStart().addActionListener(this);
        menu.getRule().addActionListener(this);
        menu.getExit().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(menu.getStart())){
        frame.getFrameTyping().setVisible(true);
        }
        
        else if (e.getSource().equals(menu.getRule())) {
             menu.getFrameRule().setVisible(true);
        }
        
        else if (e.getSource().equals(menu.getExit())) {
             System.exit(0);
        }
    }
}