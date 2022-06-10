import java.util.Objects

data class Attachment(
    val attachments: Array<Attachments>
)

interface Attachable {}

abstract class Attachments(
    open val attachedObject: Attachable,
    open val type: String
) {
}

data class Video(
    val id: Int,
    val ownerId: Int,
    var title: String,
    val description: String,
    val duration: Int,
    val date: Int,
    val views: Int,
    val comments: Int
) : Attachable {
}

data class VideoAttachment(
    override val attachedObject: Video,
    override val type: String = "video"
) : Attachments(attachedObject, type) {
}

data class Photo(
    val id: Int,
    val ownerId: Int,
    val photo130: String,
    val photo604: String
) : Attachable {
}

data class PhotoAttachment(
    override val attachedObject: Photo,
    override val type: String = "photo"
) : Attachments(attachedObject, type) {
}

data class Document(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int
) : Attachable {
}

data class DocumentAttachment(
    override val attachedObject: Document,
    override val type: String = "document"
) : Attachments(attachedObject, type) {
}

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String
) : Attachable {
}

data class AudioAttachment(
    override val attachedObject: Audio,
    override val type: String = "audio"
) : Attachments(attachedObject, type) {
}

data class Link(
    val url: String,
    val title: String,
    val description: String
) : Attachable {
}

data class LinkAttachment(
    override val attachedObject: Link,
    override val type: String = "link"
) : Attachments(attachedObject, type) {
}