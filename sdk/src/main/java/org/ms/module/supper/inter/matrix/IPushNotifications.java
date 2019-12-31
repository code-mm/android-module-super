package org.ms.module.supper.inter.matrix;

public interface IPushNotifications {


    /**
     *     Push notificationsShow/HideList OperationsExpand Operations
     *     GET /_matrix/client/r0/notifications
     *     Gets a list of events that the user has been notified about
     */

    /**
     *    GET /_matrix/client/r0/pushers
     *     Gets the current pushers for the authenticated user
     */


    /**
     *    POST /_matrix/client/r0/pushers/set
     *     Modify a pusher for this user on the homeserver.
     */


    /**
     *    GET /_matrix/client/r0/pushrules/
     *     Retrieve all push rulesets.
     */



    /**
     *    DELETE /_matrix/client/r0/pushrules/{scope}/{kind}/{ruleId}
     *     Delete a push rule.
     */




    /**
     *    GET /_matrix/client/r0/pushrules/{scope}/{kind}/{ruleId}
     *     Retrieve a push rule.
     */


    /**
     *    PUT /_matrix/client/r0/pushrules/{scope}/{kind}/{ruleId}
     *     Add or change a push rule.
     */


    /**
     *    PUT /_matrix/client/r0/pushrules/{scope}/{kind}/{ruleId}/actions
     *     Set the actions for a push rule.
     */


    /**
     *            PUT /_matrix/client/r0/pushrules/{scope}/{kind}/{ruleId}/enabled
     *     Enable or disable a push rule
     */


}
