package dto

import java.util.*
import dto.PostTypes.POSTVIDEO
import dto.Post
import dto.PostTypes

data class PostVideo(
    override val id: Long,
    override val author: String,
    override val avatarurl: String,
    override val content: String,
    override var created: Date,
    val url: String,
    override var likes: Int = 0,
    override var comments: Int = 0,
    override var shares: Int = 0,
    override var likedByMe: Boolean = false,
    override var commentedByMe: Boolean = false,
    override var sharedByMe: Boolean = false
) : Post {
    override val postType: PostTypes = POSTVIDEO
}