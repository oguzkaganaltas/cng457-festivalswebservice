package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import com.oguzkaganmustafa.festivalmanager.service.OrganiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrganiserController to manage web service of it.
 */
@RestController
public class OrganiserController {

    @Autowired
    private OrganiserService organiserService;

    /**
     * It takes a request body to save organiser to the database.
     * @param organiser
     * @return
     */
    @PostMapping("/addorganiser")
    public Organiser addOrganiser(@RequestBody Organiser organiser){

        return organiserService.saveOrganiser(organiser);
    }

}
