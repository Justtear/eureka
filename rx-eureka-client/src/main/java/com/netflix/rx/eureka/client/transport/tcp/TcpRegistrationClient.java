/*
 * Copyright 2014 Netflix, Inc.
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

package com.netflix.rx.eureka.client.transport.tcp;

import com.netflix.rx.eureka.client.resolver.ServerResolver;
import com.netflix.rx.eureka.client.transport.ResolverBasedTransportClient;
import com.netflix.rx.eureka.client.transport.TransportClient;
import com.netflix.rx.eureka.transport.EurekaTransports;
import com.netflix.rx.eureka.transport.base.MessageConnectionMetrics;

/**
 * A {@link TransportClient} implementation for TCP based connections.
 *
 * @author Tomasz Bak
 */
public class TcpRegistrationClient extends ResolverBasedTransportClient {

    public TcpRegistrationClient(ServerResolver resolver, EurekaTransports.Codec codec, MessageConnectionMetrics metrics) {
        super(resolver, EurekaTransports.registrationPipeline(codec), metrics);
    }
}
