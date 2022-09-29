package com.hb.aparatviewer.data.api

import com.hb.aparatviewer.data.api.response.AparatCategoryListResponse
import com.hb.aparatviewer.data.api.response.AparatSearchListResponse
import com.hb.aparatviewer.data.api.response.AparatVideoResponse
import retrofit2.Response
import retrofit2.http.*

interface VideoApi {

    /**  video
     * videohash	string	اجباری	uid ویدیو مورد نظر
     *	https://www.aparat.com/etc/api/video/videohash/rzKus
     */
    @GET("api/video/videohash/{uid}")
    suspend fun getVideo(
        @Path("uid") uid: String
    ): Response<AparatVideoResponse>


    /**  categoryVideos
    perpage	int	اختیاری	تعداد ویدیوها در صفحه
    cat	int	اختیاری	آیدی طبقه بندی مورد نظر اگر پارامتری تعیین نکنید بطور پیشفرض همه ویدیوهای از طبقه بندی مختلف رو نشان میدهد
    https://www.aparat.com/etc/api/categoryVideos/cat/7/perpage/10
     * */
    @GET("api/categoryVideos/perpage/{perpage}")
    suspend fun getCategoryVideos(
        @Path("perpage") perpage: Int,
    ): Response<AparatCategoryListResponse>
    
    @GET("api/categoryVideos/perpage/{perpage}/cat/{cat}")
    suspend fun getCategoryVideos(
        @Path("perpage") perpage: Int,
        @Path("cat") cat: String,
    ): Response<AparatCategoryListResponse>

    /**    videoBySearch
    جستجوی ویدیو
    نام پارامتر	نوع پارامتر	الزام پارامتر	توضیحات پارامتر
    text	string	اجباری	متن مورد جستجو باید بالای 3حرف و بصورت url_encode فرستاده شود
    perpage	int	اختیاری	تعداد ویدیوها در صفحه
    https://www.aparat.com/etc/api/videoBySearch/text/perspolis/perpage/10
    https://www.aparat.com/etc/api/videoBySearch/prespolis/perpage/10
    خروجی این متد همان داده‌های لیست ویدیو است
     */
    @GET("api/videoBySearch/text/{text}/perpage/{perpage}")
    suspend fun getVideoBySearch(
        @Path("text") text: String,
        @Path("perpage") perpage: Int,
    ): Response<AparatSearchListResponse>
}
