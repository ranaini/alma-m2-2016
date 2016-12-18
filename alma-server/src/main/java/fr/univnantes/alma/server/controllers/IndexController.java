/*******************************************************************************
 * Copyright (c) 2016 Stéphane Bégaudeau.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MIT License which
 * accompanies this distribution, and is available at
 * https://opensource.org/licenses/MIT
 *******************************************************************************/
package com.svalyn.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller is used in order to redirect calls to the root of the domain to the index.html file.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/app/**")
    public String app() {
        return "index";
    }

    @RequestMapping("/new_account")
    public String createAccount() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "index";
    }
}