/*
 * Copyright 2007 by Kappich Systemberatung Aachen 
 * 
 * This file is part of de.bsvrz.puk.config.
 * 
 * de.bsvrz.puk.config is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * de.bsvrz.puk.config is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with de.bsvrz.puk.config; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package de.bsvrz.puk.config.main.consistencycheck;

/**
 * Stellt die verschiedenen Arten von Aktivierungen dar.
 *
 * @author Kappich Systemberatung
 * @version $Revision:5077 $
 */
public enum KindOfConsistencyCheck {

	LOCAL_ACTIVATION("lokale Aktivierung", (byte)0),
	RELEASE_FOR_TRANSFER("Freigabe zur �bernahme", (byte)1),
	RELEASE_FOR_ACTIVATION("Freigabe zur Aktivierung", (byte)2),
	CONSISTENCY_CHECK("Konsistenzpr�fung", (byte)3),
	RELEASE_FOR_ACTIVATION_WITHOUT_LOCAL_ACTIVATION("Freigabe zur Aktivierung ohne lokale Aktivierung", (byte)4);

	private final String _name;

	private final byte _code;

	private KindOfConsistencyCheck(final String name, final byte code) {
		_name = name;
		_code = code;
	}

	public String toString() {
		final StringBuilder text = new StringBuilder();
		text.append(KindOfConsistencyCheck.class.getSimpleName()).append(": ").append(getName()).append(" Code: ").append(getCode());
		return text.toString();
	}

	public String getName() {
		return _name;
	}

	public byte getCode() {
		return _code;
	}
}
