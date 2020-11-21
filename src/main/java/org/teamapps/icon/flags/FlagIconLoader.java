package org.teamapps.icon.flags;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.teamapps.icons.IconLoaderContext;
import org.teamapps.icons.IconResource;
import org.teamapps.icons.IconType;
import org.teamapps.icons.spi.IconLoader;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;

public class FlagIconLoader implements IconLoader<FlagIcon> {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Override
	public IconResource loadIcon(FlagIcon icon, int size, IconLoaderContext iconLoaderContext) {
		try (InputStream inputStream = getClass().getResourceAsStream("/org/teamapps/icon/flags/" + icon.getIconName())) {
			if (inputStream == null) {
				return null;
			}
			return new IconResource(inputStream.readAllBytes(), IconType.SVG);
		} catch (IOException e) {
			LOGGER.error("Could not load icon " + icon.getIconName(), e);
			return null;
		}
	}
}
