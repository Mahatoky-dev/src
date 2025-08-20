package vue.component.menuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import vue.interfaces.menuBar.IMenuBar;

public class MenuBar extends JPanel implements IMenuBar {

    private JButton restarButton = new JButton("Restart");
    private TimeLabel timeLabel = new TimeLabel();

    public MenuBar() {
        super(new FlowLayout());
        this.add(timeLabel);
        this.add(restarButton);
    }

    

    @Override
    public void addActionListnerForButtonRestart(ActionListener e) {
        restarButton.addActionListener(e);
    }



    @Override
    public void refreshTime(int s) {
        this.timeLabel.refreshTime(s);
    }
}
