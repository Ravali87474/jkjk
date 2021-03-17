package com.org.pg.hostel.Controller;

import com.org.pg.hostel.model.ModelHostelM;
import com.org.pg.hostel.model.ModelHostelS;
import com.org.pg.hostel.repository.RepoHostel;
import com.org.pg.hostel.repository.RepoHostelM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("RepoHostelM")
public class ControlHostel {
    @Autowired
    RepoHostel repoHostel;
    @Autowired
    RepoHostelM repoHostelM;
    @PostMapping("create")
            public void create (@RequestBody ModelHostelM modelHostelM)
    {
        repoHostelM.save(modelHostelM);
    }
    @GetMapping("Retrive")
    public void retrive()
    {
        List<ModelHostelM> all = repoHostelM.findAll();
        repoHostel.saveAll();

    }

}
