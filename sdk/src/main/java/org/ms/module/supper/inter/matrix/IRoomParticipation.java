package org.ms.module.supper.inter.matrix;

import org.json.JSONObject;
import org.ms.module.supper.inter.common.ICallBack;

public interface IRoomParticipation {


    /**
     *     Room participationShow/HideList OperationsExpand Operations
     *     GET /_matrix/client/r0/events
     *     Listen on the event stream.
     */


    /**
     *            GET /_matrix/client/r0/events/{eventId}
     *     Get a single event by event ID.
     */



    /**
     *            GET /_matrix/client/r0/initialSync
     *     Get the user's current state.
     */


    /**
     *
     GET /_matrix/client/r0/rooms/{roomId}/context/{eventId}
     Get events and state around the specified event.
     */



    /**
     *    GET /_matrix/client/r0/rooms/{roomId}/event/{eventId}
     *     Get a single event by event ID.
     */



    /**
     *            GET /_matrix/client/r0/rooms/{roomId}/initialSync
     *     Snapshot the current state of a room and its most recent messages.
     */



    /**
     *    GET /_matrix/client/r0/rooms/{roomId}/joined_members
     *     Gets the list of currently joined users and their profile data.
     */



    /**
     *            GET /_matrix/client/r0/rooms/{roomId}/members
     *     Get the m.room.member events for the room.
     */



    /**
     *    GET /_matrix/client/r0/rooms/{roomId}/messages
     *     Get a list of events for this room
     */



    /**
     *    POST /_matrix/client/r0/rooms/{roomId}/receipt/{receiptType}/{eventId}
     *     Send a receipt for the given event ID.
     */


    /**
     *     PUT /_matrix/client/r0/rooms/{roomId}/redact/{eventId}/{txnId}
     *     Strips all non-integrity-critical information out of an event.
     */

    /**
     *     PUT /_matrix/client/r0/rooms/{roomId}/send/{eventType}/{txnId}
     *     Send a message event to the given room.
     */

    /**
     *
     GET /_matrix/client/r0/rooms/{roomId}/state
     Get all state events in the current state of a room.
     */

    /**
     *            GET /_matrix/client/r0/rooms/{roomId}/state/{eventType}/{stateKey}
     *     Get the state identified by the type and key.
     */

    /**
     *            PUT /_matrix/client/r0/rooms/{roomId}/state/{eventType}/{stateKey}
     *     Send a state event to the given room.
     */

    /**
     *    PUT /_matrix/client/r0/rooms/{roomId}/typing/{userId}
     *     Informs the server that the user has started or stopped typing.
     */

    /**
     *
     GET /_matrix/client/r0/sync
     Synchronise the client's state and receive new messages.
     */

    void  sync(JSONObject jsonObject,ICallBack callBack);


    /**
     *    POST /_matrix/client/r0/user/{userId}/filter
     *     Upload a new filter.
     */

    void userIdByFilter(JSONObject jsonObject,ICallBack callBack);

    /**
     *     GET /_matrix/client/r0/user/{userId}/filter/{filterId}
     *     Download a filter
     */

    void userIdAndFilterByFilter(JSONObject jsonObject,ICallBack callBack);

}