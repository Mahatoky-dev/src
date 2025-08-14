package vue;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.LocalTime;

public class ResultatPanel extends JPanel {
    private JLabel wordParMinJLabel;
    private JLabel precisionJLabel;
    private JLabel timeLabel;

    // constructor
    public ResultatPanel() {
        super(new BorderLayout());
        this.wordParMinJLabel = new JLabel("0 word/min");
        this.precisionJLabel = new JLabel("0% precision");
        this.timeLabel = new JLabel("00:00");

        this.add(wordParMinJLabel, BorderLayout.NORTH);
        this.add(precisionJLabel, BorderLayout.SOUTH);
        this.add(timeLabel,BorderLayout.WEST);
    }

    public void update(double wordParMin, double precision) {
        this.wordParMinJLabel.setText(wordParMin + " word/min");
        this.precisionJLabel.setText(precision + "% precision");
    }

    public void updateTime(int s) {
        LocalTime localTime = LocalTime.of(0, 0, s);
        this.timeLabel.setText(localTime.toString());
    }

    public void reset() {
        this.update(0, 0);
    }
}
 