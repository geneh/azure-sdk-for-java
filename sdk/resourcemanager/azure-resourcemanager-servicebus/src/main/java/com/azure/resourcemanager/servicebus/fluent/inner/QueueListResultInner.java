// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The QueueListResult model. */
@Fluent
public final class QueueListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueueListResultInner.class);

    /*
     * Result of the List Queues operation.
     */
    @JsonProperty(value = "value")
    private List<QueueResourceInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of queues.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List Queues operation.
     *
     * @return the value value.
     */
    public List<QueueResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Queues operation.
     *
     * @param value the value value to set.
     * @return the QueueListResultInner object itself.
     */
    public QueueListResultInner withValue(List<QueueResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * queues.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * queues.
     *
     * @param nextLink the nextLink value to set.
     * @return the QueueListResultInner object itself.
     */
    public QueueListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
