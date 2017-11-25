package com.tikal.antsmasher.antspublisher.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.annotation.concurrent.Immutable;

@Immutable
@JsonDeserialize
public class AntResponse {

    public final String antId;

    public final String antType;

    @JsonCreator
    public AntResponse(String antId, String antType) {
        this.antId = antId;
        this.antType = antType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AntResponse that = (AntResponse) o;

        if (antId != null ? !antId.equals(that.antId) : that.antId != null) return false;
        return antType != null ? antType.equals(that.antType) : that.antType == null;
    }

    @Override
    public int hashCode() {
        int result = antId != null ? antId.hashCode() : 0;
        result = 31 * result + (antType != null ? antType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AntResponse{" +
                "antId='" + antId + '\'' +
                ", antType='" + antType + '\'' +
                '}';
    }
}
