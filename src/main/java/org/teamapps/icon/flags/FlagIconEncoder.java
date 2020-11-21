package org.teamapps.icon.flags;

import org.teamapps.icons.IconEncoderContext;
import org.teamapps.icons.spi.IconEncoder;

public class FlagIconEncoder implements IconEncoder<FlagIcon> {

	@Override
	public String encodeIcon(FlagIcon icon, IconEncoderContext iconEncoderContext) {
		return icon.getIconName();
	}

}
