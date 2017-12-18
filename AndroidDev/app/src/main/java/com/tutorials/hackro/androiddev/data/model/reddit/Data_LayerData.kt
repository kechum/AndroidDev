package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data_LayerData {

    @SerializedName("domain")
    @Expose
    var domain: String? = null
    @SerializedName("approved_at_utc")
    @Expose
    var approvedAtUtc: Any? = null
    @SerializedName("banned_by")
    @Expose
    var bannedBy: Any? = null
    @SerializedName("media_embed")
    @Expose
    var mediaEmbed: MediaEmbedLayerData? = null
    @SerializedName("thumbnail_width")
    @Expose
    var thumbnailWidth: Int = 0
    @SerializedName("subreddit")
    @Expose
    var subreddit: String? = null
    @SerializedName("selftext_html")
    @Expose
    var selftextHtml: Any? = null
    @SerializedName("selftext")
    @Expose
    var selftext: String? = null
    @SerializedName("likes")
    @Expose
    var likes: Any? = null
    @SerializedName("suggested_sort")
    @Expose
    var suggestedSort: Any? = null
    @SerializedName("user_reports")
    @Expose
    var userReports: List<Any>? = null
    @SerializedName("secure_media")
    @Expose
    var secureMedia: SecureMediaLayerData? = null
    @SerializedName("is_reddit_media_domain")
    @Expose
    var isRedditMediaDomain: Boolean = false
    @SerializedName("link_flair_text")
    @Expose
    var linkFlairText: Any? = null
    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("banned_at_utc")
    @Expose
    var bannedAtUtc: Any? = null
    @SerializedName("view_count")
    @Expose
    var viewCount: Any? = null
    @SerializedName("archived")
    @Expose
    var isArchived: Boolean = false
    @SerializedName("clicked")
    @Expose
    var isClicked: Boolean = false
    @SerializedName("report_reasons")
    @Expose
    var reportReasons: Any? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("num_crossposts")
    @Expose
    var numCrossposts: Int = 0
    @SerializedName("saved")
    @Expose
    var isSaved: Boolean = false
    @SerializedName("mod_reports")
    @Expose
    var modReports: List<Any>? = null
    @SerializedName("can_mod_post")
    @Expose
    var isCanModPost: Boolean = false
    @SerializedName("is_crosspostable")
    @Expose
    var isCrosspostable: Boolean = false
    @SerializedName("pinned")
    @Expose
    var isPinned: Boolean = false
    @SerializedName("score")
    @Expose
    var score: Int = 0
    @SerializedName("approved_by")
    @Expose
    var approvedBy: Any? = null
    @SerializedName("over_18")
    @Expose
    var isOver18: Boolean = false
    @SerializedName("hidden")
    @Expose
    var isHidden: Boolean = false
    @SerializedName("preview")
    @Expose
    var preview: PreviewLayerData? = null
    @SerializedName("thumbnail")
    @Expose
    var thumbnail: String? = null
    @SerializedName("subreddit_id")
    @Expose
    var subredditId: String? = null
    @SerializedName("edited")
    @Expose
    var isEdited: String? = null
    @SerializedName("link_flair_css_class")
    @Expose
    var linkFlairCssClass: Any? = null
    @SerializedName("author_flair_css_class")
    @Expose
    var authorFlairCssClass: Any? = null
    @SerializedName("contest_mode")
    @Expose
    var isContestMode: Boolean = false
    @SerializedName("gilded")
    @Expose
    var gilded: Int = 0
    @SerializedName("downs")
    @Expose
    var downs: Int = 0
    @SerializedName("brand_safe")
    @Expose
    var isBrandSafe: Boolean = false
    @SerializedName("secure_media_embed")
    @Expose
    var secureMediaEmbed: SecureMediaEmbedLayerData? = null
    @SerializedName("removal_reason")
    @Expose
    var removalReason: Any? = null
    @SerializedName("post_hint")
    @Expose
    var postHint: String? = null
    @SerializedName("author_flair_text")
    @Expose
    var authorFlairText: Any? = null
    @SerializedName("stickied")
    @Expose
    var isStickied: Boolean = false
    @SerializedName("can_gild")
    @Expose
    var isCanGild: Boolean = false
    @SerializedName("thumbnail_height")
    @Expose
    var thumbnailHeight: Int = 0
    @SerializedName("parent_whitelist_status")
    @Expose
    var parentWhitelistStatus: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("spoiler")
    @Expose
    var isSpoiler: Boolean = false
    @SerializedName("permalink")
    @Expose
    var permalink: String? = null
    @SerializedName("subreddit_type")
    @Expose
    var subredditType: String? = null
    @SerializedName("locked")
    @Expose
    var isLocked: Boolean = false
    @SerializedName("hide_score")
    @Expose
    var isHideScore: Boolean = false
    @SerializedName("created")
    @Expose
    var created: Double = 0.toDouble()
    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("whitelist_status")
    @Expose
    var whitelistStatus: String? = null
    @SerializedName("quarantine")
    @Expose
    var isQuarantine: Boolean = false
    @SerializedName("author")
    @Expose
    var author: String? = null
    @SerializedName("created_utc")
    @Expose
    var createdUtc: Double = 0.toDouble()
    @SerializedName("subreddit_name_prefixed")
    @Expose
    var subredditNamePrefixed: String? = null
    @SerializedName("ups")
    @Expose
    var ups: Int = 0
    @SerializedName("media")
    @Expose
    var media: MediaLayerData? = null
    @SerializedName("num_comments")
    @Expose
    var numComments: Int = 0
    @SerializedName("is_self")
    @Expose
    var isSelf: Boolean = false
    @SerializedName("visited")
    @Expose
    var isVisited: Boolean = false
    @SerializedName("num_reports")
    @Expose
    var numReports: Any? = null
    @SerializedName("is_video")
    @Expose
    var isVideo: Boolean = false
    @SerializedName("distinguished")
    @Expose
    var distinguished: Any? = null
}
