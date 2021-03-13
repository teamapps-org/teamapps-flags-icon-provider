/*-
 * ========================LICENSE_START=================================
 * TeamApps Flags Icon Provider
 * ---
 * Copyright (C) 2014 - 2021 TeamApps.org
 * ---
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
 * =========================LICENSE_END==================================
 */
package org.teamapps.icon.flags;

import org.teamapps.server.jetty.embedded.TeamAppsJettyEmbeddedServer;

public class StandardIconTestServer {

	public static void main(String[] args) throws Exception {
		new TeamAppsJettyEmbeddedServer((sessionContext) -> {
			sessionContext.showNotification(FlagIcon.DE_GERMANY, "Germany", null, false, 0, false);
			sessionContext.showNotification(FlagIcon.GB_ENG, "Great Britain", null, false, 0, false);
		}, 8082).start();
	}

}
