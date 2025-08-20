package vue.interfaces;

import java.awt.event.KeyListener;

public interface ITestView extends Resetable , Refreshable {
    void addKeyListenerForTextTaping(KeyListener e);
    void changeLetterAtIndexToValide(int index);
    void changeLetterAtIndexToUnvalide(int index);
    void setLetters(String letters);
}
