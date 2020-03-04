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

import lombok.Data;
import org.apache.commons.io.FileUtils;
import org.spring.start.event.Event;

import java.io.File;
import java.io.IOException;

/**
 * Project: SpringStart
 * Author: Galkin A.B.
 * Date: 03.03.2020
 * Time: 10:36
 * Descriptions
 */
@Data
public class FileEventLogger implements EventLogger {
    private String fileName;

    public void logEvent(Event event) throws IOException {
        FileUtils.writeStringToFile(new File(fileName), event.toString(), true);
    }
}
