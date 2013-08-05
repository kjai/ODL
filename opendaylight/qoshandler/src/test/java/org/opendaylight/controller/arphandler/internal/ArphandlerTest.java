
/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.arphandler.internal;


import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;
import org.opendaylight.controller.qoshandler.internal.QoSHandler;

public class ArphandlerTest extends TestCase {

        @Test
        public void testArphandlerCreation() {

                QoSHandler ah = null;
                ah = new QoSHandler();
                Assert.assertTrue(ah != null);

        }

}