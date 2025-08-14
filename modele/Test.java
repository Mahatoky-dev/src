package modele;

import javax.swing.Timer;

public class Test {

    private int duration = 0;
    private Timer timer;
    private String letterTaped;
    private String letterDefaut;

    // constructor
    public Test(String letterDefaut) {
        this.letterDefaut = letterDefaut;
        this.letterTaped = "";
        this.timer = new Timer(1000, e -> {
            duration += 1;
        });
    }

    public void addLetterTapped(String letter) {
        this.letterTaped += letter;
    }

    public boolean letterIsValideAt(int index) {
        char[] charLetterTaped = letterTaped.toCharArray();
        char[] charLetterDefaut = letterDefaut.toCharArray();

        // if the letter at index is't not , avoid,not and valid
        if (index < charLetterTaped.length &&
                index < charLetterDefaut.length &&
                charLetterDefaut[index] == charLetterTaped[index]) {
            return true;
        }

        return false;
    }

    public void restart() {
        this.duration = 0;
        this.letterTaped = "";
        if(timer.isRunning()) {
            this.timer.stop();
        }
    }

    public boolean isFinish() {
        return this.letterDefaut.length() == this.letterTaped.length() ;
    }

    public boolean firstLetterTaped() {
        return letterTaped.length() == 1;
    }

    // setter
    public void setLetterTaped(String letterTaped) {
        this.letterTaped = letterTaped;
    }

    // getter
    public String getLetterTaped() {
        return letterTaped;
    }

    public String getLetterDefaut() {
        return letterDefaut;
    }

    public Timer getTimer() {
        return timer;
    }

    public int getDuration() {
        return duration;
    }
}