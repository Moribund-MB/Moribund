package com.github.moribund.objects.playable;

import com.esotericsoftware.kryonet.Connection;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code Player} that represents somebody being controlled by the client
 * of its respective {@link Connection}.
 */
public final class Player implements PlayableCharacter {

    @Getter
    private final int gameId;
    /**
     * The unique player ID based on the {@link com.esotericsoftware.kryonet.Connection} of
     * the client to the server.
     */
    @Getter
    private final int playerId;
    @Getter @Setter
    private float x;
    @Getter @Setter
    private float y;
    @Getter @Setter
    private float rotation;
    /**
     * The connection of the server between the client.
     */
    @Getter @Setter
    private Connection connection;

    /**
     * Makes a {@code Player} with its unique player ID and provides the spawn
     * tile the {@code Player} starts at.
     * @param playerId The unique player ID.
     */
    public Player(int gameId, int playerId, float startingX, float startingY) {
        this.gameId = gameId;
        this.playerId = playerId;
        x = startingX;
        y = startingY;
    }
}