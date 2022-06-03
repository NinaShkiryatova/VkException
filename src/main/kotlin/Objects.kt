data class Likes(
    var count: UInt,
    var userLikes: Boolean,
    var canLike: Boolean,
    var canPublish: Boolean
) {
}

data class Comments(
    var count: UInt,
    var canPost: Boolean,
    var groupsCanPost: Boolean,
    var canClose: Boolean,
    var canOpen: Boolean
) {
}

data class Reposts(
    var count: UInt,
    var userReposted: Boolean
) {
}

data class Views(
    var count: UInt
) {
}

data class Geo (
    val type: String,
    val coordinates: String,
    val place_param: String?
        ){
    val place = "place is not defined" ?: place_param
}

data class PostSource (
    val type: String,
    val platform: String,
    val data: String,
    val url: String
        ){
}

data class CopyHistory (
    val historyArray: Array<Post>
        )

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}