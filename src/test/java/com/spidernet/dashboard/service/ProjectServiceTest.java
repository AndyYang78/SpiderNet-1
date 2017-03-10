package com.spidernet.dashboard.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spidernet.dashboard.entity.Project;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml" })
public class ProjectServiceTest
{

    @Resource
    ProjectService projectService;
    @Test
    public void testLevelList(){
        String buId = "be27be6911304fd1a265dfcf8d5cc80f";
        
        List<Project> listP = projectService.queryProject(buId);

        for(Project s : listP){
            System.out.print(s);
           }
    }
}
