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
import org.spring.start.loggers.ConsoleEventLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project: SpringStart
 * Author: Galkin A.B.
 * Date: 28.02.2020
 * Time: 14:00
 * Descriptions
 */

@Configuration
public class AppConfig {
    @Bean
    public Client client() {
        return new Client("Johm smith", "1");
    }

    @Bean
    public ConsoleEventLogger eventLogger() {
        return new ConsoleEventLogger();
    }

    @Bean
    public App app() {
        return new App(client(), eventLogger());
    }
}
