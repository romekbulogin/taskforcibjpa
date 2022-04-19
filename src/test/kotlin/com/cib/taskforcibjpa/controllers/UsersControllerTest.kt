package com.cib.taskforcibjpa.controllers

import com.cib.taskforcibjpa.repositories.UsersRepository
import com.cib.taskforcibjpa.service.UserService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class UsersControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc;
    @Autowired
    private lateinit var usersController:UsersController
    @Autowired
    private lateinit var usersRepository: UsersRepository
    @Autowired
    private lateinit var userService: UserService


    @Test
    fun getUser() {

        //usersController.getUser(1)
    }

    @Test
    fun getAllUser() {
        usersController.getAllUser()
    }

    @Test
    fun newUser() {
        usersController.newUser("test","test","test","20-01-2000")
    }

    @Test
    fun deleteUser() {
    }

    @Test
    fun getUserService() {
    }
}