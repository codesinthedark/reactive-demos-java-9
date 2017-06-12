/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.iproduct.demo.profiler.server.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.iproduct.demo.profiler.server.resources.MyResource;
import org.iproduct.demo.profiler.server.resources.ProcessesRestResource;
import org.iproduct.demo.profiler.server.resources.StatsRestResource;

@ApplicationPath("/api/*")
public class ProfilerApplication extends ResourceConfig {
//	@Inject private StatsRestResource statsRestService;
	// @Inject private StatsRestServiceRxJava2 statsRestService;
//	@Inject
//	private ProcessesRestResource processesRestService;
//	@Inject
//	private MyResource myResource;

	public ProfilerApplication() {
		register(MyResource.class);
		register(ProcessesRestResource.class);
		register(StatsRestResource.class);
	}

//	@Override
//	public Set<Class<?>>  getClasses() {
//		 final Set<Class<?>> classes = new HashSet<>();
//		// singletons.add(new SseFeature());
//		 classes.add(MyResource.class);
//		 classes.add(ProcessesRestResource.class);
//		// singletons.add(statsRestService);
////		singletons.add(processesRestService);
//		// singletons.add(new JacksonJsonProvider());
//		return classes;
//	}
}
