package modele;

import java.util.ArrayList;

public class StatTest {
    private Test test;

    // constructor
    public StatTest(Test test) {
        this.test = test;
    }

    public double getDuration() {
        return test.getDuration() / 60;
    }

    public int countError() {
        int nbError = 0;
        char[] letterDefaut = test.getLetterDefaut().toCharArray();
        char[] letterTaped = test.getLetterTaped().toCharArray();
        for (int i = 0; i < letterDefaut.length; i++) {
            if (letterDefaut[i] != letterTaped[i]) {
                nbError++;
            }
        }
        return nbError;
    }

    public double getPrecision() {
        double nbCharLetterDefaut = test.getLetterDefaut().length() - 1;
        double precision = ((nbCharLetterDefaut - countError()) / nbCharLetterDefaut) * 100;
        return precision;
    }

    public String[] getWordDefaut() {
        return test.getLetterDefaut().split(" ");
    }

    public String[] getWordTypedCorespToDefaut() {
        String[] wordDefauts = getWordDefaut();
        String[] listWordCoresp = new String[wordDefauts.length];

        char[] letterTaped = test.getLetterTaped().toCharArray();
        int indexLetter = 0;
        System.out.println("letter taped : "+ test.getLetterTaped());

        for (int i = 0; i < wordDefauts.length; i++) {
            String wordCoresp = "";
            for (int j = 0; j < wordDefauts[i].length(); j++) {
                wordCoresp += letterTaped[indexLetter];
                indexLetter++;
            }
            listWordCoresp[i] = wordCoresp;

            // incremente pour passe aux mot suivant
            indexLetter++;
        }
        return listWordCoresp;
    }

    public ArrayList<String> getWordValide() {
        String[] wordDefauts = getWordDefaut();
        String[] wordCoresps = getWordTypedCorespToDefaut();

        ArrayList<String> wordValide = new ArrayList<>();
        for (int i = 0; i < wordDefauts.length; i++) {
            if (wordDefauts[i].equals(wordCoresps[i])) {
                wordValide.add(wordDefauts[i]);
            }
        }
        return wordValide;
    }

    public ArrayList<String> getWordUnvalide() {
        String[] wordDefauts = getWordDefaut();
        String[] wordCoresps = getWordTypedCorespToDefaut();

        ArrayList<String> wordValide = new ArrayList<>();
        for (int i = 0; i < wordDefauts.length; i++) {
            if (!wordDefauts[i].equals(wordCoresps[i])) {
                wordValide.add(wordDefauts[i]);
            }
        }
        return wordValide;
    }

    public String getTextFromWordArray(ArrayList<String> arrayWords,int repetition) {
        String text = "";
        for(int i = 0;i < repetition ;i++) {
            for(String word : arrayWords) {
                text += word;
                text += " ";
            }
        }
        return text;
    }

    public double getWordParMinute() {
        return Double.valueOf(getWordValide().size()) / (Double.valueOf(test.getDuration())/60);
    }

    public boolean havePerfectPrecision() {
        return (int)getPrecision() == 100;
    }
}
