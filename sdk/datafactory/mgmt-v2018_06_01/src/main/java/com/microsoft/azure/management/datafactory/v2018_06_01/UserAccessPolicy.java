/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Get Data Plane read only token request definition.
 */
public class UserAccessPolicy {
    /**
     * The string with permissions for Data Plane access. Currently only 'r' is
     * supported which grants read only access.
     */
    @JsonProperty(value = "permissions")
    private String permissions;

    /**
     * The resource path to get access relative to factory. Currently only
     * empty string is supported which corresponds to the factory resource.
     */
    @JsonProperty(value = "accessResourcePath")
    private String accessResourcePath;

    /**
     * The name of the profile. Currently only the default is supported. The
     * default value is DefaultProfile.
     */
    @JsonProperty(value = "profileName")
    private String profileName;

    /**
     * Start time for the token. If not specified the current time will be
     * used.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /**
     * Expiration time for the token. Maximum duration for the token is eight
     * hours and by default the token will expire in eight hours.
     */
    @JsonProperty(value = "expireTime")
    private String expireTime;

    /**
     * Get the string with permissions for Data Plane access. Currently only 'r' is supported which grants read only access.
     *
     * @return the permissions value
     */
    public String permissions() {
        return this.permissions;
    }

    /**
     * Set the string with permissions for Data Plane access. Currently only 'r' is supported which grants read only access.
     *
     * @param permissions the permissions value to set
     * @return the UserAccessPolicy object itself.
     */
    public UserAccessPolicy withPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
     *
     * @return the accessResourcePath value
     */
    public String accessResourcePath() {
        return this.accessResourcePath;
    }

    /**
     * Set the resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
     *
     * @param accessResourcePath the accessResourcePath value to set
     * @return the UserAccessPolicy object itself.
     */
    public UserAccessPolicy withAccessResourcePath(String accessResourcePath) {
        this.accessResourcePath = accessResourcePath;
        return this;
    }

    /**
     * Get the name of the profile. Currently only the default is supported. The default value is DefaultProfile.
     *
     * @return the profileName value
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Set the name of the profile. Currently only the default is supported. The default value is DefaultProfile.
     *
     * @param profileName the profileName value to set
     * @return the UserAccessPolicy object itself.
     */
    public UserAccessPolicy withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * Get start time for the token. If not specified the current time will be used.
     *
     * @return the startTime value
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set start time for the token. If not specified the current time will be used.
     *
     * @param startTime the startTime value to set
     * @return the UserAccessPolicy object itself.
     */
    public UserAccessPolicy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     *
     * @return the expireTime value
     */
    public String expireTime() {
        return this.expireTime;
    }

    /**
     * Set expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     *
     * @param expireTime the expireTime value to set
     * @return the UserAccessPolicy object itself.
     */
    public UserAccessPolicy withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

}