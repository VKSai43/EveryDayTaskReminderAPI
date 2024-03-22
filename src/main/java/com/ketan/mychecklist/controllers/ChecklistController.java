package com.ketan.mychecklist.controllers;

import com.ketan.mychecklist.dto.ChecklistDto;
import com.ketan.mychecklist.entity.Checklist;
import com.ketan.mychecklist.repo.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/checklist")

public class ChecklistController {

    @Autowired
    private ChecklistService checklistService;
    @Autowired
    private ChecklistDto checklistDto;

    @GetMapping("/getById/{id}")
    private ResponseEntity<Checklist> getChecklistById(@PathVariable("id") String checklistId){


        return ResponseEntity.ok(checklistService.getCheckListByID(checklistId));

    }

    @GetMapping("/getByUserId/{id}")
    private ResponseEntity<List<Checklist>> getChecklistsByUserId(@PathVariable("id") String userid){
        List<Checklist> response = checklistService.getChecklistByUserId(userid);

        return ResponseEntity.ok(response);

    }


    @PostMapping("/")
    private void saveChecklist(@RequestBody Checklist checklist){

        checklist.setChecklistId(UUID.randomUUID().toString());
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try{
            checklist.setDateCreated(dateFormat.parse(dateFormat.format(currentDate)));
        }catch (ParseException p){
            System.out.println("DateParseException");
        }
        checklistService.saveChecklist(checklist);
    }

    @DeleteMapping("/{id}")
    private void deleteChecklist(@PathVariable("id") String checklistId){
        checklistService.deleteChecklistById(checklistId);
    }
}
