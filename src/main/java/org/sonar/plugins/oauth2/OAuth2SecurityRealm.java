/*
 * Copyright 2015, Joseph "Deven" Phillips
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
package org.sonar.plugins.oauth2;

import lombok.extern.slf4j.Slf4j;
import org.sonar.api.security.Authenticator;
import org.sonar.api.security.ExternalUsersProvider;
import org.sonar.api.security.SecurityRealm;

/**
 *
 * @author <a href="">Deven Phillips</a>
 * @author <a href="https://github.com/alexlew">Alexandre Lewandowski</a>
 */
@Slf4j
public class OAuth2SecurityRealm extends SecurityRealm {
    
    public static final String KEY = "oauth2";

    @Override
    public Authenticator doGetAuthenticator() {
        LOG.info("doGetAuthenticator");
        return new OAuth2Authenticator();
    }

    @Override
    public ExternalUsersProvider getUsersProvider() {
        return new OAuth2UserProvider();
    }
    
    @Override
    public String getName() {
        return KEY;
    }
}
