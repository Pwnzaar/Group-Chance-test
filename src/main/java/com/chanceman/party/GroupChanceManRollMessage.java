package com.chanceman.party;

import net.runelite.client.party.messages.PartyMemberMessage;

/**
 * Broadcast when a group member obtains a new item and triggers a roll.
 * Used to synchronise the roll animation + unlock result between online party members.
 */
public class GroupChanceManRollMessage extends PartyMemberMessage
{
    private String eventId;
    private long createdAt;
    private int obtainedItemId;
    private int rolledItemId;
    private boolean manual;

    // Required public no-arg ctor for Gson
    public GroupChanceManRollMessage() {}

    public GroupChanceManRollMessage(String eventId, long createdAt, int obtainedItemId, int rolledItemId, boolean manual)
    {
        this.eventId = eventId;
        this.createdAt = createdAt;
        this.obtainedItemId = obtainedItemId;
        this.rolledItemId = rolledItemId;
        this.manual = manual;
    }

    public String getEventId() { return eventId; }
    public long getCreatedAt() { return createdAt; }
    public int getObtainedItemId() { return obtainedItemId; }
    public int getRolledItemId() { return rolledItemId; }
    public boolean isManual() { return manual; }
}
