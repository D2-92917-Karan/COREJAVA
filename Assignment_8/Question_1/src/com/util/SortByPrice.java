package com.util;

import java.util.Comparator;

import com.domain.Book;

public class SortByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int diff=-Double.compare(o1.getPrice(),o2.getPrice());
		return diff;
	}

}
