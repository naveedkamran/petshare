<div style="text-align: center; width: 99%; font-size: 12px; color: #999999;">
    The email is not displayed properly?
    Click <a href="$application_url/web_content/$message.webContent.rcode/render">here</a>
    to see it online.
</div>

#<#include "/freemarker/header.ftl">

<p>
${message.details}
</p>

<div style="font-size: 12px; color: #999999; width: 99%; padding: 5px; border-top: 1px solid black;">
    You have received this email notification because you have either subscribed to it,
    or are involved in mailing list <span style="color: grey;">${message.rcollection.title}</span>.
    You are subscribed as <span style="color: grey;"><a href="mailto:${message.contact.email}">${message.contact.email}</a></span>.
    If you do not want to get such email in future, please
    <a href="$application_url_proxy/unsub.php?rcollection=${message.rcollection.rcode}&contact=${message.contact.rcode}" target="_blank">unsubscribe</a>.
</div>

<br/>

<img style="width: 1px; height: 1px;" src="$application_url_ip/message/$message.rcode/ser" alt="" />