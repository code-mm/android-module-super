package org.ms.module.supper.inter.matrix;

public interface IMedia {


    /**
     *     MediaShow/HideList OperationsExpand Operations
     *     GET /_matrix/media/r0/config
     *     Get the configuration for the content repository.
     */

    /**
     *            GET /_matrix/media/r0/download/{serverName}/{mediaId}
     *     Download content from the content repository.
     */


    /**
     *    GET /_matrix/media/r0/download/{serverName}/{mediaId}/{fileName}
     *     Download content from the content repository. This is the same as the download endpoint above, except permitting a desired file name.
     */



    /**
     *    GET /_matrix/media/r0/thumbnail/{serverName}/{mediaId}
     *     Download a thumbnail of content from the content repository. See the thumbnailing &lt;#thumbnails&gt;_ section for more information.
     */



    /**
     *    POST /_matrix/media/r0/upload
     *     Upload some content to the content repository.
     */

}
