package com.nwt.framework.exception.database;

import com.nwt.framework.exception.BaseException;

/**
 * Exception to denote that the database fetch operation resulted in zero
 * results for the query. The explicit/possible reasons for this would be
 * rovided by the throwing class.
 *
 * @author Prabakar Singaram
 */
public class ZeroResultsException extends BaseException {
    private static final long serialVersionUID = -8366510943647697642L;


    public ZeroResultsException(String message) {
        super(message);
    }


    public ZeroResultsException(String message, Object errorCode) {
        super(message, errorCode);
    }
}
