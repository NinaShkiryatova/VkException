class Attachment (
    var attachments: Array<Attachable>
        )

interface Attachable {
    val type: String
}

class VideoAttachment(
    val id: Int,
    val ownerId: Int,
    var title: String,
    var description: String,
    var duration: Int,
    var date: Int,
    var views: Int,
    var comments: Int,
    private val type_param: String = "video"
) : Attachable {
    override val type = type_param
}

class PhotoAttachment(
    val id: Int,
    val ownerId: Int,
    val photo130: String,
    val photo604: String,
    private val type_param: String = "photo"
) : Attachable {
    override val type = type_param
}

class DocumentAttachment (
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    private val type_param: String = "document"
        ) : Attachable {
    override val type = type_param
}

class AudioAttachment (
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    private val type_param: String = "audio"
        ) : Attachable {
    override val type = type_param
}

class LinkAttachment(
    val url: String,
    val title: String,
    val description: String,
    private val type_param: String = "link"
) : Attachable {
    override val type = type_param
}