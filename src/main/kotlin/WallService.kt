class WallService {

    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = (if (posts.isEmpty()) 1 else (posts.last().id + 1)))
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, element) in posts.withIndex()) {
            if (element.id == post.id) {
                posts[index] = post.copy(ownerId = posts[index].ownerId, date = posts[index].ownerId)
                return true
            }

        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for(post in posts){
            if(post.id == postId){
                comments += comment
            }
        }
        return if (comments.contains(comment)) comment else throw PostNotFoundException()
    }
}