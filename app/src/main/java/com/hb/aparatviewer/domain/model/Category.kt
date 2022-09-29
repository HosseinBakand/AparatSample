package com.hb.aparatviewer.domain.model

enum class Category(val id: Int,val title: String, val imgSrc: String) {

    All(
        id = 1,
        title = "همه",
        imgSrc = ""
    ),
    GAME(
        id = 22,
        title = "گیم",
        imgSrc = "\"https://www.aparat.com/public/public/images/etc/category/22.png?3\""
    ),
    HEALTH(
        id = 21,
        title = "سلامت",
        imgSrc = "\"https://www.aparat.com/public/public/images/etc/category/22.png?3\""
    ),
    WOMEN(
        id = 20,
        title = "بانوان",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/20.png?3"
    ),
    ANIMATED(
        id = 18,
        title = "کارتون",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/18.png?3"
    ),
    ART(
        id = 17,
        title = "هنری",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/17.png?3"
    ),
    ADS(
        id = 16,
        title = "تبلیغات",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/16.png?3"
    ),
    MISC(
        id = 15,
        title = "متفرقه",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/15.png?3"
    ),
    ANIMALS(
        id = 14,
        title = "حیوانات",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/14.png?3"
    ),
    NATURE(
        id = 13,
        title = "گردشگری",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/13.png?3"
    ),
    ACCIDENTS(
        id = 12,
        title = "حوادث",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/12.png?3"
    ),
    SPORT(
        id = 11,
        title = "ورزشی",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/11.png?3"
    ),
    TECH(
        id = 10,
        title = "علم و تکنولوژی",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/10.png?3"
    ),
    POLITICAL(
        id = 9,
        title = "سیاسی",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/9.png?3"
    ),
    NEWS(
        id = 8,
        title = "خبری",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/8.png?3"
    ),
    MUSIC(
        id = 7,
        title = "موسیقی",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/7.png?3"
    ),
    RELIGIOUS(
        id = 6,
        title = "مذهبی",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/6.png?3"
    ),
    FILM(
        id = 5,
        title = "فیلم",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/5.png?3"
    ),
    ENTERTAINMENT(
        id = 4,
        title = "تفریحی",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/4.png?3"
    ),
    EDUCATIONAL(
        id = 3,
        title = "آموزشی",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/3.png?3"
    ),
    FUNNY(
        id = 2,
        title = "طنز",
        imgSrc = "https://www.aparat.com/public/public/images/etc/category/2.png?3"
    ),
}