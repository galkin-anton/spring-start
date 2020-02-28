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
package org.spring.start.beans;

import lombok.Data;
import lombok.NonNull;

/**
 * Project: SpringStart
 * Author: Galkin A.B.
 * Date: 27.02.2020
 * Time: 17:14
 * Descriptions
 */
@Data
public class Client {
    @NonNull
    private String fullName;
    @NonNull
    private String id;
}
