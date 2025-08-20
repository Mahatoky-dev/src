package controleur.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import modele.Test;
import vue.interfaces.ITestView;
import vue.interfaces.menuBar.TimeRefreshable;
import vue.interfaces.stat.IstatView;
import vue.interfaces.stat.IstatView;

public class RestartListener implements ActionListener {

    private Timer timer;
    private Test test;
    private ITestView testView;
    private TimeRefreshable timeRefreshable;
    private IstatView statView;

    public RestartListener(Test test, ITestView testView, Timer timer,TimeRefreshable timeRefreshable,IstatView statView) {
        this.test = test;
        this.testView = testView;
        this.timer = timer;
        this.timeRefreshable = timeRefreshable;
        this.statView = statView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.test.restart();
        this.testView.reset();
        timer.stop();
        statView.reset();
        timeRefreshable.refreshTime(test.getDuration());
    }
}
