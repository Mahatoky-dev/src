package controleur.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

import modele.Test;
import vue.interfaces.ITestView;
import vue.interfaces.menuBar.TimeRefreshable;

public class TimerControleur {

    private Timer timer;
    private Test test;
    private ITestView testView;
    private TimeRefreshable timeRefreshable;

    private final static int TIME_INTERVAL = 1000;

    public TimerControleur(Test test, ITestView testView, TimeRefreshable timeRefreshable) {

        this.test = test;
        this.testView = testView;
        this.timeRefreshable = timeRefreshable;

        this.timer = new Timer(TIME_INTERVAL, e -> test.incrementDuration());
        this.testView.addKeyListenerForTextTaping(getStartAndStopListener());
        this.timer.addActionListener(refreshTimeViewIfWhenTimeChangeListener());
    }

    private KeyAdapter getStartAndStopListener() {
        KeyAdapter startAndStopListener = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("La premiere letre est tape :"+ test.firstLetterTaped());
                if (test.firstLetterTaped() && !timer.isRunning()) {
                    timer.start();
                } else if (test.isFinish() && timer.isRunning()) {
                    timer.stop();
                }
            }
        };
        return startAndStopListener;
    }

    private ActionListener refreshTimeViewIfWhenTimeChangeListener() {
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timeRefreshable.refreshTime(test.getDuration());
            }
        };
        return actionListener;
    }

    public Timer getTimer() {
        return timer;
    }
}
