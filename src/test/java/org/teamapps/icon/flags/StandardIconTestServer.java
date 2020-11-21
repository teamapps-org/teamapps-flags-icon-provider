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
