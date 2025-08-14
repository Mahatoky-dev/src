package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import modele.Test;
import vue.ResultatPanel;
import vue.TestPanel;

public class RestartControleur implements ActionListener {

    private Test test;
    private TestPanel testPanel;
    private ResultatPanel resultatPanel;

    public RestartControleur(JButton buttonRestart,Test test,TestPanel testPanel,ResultatPanel resultatPanel) {
        this.test = test;
        this.testPanel = testPanel;
        this.resultatPanel = resultatPanel;
        buttonRestart.addActionListener(this);
    }

    public void restartTest() {
        test.restart();
        testPanel.restart();
        resultatPanel.reset();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        restartTest();
    }
    
}
