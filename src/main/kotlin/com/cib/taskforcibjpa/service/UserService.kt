package com.cib.taskforcibjpa.service

import com.cib.taskforcibjpa.entities.User
import com.cib.taskforcibjpa.repositories.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(@Autowired val usersRepos: UsersRepository) {
    fun getUserById(id: Long): Optional<User> = usersRepos.findById(id)

    fun getAllUser(): List<User> = usersRepos.findAll()

    fun addUser(firstname: String, middlename: String, lastname: String, birthdate: String) {
        usersRepos.saveAndFlush(
            User(
                firstname = firstname,
                middleName = middlename,
                lastname = lastname,
                birthdate = birthdate
            )
        )
    }

    fun deleteUser(id: Long) {
        usersRepos.deleteById(id)
    }
}