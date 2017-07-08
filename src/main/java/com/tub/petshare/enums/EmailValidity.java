package com.tub.petshare.enums;

/**
 *
 * @author Naveed
 */
public enum EmailValidity {

    new_one, //Never sent an email on adddress
    sent_success, //Successfully sent at least one email
    invalid, // Sending of email failed either of wrong address or any other reason like bounce backing etc
    valid, //User has read the email
    self_subscribed
}
