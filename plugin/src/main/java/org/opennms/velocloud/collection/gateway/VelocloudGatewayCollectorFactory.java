/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2022 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2022 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.velocloud.collection.gateway;

import org.opennms.integration.api.v1.dao.NodeDao;
import org.opennms.velocloud.clients.ClientManager;
import org.opennms.velocloud.collection.AbstractVelocloudCollectorFactory;
import org.opennms.velocloud.collection.link.VelocloudLinkCollector;
import org.opennms.velocloud.connections.ConnectionManager;

public class VelocloudGatewayCollectorFactory extends AbstractVelocloudCollectorFactory<VelocloudGatewayCollector> {

    public VelocloudGatewayCollectorFactory(ClientManager clientManager, ConnectionManager connectionManager, NodeDao nodeDao) {
        super(clientManager, connectionManager, nodeDao);
    }

    @Override
    public VelocloudGatewayCollector createCollector() {
        return new VelocloudGatewayCollector(clientManager, connectionManager);
    }

    @Override
    public String getCollectorClassName() {
        return VelocloudGatewayCollector.class.getCanonicalName();
    }

}
