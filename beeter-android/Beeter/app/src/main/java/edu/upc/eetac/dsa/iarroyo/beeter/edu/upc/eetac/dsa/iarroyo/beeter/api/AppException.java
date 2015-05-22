package edu.upc.eetac.dsa.iarroyo.beeter.edu.upc.eetac.dsa.iarroyo.beeter.api;

/**
 * Created by nacho on 10/04/15.
 */
public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String detailMessage) {
        super(detailMessage);
    }
}