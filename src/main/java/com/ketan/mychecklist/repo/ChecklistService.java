package com.ketan.mychecklist.repo;

import com.ketan.mychecklist.dto.ChecklistDto;
import com.ketan.mychecklist.entity.Checklist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ChecklistService {

    @Autowired
    ChecklistRepository checklistRepo;

    @Autowired
    Checklist checklist;
    @Autowired
    ChecklistDto checklistDto;

    public Checklist saveChecklist(Checklist checklistEntity){
        return checklistRepo.save(checklistEntity);
    }

    public Checklist getCheckListByID(String checklistId){

        return checklistRepo.getReferenceById(checklistId);
    }

    public List<Checklist> getChecklistByUserId(String userId){

        return checklistRepo.findByUserId(userId);
    }

    public void deleteChecklistById(String checklistId){

         checklistRepo.deleteById(checklistId);
    }

}
