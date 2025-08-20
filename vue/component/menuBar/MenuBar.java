package vue.component.menuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import vue.interfaces.menuBar.IMenuBar;

public class MenuBar extends JPanel implements IMenuBar {

    private TimeLabel timeLabel = new TimeLabel();
    private JButton restarButton = new JButton("Restart");
    private JButton buildTexButton = new JButton("New Text");

    public MenuBar() {
        super(new FlowLayout());
        this.add(timeLabel);
        this.add(restarButton);
        this.add(buildTexButton);
    }

    

    @Override
    public void addActionListnerForButtonRestart(ActionListener e) {
        restarButton.addActionListener(e);
    }



    @Override
    public void refreshTime(int s) {
        this.timeLabel.refreshTime(s);
    }



    @Override
    public void addActionListenerForBuidTextButton(ActionListener e) {
        this.buildTexButton.addActionListener(e);
    }
}
