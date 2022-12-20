
import java.awt.event.*;

public class Controller implements ActionListener {

    private Menu menu;
    private Frame frame;

    public Controller() {
        menu = new Menu();
        frame = new Frame();
        menu.getStart().addActionListener(this);
        menu.getScore().addActionListener(this);
        menu.getExit().addActionListener(this);
        menu.getAddname().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(menu.getStart())) {
            menu.getFrameAdd().setVisible(true);

        }

        if (e.getSource().equals(menu.getAddname())) {
            if (menu.getName().getText().length() > 0) {
                menu.getFrameAdd().setVisible(false);
                menu.getName().setText("");
                frame.getFrameTyping().setVisible(true);
            }
        }

        if (e.getSource().equals(menu.getScore())) {
            menu.getFrameScore().setVisible(true);
        }

        if (e.getSource().equals(menu.getExit())) {
            System.exit(0);
        }
    }
}
