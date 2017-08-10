<!DOCTYPE html>
<html>
    <@layout.block name="head">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>INSPINIA | Dashboard</title>
        <link href="${request.contextPath}/assets/common/css/bootstrap.min.css" rel="stylesheet">
        <link href="${request.contextPath}/assets/manage/font-awesome/css/font-awesome.css" rel="stylesheet">
        <!-- Toastr style -->
        <link href="${request.contextPath}/assets/manage/css/plugins/toastr/toastr.min.css" rel="stylesheet">
        <!-- Gritter -->
        <link href="${request.contextPath}/assets/manage/js/plugins/gritter/jquery.gritter.css" rel="stylesheet">
        <link href="${request.contextPath}/assets/manage/css/animate.css" rel="stylesheet">
        <link href="${request.contextPath}/assets/manage/css/style.min.css" rel="stylesheet">
    </head>
    </@layout.block>
    <body>
        <div id="wrapper">
            <@layout.block name="nav">
                <nav class="navbar-default navbar-static-side" role="navigation">
                    <div class="sidebar-collapse">
                        <ul class="nav metismenu" id="side-menu">
                            <li class="nav-header">
                                <div class="dropdown profile-element"> <span>
                                    <img alt="image" class="img-circle" src="${request.contextPath}/assets/manage/img/profile_small.jpg" />
                                     </span>
                                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                    <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">David Williams</strong>
                                     </span> <span class="text-muted text-xs block">Art Director <b class="caret"></b></span> </span> </a>
                                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                        <li><a href="profile.html">Profile</a></li>
                                        <li><a href="contacts.html">Contacts</a></li>
                                        <li><a href="mailbox.html">Mailbox</a></li>
                                        <li class="divider"></li>
                                        <li><a href="login.html">Logout</a></li>
                                    </ul>
                                </div>
                                <div class="logo-element">
                                    IN+
                                </div>
                            </li>
                            <li class="active">
                                <a href="/manage"><i class="fa fa-th-large"></i> <span class="nav-label">首页</span></a>
                            </li>
                            <li>
                                <a href="layouts.html"><i class="fa fa-diamond"></i> <span class="nav-label">分类管理</span></a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o"></i> <span class="nav-label">文章管理</span><span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level collapse">
                                    <li><a href="graph_flot.html">Flot Charts</a></li>
                                    <li><a href="graph_morris.html">Morris.js Charts</a></li>
                                    <li><a href="graph_rickshaw.html">Rickshaw Charts</a></li>
                                    <li><a href="graph_chartjs.html">Chart.js</a></li>
                                    <li><a href="graph_chartist.html">Chartist</a></li>
                                    <li><a href="graph_peity.html">Peity Charts</a></li>
                                    <li><a href="graph_sparkline.html">Sparkline Charts</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="mailbox.html"><i class="fa fa-envelope"></i> <span class="nav-label">标签管理 </span></a>
                                <ul class="nav nav-second-level collapse">
                                    <li><a href="mailbox.html">Inbox</a></li>
                                    <li><a href="mail_detail.html">Email view</a></li>
                                    <li><a href="mail_compose.html">Compose email</a></li>
                                    <li><a href="email_template.html">Email templates</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="metrics.html"><i class="fa fa-pie-chart"></i> <span class="nav-label">用户管理</span></a>
                            </li>
                            <li>
                                <a href="widgets.html"><i class="fa fa-flask"></i> <span class="nav-label">留言管理</span></a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-edit"></i> <span class="nav-label">评论管理</span><span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level collapse">
                                    <li><a href="form_basic.html">Basic form</a></li>
                                    <li><a href="form_advanced.html">Advanced Plugins</a></li>
                                    <li><a href="form_wizard.html">Wizard</a></li>
                                    <li><a href="form_file_upload.html">File Upload</a></li>
                                    <li><a href="form_editors.html">Text Editor</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-desktop"></i> <span class="nav-label">访客管理</span></a>
                                <ul class="nav nav-second-level collapse">
                                    <li><a href="contacts.html">Contacts</a></li>
                                    <li><a href="profile.html">Profile</a></li>
                                    <li><a href="projects.html">Projects</a></li>
                                    <li><a href="project_detail.html">Project detail</a></li>
                                    <li><a href="teams_board.html">Teams board</a></li>
                                    <li><a href="social_feed.html">Social feed</a></li>
                                    <li><a href="clients.html">Clients</a></li>
                                    <li><a href="full_height.html">Outlook view</a></li>
                                    <li><a href="file_manager.html">File manager</a></li>
                                    <li><a href="calendar.html">Calendar</a></li>
                                    <li><a href="issue_tracker.html">Issue tracker</a></li>
                                    <li><a href="blog.html">Blog</a></li>
                                    <li><a href="article.html">Article</a></li>
                                    <li><a href="faq.html">FAQ</a></li>
                                    <li><a href="timeline.html">Timeline</a></li>
                                    <li><a href="pin_board.html">Pin board</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-files-o"></i> <span class="nav-label">权限管理</span><span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level collapse">
                                    <li><a href="search_results.html">Search results</a></li>
                                    <li><a href="lockscreen.html">Lockscreen</a></li>
                                    <li><a href="invoice.html">Invoice</a></li>
                                    <li><a href="login.html">Login</a></li>
                                    <li><a href="login_two_columns.html">Login v.2</a></li>
                                    <li><a href="forgot_password.html">Forget password</a></li>
                                    <li><a href="register.html">Register</a></li>
                                    <li><a href="404.html">404 Page</a></li>
                                    <li><a href="500.html">500 Page</a></li>
                                    <li><a href="empty_page.html">Empty page</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-globe"></i> <span class="nav-label">附件管理</span></a>
                                <ul class="nav nav-second-level collapse">
                                    <li><a href="toastr_notifications.html">Notification</a></li>
                                    <li><a href="nestable_list.html">Nestable list</a></li>
                                    <li><a href="agile_board.html">Agile board</a></li>
                                    <li><a href="timeline_2.html">Timeline v.2</a></li>
                                    <li><a href="diff.html">Diff</a></li>
                                    <li><a href="sweetalert.html">Sweet alert</a></li>
                                    <li><a href="idle_timer.html">Idle timer</a></li>
                                    <li><a href="spinners.html">Spinners</a></li>
                                    <li><a href="tinycon.html">Live favicon</a></li>
                                    <li><a href="google_maps.html">Google maps</a></li>
                                    <li><a href="code_editor.html">Code editor</a></li>
                                    <li><a href="modal_window.html">Modal window</a></li>
                                    <li><a href="forum_main.html">Forum view</a></li>
                                    <li><a href="validation.html">Validation</a></li>
                                    <li><a href="tree_view.html">Tree view</a></li>
                                    <li><a href="chat_view.html">Chat view</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>
            </@layout.block>

            <@layout.block name="contents">
                <@layout.block name="footer">
                </@layout.block>
            </@layout.block>
        </div>
        <@layout.block name="script">
        </@layout.block>
    </body>
</html>