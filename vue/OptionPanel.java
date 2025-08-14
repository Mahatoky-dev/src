package vue;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionPanel extends JPanel {

    private JButton changeLangageButton;
    private JButton resetButton;
    private JLabel timeLabel;

    public OptionPanel() {
        super(new FlowLayout());
        this.changeLangageButton = new JButton("change langage");
        this.resetButton = new JButton("restart");
        this.timeLabel = new JLabel("");
    }
}
