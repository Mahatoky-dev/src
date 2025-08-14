package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import modele.Test;
import modele.TestResult;
import vue.ResultatPanel;
import vue.TestPanel;

public class DurationControleur implements KeyListener,ActionListener {

    private Test test;
    private TestPanel testPanel;
    private ResultatPanel resultatPanel;

    public DurationControleur(Test test, TestPanel testPanel,ResultatPanel resultatPanel) {
        this.test = test;
        this.testPanel = testPanel;
        this.resultatPanel = resultatPanel;
        testPanel.setFocusable(true);
        this.testPanel.requestFocusInWindow();
        testPanel.addKeyListener(this);
        test.getTimer().addActionListener(this);
    }

    private void manageDurationTest() {
        Timer timer = test.getTimer();
        if(test.firstLetterTaped() && !timer.isRunning() ) {
            test.getTimer().start();
        } else if(test.isFinish() && timer.isRunning()) {
            timer.stop();
            TestResult testResult = new TestResult(test);
            resultatPanel.update(testResult.getWordParMinute(),testResult.getPrecision());
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        manageDurationTest();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resultatPanel.updateTime(test.getDuration());
    }

}
