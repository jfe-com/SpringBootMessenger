package org.jfe.messenger

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {
    @GetMapping("/")
    fun index(): String = "Hello world!!!"
}