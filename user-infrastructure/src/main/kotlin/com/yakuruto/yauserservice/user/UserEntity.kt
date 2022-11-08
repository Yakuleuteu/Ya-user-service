package com.yakuruto.yauserservice.user

import com.yakuruto.yauserservice.user.type.Authority
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.DynamicInsert
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

@DynamicInsert
@Entity
@Table(name = "tbl_user")
class UserEntity (

    @Id
    @Column(columnDefinition = "BINARY(16)")
    val id: UUID,

    @Column(columnDefinition = "VARCHAR(64)", nullable = false, unique = true)
    val email: String,

    @Column(columnDefinition = "VARCHAR(60)", nullable = false)
    val password: String,

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    val accountId: String,

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    val companyName: String,

    @ColumnDefault("'0'") //TODO 기본 이미지 넣기
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    val profileImageUrl: String,

    @Column(columnDefinition = "VARCHAR(2000)")
    val companyInformation: String,

    @Column(columnDefinition = "VARCHAR(64)", nullable = false, unique = true)
    val managerEmail: String,

    @Column(columnDefinition = "VARCHAR(10)", nullable = false)
    val managerName: String,

    @Column(columnDefinition = "CHAR(11)", nullable = false, unique = true)
    val companyPhoneNumber: String,

    @Column(columnDefinition = "VARCHAR(94)", nullable = false)
    val address: String,

    authority: Authority,

    deviceToken: String,

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    val homePageUrl: String,

    exposedInFeed: Boolean,

    @Column(columnDefinition = "VARCHAR(10)", nullable = false)
    val businessRegistrationNumber: String
) {

    @field:NotNull
    @ColumnDefault("'ROLE_USER'")
    @field:Enumerated(EnumType.STRING)
    var authority = authority
        protected set

    @Column(columnDefinition = "VARCHAR(64)", nullable = false)
    var deviceToken = deviceToken
        protected set

    @field:NotNull
    @ColumnDefault("'1'")
    var exposedInFeed = exposedInFeed
        protected set
}
