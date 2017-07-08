<#include "../style.ftl">

<ul class="nav nav-pills nav-stacked">
    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Actions<span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li><a target="_blank" href="doc_object/${docObject.rcode}/download">Download</a></li>
            <li><a target="_blank" href="doc_object/${docObject.rcode}/download-comp">Download as Zip</a></li>
            <!-- <li><a target="_blank" href="doc_object/${docObject.rcode}/download">Download text version</a></li> -->
            <li><a target="_blank" href="doc_object/${docObject.rcode}/send">Email</a></li>
            </ul>
        </li>
    </ul>