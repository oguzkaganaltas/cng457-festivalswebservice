package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import com.oguzkaganmustafa.festivalmanager.service.OrganiserService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/organiserswithmultipleruns")
    public List<Organiser> getOrganiserWithMultipleRuns(){
        return organiserService.getOrganiserWithMultipleRuns();
    }

}
