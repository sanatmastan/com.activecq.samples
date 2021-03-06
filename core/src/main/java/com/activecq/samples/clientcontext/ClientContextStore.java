/*
 * Copyright 2012 david gonzalez.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.activecq.samples.clientcontext;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

import javax.jcr.RepositoryException;

public interface ClientContextStore {
    public static final String CONTEXT_STORE_ID = "contextstore.id";

    public static final String ANONYMOUS = ClientContextBuilder.ANONYMOUS;
    public static final String AUTHORIZABLE_ID = ClientContextBuilder.AUTHORIZABLE_ID;

    public String getContextStoreManagerName();

    public JSONObject getJSON(SlingHttpServletRequest request) throws JSONException, RepositoryException;

    public boolean handleAnonymous();

    public JSONObject getAnonymousJSON(SlingHttpServletRequest request) throws JSONException;
}