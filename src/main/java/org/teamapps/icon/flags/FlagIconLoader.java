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
