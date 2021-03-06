/*
 * Copyright 2015, Alexandre Lewandowski
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
package org.sonar.plugins.oauth2.provider;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.sonar.api.config.Settings;

public interface OAuth2Provider {

  String getAuthzEndpoint();

  String getProviderName();

  String getTokenEndpoint();

  OAuthClientRequest.AuthenticationRequestBuilder createRedirectRequestBuilder(Settings settings);

  OAuthClientRequest.TokenRequestBuilder createTokenRequestBuilder(Settings settings, String code);

}
