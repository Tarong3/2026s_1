package com.example.shop.member.dto;

// loginID, password, phoneNumber, address

import lombok.Getter;

@Getter
public class MemberCreateRequest {

    private String loginID;
    private String password;
    private String phoneNumber;
    private String address;

    public MemberCreateRequest(String loginID, String password, String phoneNumber, String address) {
        this.loginID = loginID;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}
