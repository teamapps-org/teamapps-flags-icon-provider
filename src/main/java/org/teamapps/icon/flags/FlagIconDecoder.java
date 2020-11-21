package org.teamapps.icon.flags;

import org.teamapps.icons.IconDecoderContext;
import org.teamapps.icons.spi.IconDecoder;

public class FlagIconDecoder implements IconDecoder<FlagIcon> {
	@Override
	public FlagIcon decodeIcon(String s, IconDecoderContext iconDecoderContext) {
		return FlagIcon.getByNameOrNull(s);
	}
}
