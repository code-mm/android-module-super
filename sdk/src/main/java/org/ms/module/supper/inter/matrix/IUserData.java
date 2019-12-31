package org.ms.module.supper.inter.matrix;

public interface IUserData {

    /**
     * GET /_matrix/client/r0/account/3pid
     */
    void pid();
    /**
     * POST /_matrix/client/r0/account/3pid/bind
     */
    void bind();
    /**
     * POST /_matrix/client/r0/account/3pid/delete
     */
    void delete();
    /**
     * POST /_matrix/client/r0/account/3pid/unbind
     */
    void unbind();
    /**
     * 发布 / _matrix / client / r0 / account / deactivate
     */
    void deactivate();
    /**
     * POST /_matrix/client/r0/account/password
     */
    void password();
    /**
     * GET /_matrix/client/r0/account/whoami
     */

    void whoami();
    /**
     * GET /_matrix/client/r0/profile/{userId}
     */
    void profile();
    /**
     * GET /_matrix/client/r0/profile/{userId}/avatar_url
     */
    void avatar_url();

    /**
     *PUT /_matrix/client/r0/profile/{userId}/avatar_url
     */
    void avatar_urlPut();
    /**
     *GET /_matrix/client/r0/profile/{userId}/displayname
     */
    void displayname();
    /**
     *PUT /_matrix/client/r0/profile/{userId}/displayname
     */
    void displaynamePut();
    /**
     *POST /_matrix/client/r0/register
     */
    void register();
    /**
     *GET /_matrix/client/r0/register/available
     */
    void available();
    /**
     *GET /_matrix/client/r0/user/{userId}/account_data/{type}
     */
    void account_data();

    /**
     *    PUT /_matrix/client/r0/user/{userId}/account_data/{type}
     *     Set some account_data for the user.
     */
    void account_dataPut();
    /**
     *
     GET /_matrix/client/r0/user/{userId}/rooms/{roomId}/account_data/{type}
     Get some account_data for the user.
     */
    void account_dataGet();
    /**
     *    PUT /_matrix/client/r0/user/{userId}/rooms/{roomId}/account_data/{type}
     *     Set some account_data for the user.
     */
    void account_dataPut1();
    /**
     *    GET /_matrix/client/r0/user/{userId}/rooms/{roomId}/tags
     *     List the tags for a room.
     */
    void tags();

    /**
     *     DELETE /_matrix/client/r0/user/{userId}/rooms/{roomId}/tags/{tag}
     *     Remove a tag from the room.
     */
    void tagsDelete();
    /**
     *     PUT /_matrix/client/r0/user/{userId}/rooms/{roomId}/tags/{tag}
     *     Add a tag to a room.
     */
    void tagsPut();
    /**
     *
     POST /_matrix/client/r0/user_directory/search
     Searches the user directory.
     */
    void search();

}
