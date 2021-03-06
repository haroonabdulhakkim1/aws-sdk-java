/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information on a Device
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Device" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Device implements Serializable, Cloneable, StructuredPojo {

    /** Certificate arn of the device. */
    private String certificateArn;
    /** Element Id for this entry in the list. */
    private String id;
    /** If true, the local shadow value automatically syncs with the cloud's shadow state. */
    private Boolean syncShadow;
    /** Thing arn of the device. */
    private String thingArn;

    /**
     * Certificate arn of the device.
     * 
     * @param certificateArn
     *        Certificate arn of the device.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * Certificate arn of the device.
     * 
     * @return Certificate arn of the device.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * Certificate arn of the device.
     * 
     * @param certificateArn
     *        Certificate arn of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * Element Id for this entry in the list.
     * 
     * @param id
     *        Element Id for this entry in the list.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Element Id for this entry in the list.
     * 
     * @return Element Id for this entry in the list.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Element Id for this entry in the list.
     * 
     * @param id
     *        Element Id for this entry in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withId(String id) {
        setId(id);
        return this;
    }

    /**
     * If true, the local shadow value automatically syncs with the cloud's shadow state.
     * 
     * @param syncShadow
     *        If true, the local shadow value automatically syncs with the cloud's shadow state.
     */

    public void setSyncShadow(Boolean syncShadow) {
        this.syncShadow = syncShadow;
    }

    /**
     * If true, the local shadow value automatically syncs with the cloud's shadow state.
     * 
     * @return If true, the local shadow value automatically syncs with the cloud's shadow state.
     */

    public Boolean getSyncShadow() {
        return this.syncShadow;
    }

    /**
     * If true, the local shadow value automatically syncs with the cloud's shadow state.
     * 
     * @param syncShadow
     *        If true, the local shadow value automatically syncs with the cloud's shadow state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withSyncShadow(Boolean syncShadow) {
        setSyncShadow(syncShadow);
        return this;
    }

    /**
     * If true, the local shadow value automatically syncs with the cloud's shadow state.
     * 
     * @return If true, the local shadow value automatically syncs with the cloud's shadow state.
     */

    public Boolean isSyncShadow() {
        return this.syncShadow;
    }

    /**
     * Thing arn of the device.
     * 
     * @param thingArn
     *        Thing arn of the device.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * Thing arn of the device.
     * 
     * @return Thing arn of the device.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * Thing arn of the device.
     * 
     * @param thingArn
     *        Thing arn of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withThingArn(String thingArn) {
        setThingArn(thingArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSyncShadow() != null)
            sb.append("SyncShadow: ").append(getSyncShadow()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Device == false)
            return false;
        Device other = (Device) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSyncShadow() == null ^ this.getSyncShadow() == null)
            return false;
        if (other.getSyncShadow() != null && other.getSyncShadow().equals(this.getSyncShadow()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSyncShadow() == null) ? 0 : getSyncShadow().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        return hashCode;
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.DeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
