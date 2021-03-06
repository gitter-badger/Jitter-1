package xyz.nickr.jitter.api.event;

import org.json.JSONObject;

import xyz.nickr.jitter.api.Room;

/**
 * Represents an event of when a user leaves a room.
 *
 * @author Nick Robson
 */
public interface UserLeaveEvent extends JitterEvent {

    /**
     * Gets the underlying JSON object.
     *
     * @return The JSON.
     */
    JSONObject asJSON();

    /**
     * Gets the room that the user left.
     *
     * @return The room.
     */
    Room getRoom();

    /**
     * Gets the user ID of who left.
     *
     * @return The user ID.
     */
    String getUserID();

}
