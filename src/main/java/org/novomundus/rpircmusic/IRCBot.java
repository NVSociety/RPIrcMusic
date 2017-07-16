package org.novomundus.rpircmusic;

/**
 * Created by Robert on 16-Jul-17.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


import org.pircbotx.PircBotX;
import org.yaml.snakeyaml.Yaml;

public class IRCBot {

    private void loadConfig() {
        File cfgfile = new File("src/config.yml");
        Yaml cfg = new Yaml();
        try {
            FileReader doc = new FileReader("src/config.yml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
