@file:UseContextualSerialization(
    ResourceUp::class,
    PartialUser::class
)

package top.boticord.data.servers

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseContextualSerialization
import top.boticord.data.PremiumData
import top.boticord.data.ResourceRating
import top.boticord.data.ResourceStatus
import top.boticord.data.bots.ResourceUp
import top.boticord.data.users.PartialUser

@Serializable
data class ResourceServer(
    val id: String,
    val name: String,
    val shortDescription: String,
    val description: String,
    val avatar: String? = null,
    val shortLink: String? = null,
    val inviteLink: String? = null,
    val premium: PremiumData,
    val standardBannerID: Int,
    val owner: String? = null,
    val status: ResourceStatus,
    val ratings: List<ResourceRating> = emptyList(),
    val createdDate: String,
    val memberCount: Int? = null,
    val website: String? = null,
    val tags: List<ServerTags> = emptyList(),
    val moderators: List<PartialUser> = emptyList(),
    val upCount: Int,
    val ups: List<ResourceUp> = emptyList()
)
