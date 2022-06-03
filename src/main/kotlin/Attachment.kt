data class Attachment (
    val attachments: Array<Attachable>
        )

interface Attachable {
    val type: String
}

data class VideoAttachment(
    val id: Int,
    val ownerId: Int,
    var title: String,
    val description: String,
    val duration: Int,
    val date: Int,
    val views: Int,
    val comments: Int,
    override val type: String = "video"
) : Attachable {

}

data class PhotoAttachment(
    val id: Int,
    val ownerId: Int,
    val photo130: String,
    val photo604: String,
    override val type: String = "photo"
) : Attachable {
}

data class DocumentAttachment (
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    override val type: String = "document"
        ) : Attachable {
}

data class AudioAttachment (
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    override val type: String = "audio"
        ) : Attachable {
}

class LinkAttachment(
    val url: String,
    val title: String,
    val description: String,
    override val type: String = "link"
) : Attachable {
}