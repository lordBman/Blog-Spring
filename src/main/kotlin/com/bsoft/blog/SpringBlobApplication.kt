package com.bsoft.blog

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBlobApplication

fun main(args: Array<String>) {
	runApplication<SpringBlobApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
