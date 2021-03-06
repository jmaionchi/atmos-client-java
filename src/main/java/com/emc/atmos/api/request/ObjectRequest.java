/*
 * Copyright (c) 2013-2016, EMC Corporation.
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * + Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * + Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * + The name of EMC Corporation may not be used to endorse or promote
 *   products derived from this software without specific prior written
 *   permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.emc.atmos.api.request;

import com.emc.atmos.api.ObjectIdentifier;
import com.emc.atmos.api.ObjectKey;
import com.emc.atmos.api.RestUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Represents an Atmos REST request dealing with a specific object.
 *
 * @param <T> Represents the implementation type. Allows a consistent builder interface throughout the request
 *            hierarchy. Parameterize concrete subclasses with their own type and implement {@link #me()} to return
 *            "this". In abstract subclasses, return me() in builder methods.
 */
public abstract class ObjectRequest<T extends ObjectRequest<T>> extends Request {
    protected ObjectIdentifier identifier;

    /**
     * Returns "this" in concrete implementation classes. Used in builder methods to be consistent throughout the
     * hierarchy. For example, you can call <code>new CreateObjectRequest().identifier(path).content(content)</code>.
     *
     * @return this
     */
    protected abstract T me();

    @Override
    public Map<String, List<Object>> generateHeaders( boolean encodeUtf8 ) {
        Map<String, List<Object>> headers = new TreeMap<String, List<Object>>();

        if ( identifier != null && identifier instanceof ObjectKey ) {
            RestUtil.addValue( headers, RestUtil.XHEADER_POOL, ((ObjectKey) identifier).getBucket() );
        }

        return headers;
    }

    /**
     * Builder method for {@link #setIdentifier(com.emc.atmos.api.ObjectIdentifier)}
     */
    public T identifier( ObjectIdentifier identifier ) {
        setIdentifier( identifier );
        return me();
    }

    /**
     * Returns the identifier of the target object for this request
     */
    public ObjectIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the target object for this request.
     */
    public void setIdentifier( ObjectIdentifier identifier ) {
        this.identifier = identifier;
    }
}
