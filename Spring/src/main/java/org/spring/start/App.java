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
package org.spring.start;

import org.spring.start.beans.Client;
import org.spring.start.event.Event;
import org.spring.start.loggers.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Project: SpringStart
 * Author: Galkin A.B.
 * Date: 27.02.2020
 * Time: 16:48
 * Descriptions
 */

public class App {
    private Client client;
    private EventLogger eventLogger;
    private Event event;

    public App(Client client, EventLogger eventLogger, Event event) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.event = event;
    }

    public static void main(String[] args) throws IOException {
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = ctx.getBean(App.class);
        app.event = ctx.getBean(Event.class);

        app.logEvent("some event for user 1");
    }

    private void logEvent(String msg) throws IOException {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(event);
    }
}
