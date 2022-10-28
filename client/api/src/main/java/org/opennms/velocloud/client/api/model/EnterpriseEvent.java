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

package org.opennms.velocloud.client.api.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.StringJoiner;

import org.json.JSONException;
import org.json.JSONObject;

public class EnterpriseEvent {
    private String detail;
    private String category;
    private String event;
    private Integer id;
    private OffsetDateTime eventTime;
    private String edgeName;
    private String enterpriseUsername;
    private String message;
    private String severity;

    private EnterpriseEvent(final Builder builder) {
        this.detail = Objects.requireNonNull(builder.detail);
        this.category = Objects.requireNonNull(builder.category);
        this.event = Objects.requireNonNull(builder.event);
        this.id = Objects.requireNonNull(builder.id);
        this.eventTime = Objects.requireNonNull(builder.eventTime);
        this.message = Objects.requireNonNull(builder.message);
        this.severity = Objects.requireNonNull(builder.severity);

        this.edgeName = builder.edgeName;
        this.enterpriseUsername = builder.enterpriseUsername;
    }

    public String getDetail() {
        return detail;
    }

    public String getCategory() {
        return category;
    }

    public String getEvent() {
        return event;
    }

    public Integer getId() {
        return id;
    }

    public OffsetDateTime getEventTime() {
        return eventTime;
    }

    public String getEdgeName() {
        return edgeName;
    }

    public String getEnterpriseUsername() {
        return enterpriseUsername;
    }

    public String getMessage() {
        return message;
    }

    public String getSeverity() {
        return severity;
    }

    public static class Builder {
        private String detail;
        private String category;
        private String event;
        private Integer id;
        private OffsetDateTime eventTime;
        private String edgeName;
        private String enterpriseUsername;
        private String message;
        private String severity;

        public Builder withDetail(final String detail) {
            this.detail = detail;
            return this;
        }

        public Builder withCategory(final String category) {
            this.category = category;
            return this;
        }

        public Builder withEvent(final String event) {
            this.event = event;
            return this;
        }

        public Builder withId(final Integer id) {
            this.id = id;
            return this;
        }

        public Builder withEventTime(final OffsetDateTime eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        public Builder withEdgeName(final String edgeName) {
            this.edgeName = edgeName;
            return this;
        }

        public Builder withEnterpriseUsername(final String enterpriseUsername) {
            this.enterpriseUsername = enterpriseUsername;
            return this;
        }

        public Builder withMessage(final String message) {
            this.message = message;
            return this;
        }

        public Builder withSeverity(final String severity) {
            this.severity = severity;
            return this;
        }

        public EnterpriseEvent build() {
            return new EnterpriseEvent(this);
        }
    }

    public static EnterpriseEvent.Builder builder() {
        return new EnterpriseEvent.Builder();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ")
                .add("detail:" + this.detail)
                .add("category:" + this.category)
                .add("event:" + this.event)
                .add("id:" + this.id)
                .add("eventTime:" + this.eventTime)
                .add("edgeName:" + this.edgeName)
                .add("enterpriseUsername:" + this.enterpriseUsername)
                .add("message:" + this.message)
                .add("severity:" + this.severity)
                .toString();
    }
}