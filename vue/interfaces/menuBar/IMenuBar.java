package vue.interfaces.menuBar;

import java.awt.event.ActionListener;

public interface IMenuBar extends TimeRefreshable {
    void addActionListnerForButtonRestart(ActionListener e);
    void addActionListenerForBuidTextButton(ActionListener e);
}
