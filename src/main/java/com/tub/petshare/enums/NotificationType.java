package com.tub.petshare.enums;

/**
 *
 * @author Naveed
 */
public enum NotificationType {

    app_domain, //Notify to App Domain
    user_group, // Notify to user role group
    user_groups, //Notify to all groups
    current_user_only, //Notify only to current user logged in
    no_notifications, //No notificaitons at all
    custom,
}
