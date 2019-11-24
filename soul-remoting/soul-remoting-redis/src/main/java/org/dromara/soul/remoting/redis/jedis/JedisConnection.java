/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.dromara.soul.remoting.redis.jedis;

import org.dromara.soul.remoting.redis.RedisConnection;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Set;

/**
 * JedisConnection .
 *
 * @author sixh
 */
public abstract class JedisConnection extends RedisConnection {

    private JedisPoolConfig poolConfig;

    private Set<HostAndPort> hosts;

    public JedisConnection(JedisPoolConfig poolConfig, Set<HostAndPort> hostAndPorts) {
        this.poolConfig = poolConfig;
        this.hosts = hostAndPorts;
    }

    public JedisPoolConfig getPoolConfig() {
        return poolConfig;
    }

    public Set<HostAndPort> getHosts() {
        return hosts;
    }

}
