package hw8.family.Controller;

import hw8.family.service.Services;

public class FamilyController {
    public Services FamilyService ;

    public FamilyController(Services service) {
        this.FamilyService  = service;
    }
}
