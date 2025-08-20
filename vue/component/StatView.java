package vue.component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vue.interfaces.stat.IstatView;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class StatView extends JPanel implements IstatView {
    private JLabel wordParMinJLabel;
    private JLabel precisionJLabel;
    private JButton checkErrorButton;

    // constructor
    public StatView() {
        super(new BorderLayout());
        this.wordParMinJLabel = new JLabel("0 word/min");
        this.precisionJLabel = new JLabel("0% precision");
        this.checkErrorButton = new JButton("Check error");
        
        this.add(wordParMinJLabel, BorderLayout.NORTH);
        this.add(precisionJLabel, BorderLayout.SOUTH);
    }

    public void displayCheckErrorButton(Boolean display) {
        if(display) {
            this.add(checkErrorButton,BorderLayout.EAST);
        } else {
            this.remove(checkErrorButton);
        }
    }

    @Override
    public void update(double precision,double wordParMin) {
        this.wordParMinJLabel.setText(wordParMin + " word/min");
        this.precisionJLabel.setText(precision + "% precision");
    }

    @Override
    public void reset() {
        this.update(0, 0);
        this.repaint();
    }

    @Override
    public void refresh() {
        this.repaint();
    }

    @Override
    public void addActionListnerForBtCheckError(ActionListener e) {
        this.checkErrorButton.addActionListener(e);
    }
}
