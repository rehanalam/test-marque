/*
 * AazarKhanTelstraSMSAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.api.models;

import java.util.*;

public class SendSMSResponseBuilder {
    //the instance to build
    private SendSMSResponse sendSMSResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SendSMSResponseBuilder() {
        sendSMSResponse = new SendSMSResponse();
    }

    /**
     * The message id received when SMS is sent
     */
    public SendSMSResponseBuilder messageId(String messageId) {
        sendSMSResponse.setMessageId(messageId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendSMSResponse build() {
        return sendSMSResponse;
    }
}