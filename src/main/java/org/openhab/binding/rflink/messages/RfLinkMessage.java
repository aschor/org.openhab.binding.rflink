/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.rflink.messages;

import java.util.HashMap;
import java.util.List;

import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.types.State;
import org.openhab.binding.rflink.exceptions.RfLinkException;

/**
 * This interface defines interface which every message class should implement.
 *
 * @author Cyril Cauchois - Initial contribution
 */
public interface RfLinkMessage {

    /**
     * Procedure for present class information in string format. Used for
     * logging purposes.
     *
     */
    @Override
    String toString();

    /**
     * Procedure for encode raw data.
     *
     * @param data
     *            Raw data.
     */
    void encodeMessage(String data);

    /**
     * Procedure to get device id.
     *
     * @return device Id.
     */
    String getDeviceId() throws RfLinkException;

    /**
     * Procedure to get device name.
     *
     * @return device Name.
     */
    String getDeviceName();

    /**
     * Procedure to thingType linked to message.
     *
     * @return Thing type.
     */
    ThingTypeUID getThingType();

    /**
     * Get all the value names that concerns this message
     *
     * @return
     */
    List<String> keys();

    /**
     * Get all the values in form of smarthome states
     *
     * @return
     */
    HashMap<String, State> getStates();
}
