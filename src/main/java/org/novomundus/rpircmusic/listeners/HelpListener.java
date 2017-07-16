package org.novomundus.rpircmusic.listeners;

/**
 * Created by Robert on 16-Jul-17.
 */

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.types.GenericMessageEvent;

public class HelpListener extends ListenerAdapter {
    @Override
    public void onGenericMessage(GenericMessageEvent evt) {
        if (evt.getMessage().startsWith(".help")) {
            evt.respondPrivateMessage("Actions available: .search, .play, .queue");
        }
    }
}
