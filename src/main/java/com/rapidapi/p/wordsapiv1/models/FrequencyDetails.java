/*
 * WordsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.rapidapi.p.wordsapiv1.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for FrequencyDetails type.
 */
public class FrequencyDetails {
    private double zipf;
    private double perMillion;
    private double diversity;

    /**
     * Default constructor.
     */
    public FrequencyDetails() {
    }

    /**
     * Initialization constructor.
     * @param  zipf  double value for zipf.
     * @param  perMillion  double value for perMillion.
     * @param  diversity  double value for diversity.
     */
    public FrequencyDetails(
            double zipf,
            double perMillion,
            double diversity) {
        this.zipf = zipf;
        this.perMillion = perMillion;
        this.diversity = diversity;
    }

    /**
     * Getter for Zipf.
     * Explains the zipf score.
     * @return Returns the double
     */
    @JsonGetter("zipf")
    public double getZipf() {
        return zipf;
    }

    /**
     * Setter for Zipf.
     * Explains the zipf score.
     * @param zipf Value for double
     */
    @JsonSetter("zipf")
    public void setZipf(double zipf) {
        this.zipf = zipf;
    }

    /**
     * Getter for PerMillion.
     * Explains the perMillion score.
     * @return Returns the double
     */
    @JsonGetter("perMillion")
    public double getPerMillion() {
        return perMillion;
    }

    /**
     * Setter for PerMillion.
     * Explains the perMillion score.
     * @param perMillion Value for double
     */
    @JsonSetter("perMillion")
    public void setPerMillion(double perMillion) {
        this.perMillion = perMillion;
    }

    /**
     * Getter for Diversity.
     * Explains the diversity score.
     * @return Returns the double
     */
    @JsonGetter("diversity")
    public double getDiversity() {
        return diversity;
    }

    /**
     * Setter for Diversity.
     * Explains the diversity score.
     * @param diversity Value for double
     */
    @JsonSetter("diversity")
    public void setDiversity(double diversity) {
        this.diversity = diversity;
    }

    /**
     * Converts this FrequencyDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FrequencyDetails [" + "zipf=" + zipf + ", perMillion=" + perMillion + ", diversity="
                + diversity + "]";
    }

    /**
     * Builds a new {@link FrequencyDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FrequencyDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(zipf, perMillion, diversity);
        return builder;
    }

    /**
     * Class to build instances of {@link FrequencyDetails}.
     */
    public static class Builder {
        private double zipf;
        private double perMillion;
        private double diversity;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  zipf  double value for zipf.
         * @param  perMillion  double value for perMillion.
         * @param  diversity  double value for diversity.
         */
        public Builder(double zipf, double perMillion, double diversity) {
            this.zipf = zipf;
            this.perMillion = perMillion;
            this.diversity = diversity;
        }

        /**
         * Setter for zipf.
         * @param  zipf  double value for zipf.
         * @return Builder
         */
        public Builder zipf(double zipf) {
            this.zipf = zipf;
            return this;
        }

        /**
         * Setter for perMillion.
         * @param  perMillion  double value for perMillion.
         * @return Builder
         */
        public Builder perMillion(double perMillion) {
            this.perMillion = perMillion;
            return this;
        }

        /**
         * Setter for diversity.
         * @param  diversity  double value for diversity.
         * @return Builder
         */
        public Builder diversity(double diversity) {
            this.diversity = diversity;
            return this;
        }

        /**
         * Builds a new {@link FrequencyDetails} object using the set fields.
         * @return {@link FrequencyDetails}
         */
        public FrequencyDetails build() {
            return new FrequencyDetails(zipf, perMillion, diversity);
        }
    }
}
