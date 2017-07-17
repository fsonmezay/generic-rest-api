package com.ferdisonmezay.tutorials.genericrestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferdisonmezay.tutorials.genericrestapi.model.Role;

@RestController
@RequestMapping("/roles")
public class RoleController extends GenericRestController<Role> {

}
