package kr.ac.kumoh.s20200839.wspBackend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["https://wsp-frontend-soowan.netlify.app"])
class MessageController {
    @GetMapping
    fun getRoot() = mapOf(("status" to "root"))

    @GetMapping("/api/message")
    fun getMessage() = mapOf("status" to "success")
}