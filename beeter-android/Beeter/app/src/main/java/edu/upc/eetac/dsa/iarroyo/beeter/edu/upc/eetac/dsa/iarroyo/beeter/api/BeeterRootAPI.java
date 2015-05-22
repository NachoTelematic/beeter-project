package edu.upc.eetac.dsa.iarroyo.beeter.edu.upc.eetac.dsa.iarroyo.beeter.api;

/**
 * Created by nacho on 10/04/15.
 */
import java.util.HashMap;
import java.util.Map;

public class BeeterRootAPI {

    private Map<String, Link> links;

    public BeeterRootAPI() {
        links = new HashMap<String, Link>();
    }

    public Map<String, Link> getLinks() {
        return links;
    }

}