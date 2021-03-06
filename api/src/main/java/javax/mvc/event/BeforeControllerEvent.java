/*
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2016-2018 JSR 371 expert group and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.mvc.event;

import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.UriInfo;

/**
 * <p>Event fired before a controller is called but after it has been matched.</p>
 *
 * <p>For example:
 * <pre><code>    public class EventObserver {
 *         public void beforeControllerEvent(&#64;Observes BeforeControllerEvent e) {
 *            ...
 *        }
 *    }</code></pre>
 *
 * @author Santiago Pericas-Geertsen
 * @see javax.enterprise.event.Observes
 * @since 1.0
 */
public interface BeforeControllerEvent extends MvcEvent {

    /**
     * Access to the current request URI information.
     *
     * @return URI info.
     * @see javax.ws.rs.core.UriInfo
     */
    UriInfo getUriInfo();

    /**
     * Access to the current request controller information.
     *
     * @return resources info.
     * @see javax.ws.rs.container.ResourceInfo
     */
    ResourceInfo getResourceInfo();
}
