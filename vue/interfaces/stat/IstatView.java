package vue.interfaces.stat;

import vue.interfaces.Resetable;

import java.awt.event.ActionListener;

import vue.interfaces.Refreshable;

public interface IstatView extends Refreshable , Resetable {
    void update(double precision,double wordPerMin);
    void displayCheckErrorButton(Boolean display);
    void addActionListnerForBtCheckError(ActionListener e);
}