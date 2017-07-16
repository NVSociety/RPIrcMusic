package org.novomundus.rpircmusic;

/**
 * Created by Robert on 16-Jul-17.
 */


import java.io.FileNotFoundException;
import java.io.FileInputStream;

import java.util.Iterator;
import java.util.Map;

import org.pircbotx.PircBotX;
import org.pircbotx.Configuration;
import org.yaml.snakeyaml.Yaml;


public class IRCBot {



    public static void main(String[] args) throws Exception{
        // Load the config
        Yaml cfg = new Yaml();
        FileInputStream is = null;
        try {
            is = new FileInputStream("config.yml");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Map<String, String> cfgoutput = (Map<String, String>) cfg.load(is);


        // Build the bot
        Configuration.Builder botcfg = new Configuration.Builder();
        Iterator mapiter = cfgoutput.values().iterator();
        while (mapiter.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) mapiter.next();

            String Key = (String) mapEntry.getKey();
            String Value = (String) mapEntry.getValue();

            switch(Key) {
                case "server":
                    botcfg.addServer(Value);
                    break;
                case "nickname":
                    botcfg.setName(Value);
                    break;
                case "realname":
                    botcfg.setRealName(Value);
                    break;
            }
        }

        botcfg.buildConfiguration();
    }
}
