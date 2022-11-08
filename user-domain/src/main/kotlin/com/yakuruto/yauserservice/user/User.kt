package com.yakuruto.yauserservice.user

import com.yakuruto.yauserservice.configuration.annotation.Aggregate
import com.yakuruto.yauserservice.user.type.Authority
import java.util.UUID

@Aggregate
class User(

    val id: UUID,

    val email: String,

    val password: String,

    val accountId: String,

    val companyName: String,

    val profileImageUrl: String,

    val companyInformation: String,

    val managerEmail: String,

    val managerName: String,

    val companyPhoneNumber: String,

    val address: String,

    authority: Authority,

    deviceToken: String,

    val homePageUrl: String,

    exposedInFeed: Boolean,

    val businessRegistrationNumber: String
) {

    var authority = authority
        private  set

    var deviceToken = deviceToken
        private set

    var exposedInFeed = exposedInFeed
        private set

}
