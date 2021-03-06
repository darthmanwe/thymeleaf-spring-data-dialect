package org.thymeleaf.dialect.springdata;

import org.springframework.data.domain.Sort.Direction;

final class PaginationSortAttrProcessor extends PaginationSortBaseAttrProcessor {
    private static final String ATTR_NAME = "pagination-sort";
    public static final int PRECEDENCE = 1000;

    public PaginationSortAttrProcessor(final String dialectPrefix) {
        super(dialectPrefix, ATTR_NAME, PRECEDENCE);
    }
    
    protected Direction getForcedDirection() {
        return null;
    }
}
