/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.geektimes.enterprise.inject.standard.event;

import org.geektimes.enterprise.inject.standard.beans.StandardBeanManager;

import javax.enterprise.inject.spi.AnnotatedMember;
import javax.enterprise.inject.spi.ProcessProducer;
import javax.enterprise.inject.spi.Producer;
import javax.enterprise.inject.spi.configurator.ProducerConfigurator;

/**
 * {@link ProcessProducer} Event for Producer method or field is fired by container.
 *
 * @param <T> The bean class of the bean that declares the producer method or field
 * @param <X> The return type of the producer method or the type of the producer field
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
public class ProcessProducerEvent<T, X> implements ProcessProducer<T, X> {

    private final StandardBeanManager standardBeanManager;

    public ProcessProducerEvent(StandardBeanManager standardBeanManager) {
        this.standardBeanManager = standardBeanManager;
    }

    @Override
    public AnnotatedMember<T> getAnnotatedMember() {
        return null;
    }

    @Override
    public Producer<X> getProducer() {
        return null;
    }

    @Override
    public void setProducer(Producer<X> producer) {

    }

    @Override
    public ProducerConfigurator<X> configureProducer() {
        return null;
    }

    @Override
    public void addDefinitionError(Throwable t) {

    }
}
