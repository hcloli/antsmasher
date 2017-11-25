package com.tikal.antsmasher.antspublisher.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Preconditions;

import javax.annotation.concurrent.Immutable;

@Immutable
@JsonDeserialize
public class AntRequest {

    public final String gameId;

    @JsonCreator
    public AntRequest(String gameId) {
        this.gameId = Preconditions.checkNotNull(gameId, "gameId");;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AntRequest that = (AntRequest) o;

        return gameId != null ? gameId.equals(that.gameId) : that.gameId == null;
    }

    @Override
    public int hashCode() {
        return gameId != null ? gameId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AntRequest{" +
                ", gameId='" + gameId + '\'' +
                '}';
    }
}
