package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    
    private TestPanel testPanel;
    private ResultatPanel resultatPanel;
    private JButton restarButton;

    public MainFrame(TestPanel testPanel) {
        this.setSize(new Dimension(400,500));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.testPanel = testPanel;

        JPanel maiPanel = new JPanel(new BorderLayout());
        maiPanel.add(testPanel,BorderLayout.CENTER);

        this.resultatPanel = new ResultatPanel();
        maiPanel.add(resultatPanel,BorderLayout.SOUTH);

        this.restarButton = new JButton("Reset");
        maiPanel.add(restarButton,BorderLayout.EAST);

        this.add(maiPanel);

        this.setVisible(true);
    }

    public TestPanel getTestPanel() {
        return testPanel;
    }

    public ResultatPanel getResultatPanel() {
        return resultatPanel;
    }

    public JButton getRestarButton() {
        return restarButton;
    }
}
