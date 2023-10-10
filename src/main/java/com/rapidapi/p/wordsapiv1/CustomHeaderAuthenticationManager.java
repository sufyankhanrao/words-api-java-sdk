/*
 * WordsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.rapidapi.p.wordsapiv1;

import io.apimatic.core.authentication.HeaderAuth;
import java.util.HashMap;

public class CustomHeaderAuthenticationManager extends HeaderAuth implements CustomHeaderAuthenticationCredentials {

    private String xRapidAPIKey;

    /**
     * Constructor that sets custom header parameters.
     */
    public CustomHeaderAuthenticationManager(String xRapidAPIKey) {
        super(new HashMap<String,String>() {
            private static final long serialVersionUID = 1L;
            {
                put("X-RapidAPI-Key", xRapidAPIKey);
            }
        });

        this.xRapidAPIKey = xRapidAPIKey;
    }

    /**
     * String value for xRapidAPIKey.
     * @return xRapidAPIKey
     */
    public String getXRapidAPIKey() {
        return xRapidAPIKey;
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param xRapidAPIKey String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String xRapidAPIKey) {
        return xRapidAPIKey.equals(getXRapidAPIKey());
    }

    /**
     * Converts this CustomHeaderAuthenticationManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomHeaderAuthenticationManager [" + "xRapidAPIKey=" + xRapidAPIKey + "]";
    }

}
