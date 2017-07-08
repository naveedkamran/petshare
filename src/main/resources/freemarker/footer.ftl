<!--<div style="height: 5px; clear: both;"></div>
Regards-->

<div style="height: 20px; clear: both;"></div>
${mail_disclaimer}

<div style="height: 5px; clear: both;"></div>
${mail_footer}

<#if message.messageTemplate.isTrackRead>
<img style="width: 1px; height: 1px;" src="${application_url}/message/${message.rcode}/ser" alt="" />
</#if>