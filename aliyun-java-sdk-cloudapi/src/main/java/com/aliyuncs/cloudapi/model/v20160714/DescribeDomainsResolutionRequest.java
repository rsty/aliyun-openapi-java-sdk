/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainsResolutionRequest extends RpcAcsRequest<DescribeDomainsResolutionResponse> {
	
	public DescribeDomainsResolutionRequest() {
		super("CloudAPI", "2016-07-14", "DescribeDomainsResolution", "apigateway");
	}

	private String groupId;

	private String domainNames;

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		putQueryParameter("GroupId", groupId);
	}

	public String getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(String domainNames) {
		this.domainNames = domainNames;
		putQueryParameter("DomainNames", domainNames);
	}

	@Override
	public Class<DescribeDomainsResolutionResponse> getResponseClass() {
		return DescribeDomainsResolutionResponse.class;
	}

}
