package com.saraya.controller;

import com.saraya.models.Owner;
import com.saraya.models.Pet;
import com.saraya.models.Visit;
import com.saraya.service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
//@SessionAttributes(names = {"owners", "lastName"})
public class LoginController {
    Service service = new Service();

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/home")
    public String welcome(@RequestParam String userName, @RequestParam String password) {
        if (service.authentifie(userName, password))
            return "welcome";
        else
            return "visitList";
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin() {
        return "index";
    }

    @RequestMapping(value = "/toHome")
    public String toHome() {
        return "welcome";
    }

    @RequestMapping(value = "/toOwners")
    public String toOwners() {
        return "ownerList";
    }

    @RequestMapping(value = "/toOwnerSearchPage")
    public String search() {
        return "ownerSearchPage";
    }

    @RequestMapping(value = "/owners")
    public String owners(@RequestParam String lastName, ModelMap model) {
        List<Owner> ows = service.getOwners().stream().filter(owner -> owner.getLastName().contains(lastName)).toList();
        model.put("owners", ows);
        return "ownerList";
    }

    @RequestMapping("/vets")
    public String vets(ModelMap model) {
        model.put("vets", service.getVets());
        return "vets";
    }

    @RequestMapping(value = "/detail/{owner}")
    public String detail(@PathVariable int owner, ModelMap model) {
        model.put("owner", service.getOwners().get(owner - 1));
        return "detail";
    }

    @GetMapping(value = "/addOwner")
    public String addOwner(ModelMap model) {
        model.put("owner", new Owner());
        Owner.reduceId();
        return "addOwner";
    }

    @PostMapping(value = "/addOwner")
    public String ownerAdded(@ModelAttribute Owner owner, ModelMap model) {
        service.getOwners().add(owner);
        model.put("owner", owner.getId());
        return "redirect:/detail/{owner}/addPet";
    }

    @GetMapping(value = "/detail/{id}/editOwner")
    public String editOwner(@PathVariable int id, ModelMap model) {
        model.put("owner", service.getOwners().get(id - 1));
        model.put("id", id);
        return "editOwner";
    }

    @PostMapping(value = "/detail/{id}/editOwner")
    public String updateOwner(@ModelAttribute Owner owner, @PathVariable int id, ModelMap model) {
        owner.setId(id);
        Owner.reduceId();
        owner.setPets(service.getOwners().get(id - 1).getPets());
        service.getOwners().set(id - 1, owner);
        model.put("owner", owner);
        return "redirect:/detail/{id}";
    }

    @GetMapping(value = "/detail/{owner}/addPet")
    public String addPet(@PathVariable int owner, ModelMap model) {
        model.put("theOwner", service.getOwners().get(owner - 1).getFirstName() + " " + service.getOwners().get(owner - 1).getLastName());
        model.put("owner", owner);
        Pet.setIncId();
        model.put("pet", new Pet());
        model.put("types", service.getTypes());
        return "addPet";
    }

    @PostMapping(value = "/detail/{id}/addPet")
    public String petAdded(@ModelAttribute("pet") Pet pet, @PathVariable int id, ModelMap model) {
        List<Pet> pets = service.getOwners().get(id - 1).getPets();
        if (pets != null) {
            pet.setId(pets.get(pets.size() - 1).getId() + 1);
            pets.add(pet);
        } else {
            pet.setId(1);
            service.getOwners().get(id - 1).setPets(new ArrayList<Pet>(Arrays.asList(pet)));
        }
        model.put("owner", service.getOwners().get(id - 1));
        return "redirect:/detail/{id}";
    }

    @GetMapping(value = "/detail/{idOwner}/editPet/{idPet}")
    public String editPet(@PathVariable int idOwner, @PathVariable int idPet, ModelMap model) {
        model.put("theOwner", service.getOwners().get(idOwner - 1).getFirstName() + " " + service.getOwners().get(idOwner - 1).getLastName());
        model.put("pet", service.getOwners().get(idOwner - 1).getPets().get(idPet - 1));
        model.put("owner", idOwner);
        model.put("idPet", idPet);
        Pet.setIncId();
        model.put("types", service.getTypes());
        return "editPet";
    }

    @PostMapping(value = "/detail/{idOwner}/editPet/{idPet}")
    public String updatePet(@ModelAttribute Pet pet, @PathVariable int idOwner, @PathVariable int idPet, ModelMap model) {
        Owner owner = service.getOwners().get(idOwner - 1);
        pet.setVisits(owner.getPets().get(idPet - 1).getVisits());
        pet.setId(idPet);
        owner.getPets().set(idPet - 1, pet);
        model.put("owner", owner);
        return "redirect:/detail/{idOwner}";
    }

    @GetMapping(value = "/detail/{idOwner}/addVisit/{idPet}")
    public String addVisit(@PathVariable int idOwner, @PathVariable int idPet, ModelMap model) {
        model.put("visit", new Visit());
        model.put("idOwner", idOwner);
        model.put("idPet", idPet);
        return "addVisit";
    }

    @PostMapping(value = "/detail/{idOwner}/visitAdded/{idPet}")
    public String visitAdded(@PathVariable int idOwner, @PathVariable int idPet, @ModelAttribute Visit visit, ModelMap model) {
        Pet pet = service.getOwners().get(idOwner - 1).getPets().get(idPet - 1);
        if (pet.getVisits() == null)
            pet.setVisits(new ArrayList<>(List.of(visit)));
        else
            pet.getVisits().add(visit);
        model.put("owner", service.getOwners().get(idOwner - 1));
        return "redirect:/detail/{idOwner}";
    }

}