/*
 * Copyright (c) 2008-2020
 * Sberbank
 * All rights reserved.
 *
 * This product and related documentation are protected by copyright and
 * distributed under licenses restricting its use, copying, distribution, and
 * decompilation. No part of this product or related documentation may be
 * reproduced in any form by any means without prior written authorization of
 * Sberbank and its licensors, if any.
 *
 * $
 */
package org.spring.start.loggers;

import lombok.Getter;
import lombok.NonNull;
import org.spring.start.event.Event;

import java.io.IOException;
import java.util.List;

/**
 * Project: SpringStart
 * Author: Galkin A.B.
 * Date: 06.03.2020
 * Time: 16:49
 * Descriptions
 */

@Getter
public class CashFileEventLogger extends FileEventLogger {
    private int casheSize;
    private List<Event> cashe;

    public CashFileEventLogger(@NonNull String fileName, int casheSize) {
        super(fileName);
        this.casheSize = casheSize;
        //this.cashe = new List<>();
    }

    public void logEvent(Event event) throws IOException {
        cashe.add(event);

        if (cashe.size() == casheSize) {
            writeEventsFromCashe();
            cashe.clear();
        }
    }

    private void writeEventsFromCashe() throws IOException {
        for (Event e : cashe) {
            writeEventToFile(e);
        }
    }
}
