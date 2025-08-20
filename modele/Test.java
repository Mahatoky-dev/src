package modele;

import modele.interfaces.Restartable;

public class Test implements Restartable {

    private int duration = 0;
    private String letterTaped;
    private String letterDefaut;

    // constructor
    public Test(String letterDefaut) {
        this.letterDefaut = letterDefaut;
        this.letterTaped = "";
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

    public boolean isFinish() {
        return this.letterDefaut.length() == this.letterTaped.length();
    }

    public boolean firstLetterTaped() {
        return letterTaped.length() == 1;
    }

    public void incrementDuration() {
        this.duration++;
    }

    @Override
    public void restart() {
        this.duration = 0;
        this.letterTaped = "";
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

    public int getDuration() {
        return duration;
    }

    public void setLetterDefaut(String letterDefaut) {
        this.letterDefaut = letterDefaut;
    }
}