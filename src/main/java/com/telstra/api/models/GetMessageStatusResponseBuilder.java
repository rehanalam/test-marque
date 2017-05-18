/*
 * AazarKhanTelstraSMSAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.api.models;

import java.util.*;

public class GetMessageStatusResponseBuilder {
    //the instance to build
    private GetMessageStatusResponse getMessageStatusResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetMessageStatusResponseBuilder() {
        getMessageStatusResponse = new GetMessageStatusResponse();
    }

    /**
     * Where the SMS is being sent
     */
    public GetMessageStatusResponseBuilder to(String to) {
        getMessageStatusResponse.setTo(to);
        return this;
    }

    /**
     * When the SMS was received
     */
    public GetMessageStatusResponseBuilder receivedTimestamp(String receivedTimestamp) {
        getMessageStatusResponse.setReceivedTimestamp(receivedTimestamp);
        return this;
    }

    /**
     * When the SMS was sent
     */
    public GetMessageStatusResponseBuilder sentTimestamp(String sentTimestamp) {
        getMessageStatusResponse.setSentTimestamp(sentTimestamp);
        return this;
    }

    /**
     * Shows the response status
     */
    public GetMessageStatusResponseBuilder status(String status) {
        getMessageStatusResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetMessageStatusResponse build() {
        return getMessageStatusResponse;
    }
}