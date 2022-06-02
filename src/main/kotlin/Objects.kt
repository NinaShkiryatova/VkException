class Likes(
    var count: UInt,
    var userLikes: Boolean,
    var canLike: Boolean,
    var canPublish: Boolean
) {
}

class Comments(
    var count: UInt,
    var canPost: Boolean,
    var groupsCanPost: Boolean,
    var canClose: Boolean,
    var canOpen: Boolean
) {
}

class Reposts(
    var count: UInt,
    var userReposted: Boolean
) {
}

class Views(
    var count: UInt
) {
}

class Geo (
    var type: String,
    var coordinates: String,
    var place: Object?
        ){
}

class PostSource (
    var type: String,
    var platform: String,
    var data: String,
    var url: String
        ){
}

class CopyHistory (
    var historyArray: Array<Post>
        )

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}