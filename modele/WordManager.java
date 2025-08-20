package modele;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

public class WordManager {
    
    private Properties langageWords;
    private final String FILE_LANGAGE = "bin/langage.properties";

    public WordManager() {
        init();
    }
    private void init() {
        try (FileInputStream file = new FileInputStream(FILE_LANGAGE)) {
            this.langageWords = new Properties();
            langageWords.load(file);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getAllLangage() {
        return new ArrayList<>(langageWords.stringPropertyNames());
    }

    public ArrayList<String> getWords(String langage) {
        String listWordLineary = langageWords.getProperty(langage,"");
        String[] listWordInLangage = listWordLineary.split(",");
        return new ArrayList<>(Arrays.asList(listWordInLangage));
    }

    public String buildRandomText(String language,int nbWord) {
        String text = "";
        ArrayList<String> wordInLangage = getWords(language);
        Collections.shuffle(wordInLangage);

        for(int i = 0 ; i < wordInLangage.size() && i < nbWord ; i++) {
            text += wordInLangage.get(i);
            text += " ";
        }

        return text;
    }
}
