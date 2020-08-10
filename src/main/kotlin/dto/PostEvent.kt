package dto

import Location
import java.util.*
import dto.PostTypes.POSTEVENT

data class PostEvent(
    override val id: Long,
    override val author: String,
    override val avatarurl: String,
    override val content: String,
    override var created: Date,
    val adress: String,
    val coord: Location = Location("0.0", "0.0"),
    override var likes: Int = 0,
    override var comments: Int = 0,
    override var shares: Int = 0,
    override var likedByMe: Boolean = false,
    override var commentedByMe: Boolean = false,
    override var sharedByMe: Boolean = false
) : Post {
    override val postType: PostTypes = POSTEVENT
}