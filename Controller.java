
import java.awt.event.*;

public class Controller implements ActionListener{
    private Menu menu;
    private Frame frame;
    
    private String name;
    
    public Controller(){
        menu = new Menu();
        frame = new Frame();
        menu.getStart().addActionListener(this);
        menu.getRule().addActionListener(this);
        menu.getExit().addActionListener(this);
        menu.getAddname().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(menu.getStart())){
            menu.getFrameAdd().setVisible(true);
            
        }
        
        if (e.getSource().equals(menu.getAddname())) {
            name = menu.getName().getText();
            if (name.length()>0) {
                name = "";
                menu.getFrameAdd().setVisible(false);
                menu.getName().setText("");
                frame.getFrameTyping().setVisible(true);
            }
        }

        if (e.getSource().equals(menu.getRule())) {
             menu.getFrameRule().setVisible(true);
        }
        
        if (e.getSource().equals(menu.getExit())) {
             System.exit(0);
        }
    }
}
