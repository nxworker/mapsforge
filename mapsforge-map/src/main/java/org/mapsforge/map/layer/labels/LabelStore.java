/*
 * Copyright © 2014 Ludwig M Brinckmann
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.mapsforge.map.layer.labels;

import org.mapsforge.core.mapelements.MapElementContainer;
import org.mapsforge.core.model.Tile;

import java.util.List;
import java.util.Set;

/**
 * The LabelStore is an abstract store for labels from which it is possible to retrieve a priority-ordered
 * queue of items that are visible within a given bounding box for a zoom level.
 */
public interface LabelStore {
	/**
	 * Clears the data.
	 */
	abstract void clear();

	/**
	 * Returns a version number, which changes every time an update is made to the LabelStore.
	 * @return
	 */
	abstract int getVersion();

	/**
	 * Gets the items that are visible on a set of tiles.
	 * @param tiles the set of tiles to get the labels for
	 * @return a list of MapElements that are visible on the tiles
	 */
	abstract List<MapElementContainer> getVisibleItems(Set<Tile> tiles);
}
