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
package org.spring.start.event;

import lombok.Data;

import java.util.Date;

/**
 * Project: SpringStart
 * Author: Galkin A.B.
 * Date: 28.02.2020
 * Time: 14:16
 * Descriptions
 */
@Data
public class Event {
    private int id;
    private String msg;
    private Date date;
}
