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
package com.emc.atmos.util;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.core.header.reader.HttpHeaderReader;

import java.text.ParseException;
import java.util.Date;

public class ReorderedFormDataContentDisposition extends FormDataContentDisposition {
    public ReorderedFormDataContentDisposition( String type,
                                                String name,
                                                String fileName,
                                                Date creationDate,
                                                Date modificationDate, Date readDate, long size ) {
        super( type, name, fileName, creationDate, modificationDate, readDate, size );
    }

    public ReorderedFormDataContentDisposition( String header ) throws ParseException {
        super( header );
    }

    public ReorderedFormDataContentDisposition( HttpHeaderReader reader )
            throws ParseException {
        super( reader );
    }

    @Override
    protected StringBuilder toStringBuffer() {
        StringBuilder sb = new StringBuilder();
        sb.append( getType() );
        addStringParameter( sb, "name", getName() );
        addStringParameter( sb, "filename", getFileName() );
        addDateParameter( sb, "creation-date", getCreationDate() );
        addDateParameter( sb, "modification-date", getModificationDate() );
        addDateParameter( sb, "read-date", getReadDate() );
        addLongParameter( sb, "size", getSize() );
        return sb;
    }
}
