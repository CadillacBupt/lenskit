package org.grouplens.reflens.data.integer;

import org.grouplens.reflens.data.DataFactory;
import org.grouplens.reflens.data.Indexer;
import org.grouplens.reflens.data.RatingVector;

public class IntDataFactory implements DataFactory<Integer, Integer> {

	@Override
	public Indexer<Integer> makeItemIndexer() {
		return new IntIndexer();
	}

	@Override
	public RatingVector<Integer> makeItemRatingVector() {
		return new IntRatingVector();
	}

	@Override
	public Indexer<Integer> makeUserIndexer() {
		return new IntIndexer();
	}

}
