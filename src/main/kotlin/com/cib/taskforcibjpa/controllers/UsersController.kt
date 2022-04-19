package com.cib.taskforcibjpa.controllers

import com.cib.taskforcibjpa.entities.User
import com.cib.taskforcibjpa.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/api")
class UsersController(@Autowired val userService: UserService) {

    @GetMapping("/getuser")
    fun getUser(@RequestParam("id") id: Long): Optional<User> = userService.getUserById(id)

    @GetMapping("/getusers")
    fun getAllUser(): List<User> = userService.getAllUser()

    @PostMapping("/insert")
    fun newUser(
        @RequestParam("firstname") firstname: String,
        @RequestParam("middlename") middlename: String,
        @RequestParam("lastname") lastname: String,
        @RequestParam("birthdate") birthdate: String
    ) = userService.addUser(firstname, middlename, lastname, birthdate)

    @PostMapping("/delete")
    fun deleteUser(@RequestParam("id") id: Long) = userService.deleteUser(id)
}