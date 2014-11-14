/**
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.remote.common.rest;

import java.io.IOException;

public class KieRemoteHttpRequestException extends RuntimeException {

    /** generated serial version UID */
    private static final long serialVersionUID = 8703710246151287879L;

    /**
     * Create a new {@link KieRemoteHttpRequestException} with the given cause
     *
     * @param msg
     * @param cause
     */
    public KieRemoteHttpRequestException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

    /**
     * Create a new {@link KieRemoteHttpRequestException} with the given cause
     *
     * @param msg
     */
    public KieRemoteHttpRequestException(final String msg) {
        super(msg);
    }
    
    /**
     * Get {@link IOException} that triggered this request exception
     *
     * @return {@link IOException} cause
     */
    @Override
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
