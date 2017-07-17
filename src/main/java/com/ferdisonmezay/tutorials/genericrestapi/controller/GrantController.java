package com.ferdisonmezay.tutorials.genericrestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferdisonmezay.tutorials.genericrestapi.model.Grant;

@RestController
@RequestMapping("/grants")
public class GrantController extends GenericRestController<Grant> {

}
