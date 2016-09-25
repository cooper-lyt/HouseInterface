package cc.coopersoft.comm.exception;

import java.io.IOException;

/**
 * Created by cooper on 9/23/16.
 */
public class HttpApiServerException extends Exception {

    private int httpStatus;

    public HttpApiServerException(int httpStatus) {
        this.httpStatus = httpStatus;
    }


    public HttpApiServerException(Throwable cause) {
        super(cause);
        httpStatus = -1;
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}
