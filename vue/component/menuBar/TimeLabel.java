package vue.component.menuBar;

import javax.swing.JLabel;
import java.time.LocalTime;
import vue.interfaces.Resetable;
import vue.interfaces.menuBar.TimeRefreshable;

public class TimeLabel extends JLabel implements Resetable, TimeRefreshable {

    public TimeLabel() {
        super(LocalTime.of(0, 0, 0).toString());
    }

    public void reset() {
        this.setText(LocalTime.of(0, 0, 0).toString());
    }

    public void refreshTime(int s) {
        this.setText(LocalTime.ofSecondOfDay(s).toString());
    }
}
