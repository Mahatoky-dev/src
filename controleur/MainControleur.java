package controleur;

import modele.Test;
import vue.MainFrame;
import vue.TestPanel;

public class MainControleur {
     

    public MainControleur() {
        init();
    }
    public void init() {
        Test test = new Test("La est importante dans le choix du formatage.");

        TestPanel testPanel = new TestPanel(test.getLetterDefaut());
        MainFrame mainFrame = new MainFrame(testPanel);
        new TextListener(test, testPanel);
        new DurationControleur(test, testPanel,mainFrame.getResultatPanel());
        new RestartControleur(mainFrame.getRestarButton(), test, testPanel, mainFrame.getResultatPanel());
    }
}
