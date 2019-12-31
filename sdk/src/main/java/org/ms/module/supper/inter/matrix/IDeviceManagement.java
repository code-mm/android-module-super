package org.ms.module.supper.inter.matrix;

public interface IDeviceManagement {


    /**
     *     Device managementShow/HideList OperationsExpand Operations
     *     POST /_matrix/client/r0/delete_devices
     *     Bulk deletion of devices
     */



    void delete_devices();


    /**
     *    GET /_matrix/client/r0/devices
     *     List registered devices for the current user
     */


    void devices();


    /**
     *    DELETE /_matrix/client/r0/devices/{deviceId}
     *     Delete a device
     */





    /**
     *    GET /_matrix/client/r0/devices/{deviceId}
     *     Get a single device
     */

    /**
     *    PUT /_matrix/client/r0/devices/{deviceId}
     *     Update a device
     */

}
