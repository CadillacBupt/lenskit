/*
 * LensKit, an open source recommender systems toolkit.
 * Copyright 2010-2013 Regents of the University of Minnesota and contributors
 * Work on LensKit has been funded by the National Science Foundation under
 * grants IIS 05-34939, 08-08692, 08-12148, and 10-17697.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package org.grouplens.lenskit.knn.item;

import java.util.Collection;

import it.unimi.dsi.fastutil.longs.LongSet;

import org.grouplens.grapht.annotation.DefaultImplementation;
import org.grouplens.lenskit.GlobalItemScorer;
import org.grouplens.lenskit.knn.item.model.ItemItemModel;

/**
 * The  global scorer for the global recommendation backed by a item-item model.
 *
 * @author <a href="http://www.grouplens.org">GroupLens Research</a>
 */
@DefaultImplementation(ItemItemGlobalScorer.class)
public interface ItemItemModelBackedGlobalScorer extends GlobalItemScorer {
    /**
     * Get the item-item model backing this scorer.
     *
     * @return The model this scorer uses to compute scores.
     */
    ItemItemModel getModel();

    /**
     * Get the set of scoreable items for a basket of items.
     *
     * @param queryItems The basket of items to make recommendation.
     * @return The set of items for which scores can be generated.
     */
    LongSet getScoreableItems(Collection<Long> queryItems);
}
