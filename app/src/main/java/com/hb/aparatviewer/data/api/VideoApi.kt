package com.hb.aparatviewer.data.api

import com.hb.aparatviewer.domain.model.VideoDetail
import com.hb.aparatviewer.domain.model.VideoSummary
import retrofit2.Response
import retrofit2.http.*

interface VideoApi {

    /**  video
     * videohash	string	اجباری	uid ویدیو مورد نظر
     *	https://www.aparat.com/etc/api/video/videohash/rzKus
     */
    @GET("video/videohash/{uid}")
    fun getVideo(
        @Path("uid") uid: String
    ): VideoDetail


    /**  categoryVideos
    perpage	int	اختیاری	تعداد ویدیوها در صفحه
    cat	int	اختیاری	آیدی طبقه بندی مورد نظر اگر پارامتری تعیین نکنید بطور پیشفرض همه ویدیوهای از طبقه بندی مختلف رو نشان میدهد
    https://www.aparat.com/etc/api/categoryVideos/cat/7/perpage/10
     * */
    @GET("video/videohash{options}")
    fun getCategoryVideos(
        @Path("options") options: ApiOptions<CategoryOption>,
    ): List<VideoSummary>

    /**  videoByUser
    ویدیو های یک کاربر
    نام پارامتر	نوع پارامتر	الزام پارامتر	توضیحات پارامتر
    username	string	اجباری	نام کاربری
    perpage	int	اختیاری	تعداد ویدیوها در صفحه
    https://www.aparat.com/etc/api/videoByUser/username/alooty/perpage/10
    خروجی این متد همان داده‌های لیست ویدیو است
     */
//    @GET("video/videohash{options}")
//    fun getVideoByUser(
//        username: String,
//        perPage: Int? = null
//    ): List<VideoSummary>
//
//    /**    commentByVideos
//    نظرات یک ویدیو
//    نام پارامتر	نوع پارامتر	الزام پارامتر	توضیحات پارامتر
//    videohash	string	اجباری	uid ویدیو مورد نظر
//    perpage	int	اختیاری	تعداد ویدیوها در صفحه
//    https://www.aparat.com/etc/api/commentByVideos/videohash/sGNgD/perpage/10
//    خروجی این متد همان داده‌های لیست کامنت ها است
//     */
//
//    /**    videoBySearch
//    جستجوی ویدیو
//    نام پارامتر	نوع پارامتر	الزام پارامتر	توضیحات پارامتر
//    text	string	اجباری	متن مورد جستجو باید بالای 3حرف و بصورت url_encode فرستاده شود
//    perpage	int	اختیاری	تعداد ویدیوها در صفحه
//    https://www.aparat.com/etc/api/videoBySearch/text/perspolis/perpage/10
//    خروجی این متد همان داده‌های لیست ویدیو است
//     */
//    fun getVideoBySearch(
//        text: String,
//        perPage: Int? = null
//    ): List<VideoSummary>
//
//    /**    videobytag
//    لیست ویدیوهای تگ مورد نظر
//    نام پارامتر	نوع پارامتر	الزام پارامتر	توضیحات پارامتر
//    text	string	اجباری	نام تگ
//    https://www.aparat.com/etc/api/videobytag/text/جشنوار*/
//    fun getVideoByTag(tag: String): List<VideoSummary>
}
