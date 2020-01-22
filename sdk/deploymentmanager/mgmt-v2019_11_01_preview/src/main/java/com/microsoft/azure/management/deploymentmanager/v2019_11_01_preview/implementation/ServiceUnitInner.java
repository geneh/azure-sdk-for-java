/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.RolloutStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.ServiceUnitProperties;

/**
 * Defines a service unit.
 */
public class ServiceUnitInner extends ServiceUnitProperties {
    /**
     * Name of the service unit.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Detailed step information, if present.
     */
    @JsonProperty(value = "steps")
    private List<RolloutStep> steps;

    /**
     * Get name of the service unit.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the service unit.
     *
     * @param name the name value to set
     * @return the ServiceUnitInner object itself.
     */
    public ServiceUnitInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get detailed step information, if present.
     *
     * @return the steps value
     */
    public List<RolloutStep> steps() {
        return this.steps;
    }

    /**
     * Set detailed step information, if present.
     *
     * @param steps the steps value to set
     * @return the ServiceUnitInner object itself.
     */
    public ServiceUnitInner withSteps(List<RolloutStep> steps) {
        this.steps = steps;
        return this;
    }

}