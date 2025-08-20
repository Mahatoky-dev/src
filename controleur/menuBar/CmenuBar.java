package controleur.menuBar;
import controleur.Listener.RestartListener;
import controleur.Listener.TimerControleur;
import modele.Test;
import vue.interfaces.ITestView;
import vue.interfaces.menuBar.IMenuBar;
import vue.interfaces.stat.IstatView;

public class CmenuBar {

    public CmenuBar(IMenuBar menuBar, Test test, ITestView testView,IstatView statView) {
        // controler le timer        
        TimerControleur timerControleur = new TimerControleur(test, testView, menuBar);

        //controluer le bouton restart
        menuBar.addActionListnerForButtonRestart(new RestartListener(test, testView, timerControleur.getTimer(),menuBar,statView));
    }
}
