<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>{$title|default=$web['title']}</title>
    <meta name="description" content="{$web['description']}" />
    <meta name="keywords" content="{$web['keywords']}">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="shortcut icon" href="${request.contextPath}/assets/home/img/favicon.jpg">
    <link rel="stylesheet" href="${request.contextPath}/assets/common/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${request.contextPath}/assets/common/css/font-awesome.min.css" />
    <link rel="stylesheet" href="${request.contextPath}/assets/home/css/base.css" />
    <script>window.onload=function(){window.loaded=!0};</script>
</head>
<body>
    <@layout.block name="header">
    <header class="main-header" style="background-image: url(http://otiyd2z4u.bkt.clouddn.com/zrJjQg2JprEt03gntGas.jpg)"></header>
    <nav class="main-navigation">
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div class="navbar-header">
                        <span class="nav-toggle-button collapsed" data-toggle="collapse" data-target="#main-menu">
                            <span class="sr-only">Toggle navigation</span>
                            <i class="fa fa-bars"></i>
                        </span>
                    </div>
                    <div class="collapse navbar-collapse" id="main-menu">
                        <ul class="menu">
                            <volist name="nav_list" id="row">
                                <li <if condition="$active eq $row['active']">class="nav-current"</if> role="presentation">
                                    <a href="{$row['url']}" <if condition="$row['target'] eq 1">target="_blank"</if>>{$row['name']}</a>
                                </li>
                            </volist>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </nav>
    </@layout.block>
    <@layout.block name="contents">
    </@layout.block>
    <@layout.block name="footer">
    <footer class="main-footer">
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <div class="widget">
                        <h4 class="title">最新文章</h4>
                        <div class="content recent-post">
                        <volist name="new_list" id="vo">
                            <div class="recent-single-post">
                                <a href="{:U('Index/single',array('id'=>$vo['id']))}" class="post-title">{$vo['title']}</a>
                                <div class="date">发布时间：{$vo['create_time']}</div>
                            </div>
                        </volist>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="widget">
                        <h4 class="title">标签云</h4>
                        <div class="content tag-cloud">
                        <volist name="tags" id="tag">
                            <a href="{:U('Index/index',array('tag'=>$tag['tag_name']))}">{$tag['tag_name']}</a>
                        </volist>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="widget">
                        <h4 class="title">友情链接</h4>
                        <div class="content tag-cloud friend-links">
                            <volist name="friendly_link" id="fl">
                                <a href="{$fl['link']}" title="{$fl['title']}" target="_blank">{$fl['title']}</a>
                            </volist>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <div class="copyright">
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <span>Copyright &copy; <a href="http://www.xuexiaofeng.com/">xuexiaofeng.com</a></span> |
                    <span><a href="http://www.miibeian.gov.cn/" target="_blank">{$web['icp']}</a></span>
                </div>
            </div>
        </div>
    </div>
    <div id="loadProgress" class="progress progress-top"></div>
    <div class="rotate" id="rotate">
        <div class="rotate-icon"></div>
    </div>
    <a href="#" id="back_to_top"><i class="fa fa-angle-up"></i></a>
    <div class="hidden">{$web['tj']}</div>
    <script src="${request.contextPath}/assets/common/js/jquery.min.js"></script>
    <script src="${request.contextPath}/assets/common/js/bootstrap.min.js"></script>
    <script src="${request.contextPath}/assets/home/js/base.js"></script>
    </@layout.block>
    </body>
</html>