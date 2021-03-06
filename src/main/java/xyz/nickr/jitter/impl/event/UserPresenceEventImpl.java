package xyz.nickr.jitter.impl.event;

import org.json.JSONObject;

import xyz.nickr.jitter.Jitter;
import xyz.nickr.jitter.api.Room;
import xyz.nickr.jitter.api.event.UserPresenceEvent;

public class UserPresenceEventImpl implements UserPresenceEvent {

    private final Jitter jitter;
    private final JSONObject json;
    private final Room room;
    private final String userId;
    private final boolean incoming;

    public UserPresenceEventImpl(Jitter jitter, Room room, JSONObject object) {
        this.jitter = jitter;
        this.json = object;
        this.room = room;
        this.userId = object.getJSONObject("data").getString("userId");
        this.incoming = object.getJSONObject("data").getString("status").equals("in");
    }

    @Override
    public Jitter getJitter() {
        return jitter;
    }

    @Override
    public JSONObject asJSON() {
        return json;
    }

    @Override
    public Room getRoom() {
        return room;
    }

    @Override
    public String getUserID() {
        return userId;
    }

    @Override
    public boolean isIncoming() {
        return incoming;
    }

}
