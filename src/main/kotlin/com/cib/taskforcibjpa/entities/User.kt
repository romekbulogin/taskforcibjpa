package com.cib.taskforcibjpa.entities

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "firstname", nullable = false)
    var firstname: String? = null,

    @Column(name = "middlename", nullable = false)
    var middleName: String? = null,

    @Column(name = "lastname", nullable = false)
    var lastname: String? = null,

    @Column(name = "birthdate", nullable = false)
    var birthdate: String? = null
)

