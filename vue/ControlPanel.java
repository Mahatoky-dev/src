package vue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
    private JButton nextTextButton;
    private JButton precTextButton;
    private JButton restartButton;
    private JButton genererTextButton;

    public ControlPanel() {
        this.nextTextButton = new JButton("next");
        this.precTextButton = new JButton("prec");
        this.restartButton = new JButton("restart");
        this.genererTextButton = new JButton();
    }

   
}
