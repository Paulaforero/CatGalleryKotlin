package com.example.aplicacionesmovilesproyecto

class Cat {
    var url: String = ""
    var likes: Int = 0
    var avatarUrl: String = ""
    var userName: String = ""
}

val catList = listOf(
    Cat().apply {
        url = "kira_image"
        likes = 120
        avatarUrl = "https://randomuser.me/api/portraits/men/1.jpg"
        userName = "cat_lover1"
    },
    Cat().apply {
        url = "milo_image"
        likes = 98
        avatarUrl = "https://randomuser.me/api/portraits/women/2.jpg"
        userName = "kitty_fan"
    },
    Cat().apply {
        url = "pochita_image"
        likes = 210
        avatarUrl = "https://randomuser.me/api/portraits/men/3.jpg"
        userName = "meowster"
    }
)