package com.yichun.havinblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 说明：跳转页面控制器（所有的跳转页面的请求写这里）
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/30 22:14
 */
@Controller
public class JumpPageController {

/** ===================    前台博客部分     ==========================*/
    /**
     * 到博客首页
     * @return
     */
    @RequestMapping("/")
    public String toIndexPage() {
        return "front/index";
    }

    /**
     * 到讨论圈首页
     * @return
     */
    @RequestMapping("/toDiscussionIndex")
    public String toDiscussionIndex() {
        return "front/discussion/discussionIndex";
    }

    /**
     * 到话题首页
     * @return
     */
    @RequestMapping("/toTopicIndex")
    public String toTopicIndex() {
        return "front/topic/topicIndex";
    }




/** ====================    后台管理台部分     ==========================*/

    /**
     * 到登陆页面
     * @return
     */
    @RequestMapping("/toLoginPage")
    public String toLoginPage() {
        return "admin/login";
    }
}
