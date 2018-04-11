package com.qiyi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*******************************************************
 * Copyright (C) 2018 iQIYI.COM - All Rights Reserved
 *
 * This file is part of config-client.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): liu yanguang <liuyanguang@qiyi.com>
 * 18/4/10
 *******************************************************/
@RestController
public class TestController {

    @Value("${spring.data.redis.host}") String redisHost;

    @RequestMapping("/applicationDescription")
    public String showDescribe() {
        return "The describe is: " + redisHost;
    }
}
