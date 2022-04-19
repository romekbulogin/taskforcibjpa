package com.cib.taskforcibjpa.repositories

import com.cib.taskforcibjpa.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository : JpaRepository<User,Long>