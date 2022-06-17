data class Comment (
    val id: Int,
    val fromIdv: Int,
    val date: Int,
    val text: String,
    val donut: Donut,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Attachments,
    val parentsStack: Array<Int>,
    val thread: CommentsThread
        ) {
}