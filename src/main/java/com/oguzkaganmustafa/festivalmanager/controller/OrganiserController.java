package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import com.oguzkaganmustafa.festivalmanager.service.OrganiserService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /**
     * It returns list of organisers by the query Name Containing Or Phone Number Equals Or Email Starting With Or Surname Containing.
     * @param name String
     * @param phone String
     * @param email String
     * @return List
     */
    @GetMapping("/organisersearch")
    public List<Organiser> organiserSearch(@RequestParam String name, @RequestParam String phone, @RequestParam String email){
        return organiserService.organiserSearch(name,phone,email);
    }

    /**
     * It returns the organisers with multiple festival runs.
     * @return List
     */
    @GetMapping("/organiserswithmultipleruns")
    public List<Organiser> getOrganiserWithMultipleRuns(){
        return organiserService.getOrganiserWithMultipleRuns();
    }

    @GetMapping("/getorganiser/{email}")
    public Organiser getOrganiser(@PathVariable String email) { return organiserService.getOrganiser(email); }

    @GetMapping("/getallorganisers")
    public List<Organiser> getAllOrganisers(){ return organiserService.getAllOrganisers(); }

}
