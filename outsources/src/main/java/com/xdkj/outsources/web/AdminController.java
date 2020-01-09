package com.xdkj.outsources.web;

import com.xdkj.outsources.entity.Identification;
import com.xdkj.outsources.entity.Users;
import com.xdkj.outsources.service.IdentificationService;
import com.xdkj.outsources.service.ProjectService;
import com.xdkj.outsources.service.UsersService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author JCX
 * @create 2020-01-06 16:34
 */
@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    /**
     * 用户管理（程序员和项目发布者）
     */
    @Autowired
    private UsersService usersService;
    @ApiOperation(value = "根据userId删除用户",notes = "删除用户:success为1时删除成功，为0时删除失败")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户ID",required = true,dataType = "int"),
    })
    @RequestMapping(value = "/usermanagement/deleteuserbyid",method = RequestMethod.POST)
    public Map<String,Object> deleteUserById(@RequestParam("userId")Integer userId){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success",usersService.deleteByPrimaryKey(userId));
        return modelMap;
    }

    /**
     * 项目管理
     */
    @Autowired
    private ProjectService projectService;
    @ApiOperation(value = "根据projectId删除项目",notes = "删除项目:success为1时删除成功，为0时删除失败")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "projectId",value = "项目ID",required = true,dataType = "int"),
    })
    @RequestMapping(value = "/projectmanagement/deleteprojectbyid",method = RequestMethod.POST)
    public Map<String,Object> deleteProjectById(@RequestParam("projectId")Integer projectId){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success",projectService.sendDeleteProjectMail(projectId));
        return modelMap;
    }

    /**
     * 审核管理
     */
    @Autowired
    private IdentificationService identificationService;
    @ApiOperation(value = "根据identificationId修改其状态",notes = "修改审核状态:success为1时修改成功，为0时修改失败")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "identityId",value = "待审核ID",required = true,dataType = "int"),
            @ApiImplicitParam(paramType = "query",name = "identityStatus",value = "审核结果",required = true,dataType = "int"),
    })
    @RequestMapping(value = "/identificationmanagement/updateidentification",method = RequestMethod.POST)
    public Map<String,Object> updateIdentification(@RequestParam("identityId")Integer identityId,
                                                   @RequestParam("identityStatus")Integer identityStatus){
        Map<String, Object> modelMap = new HashMap<>();
        Identification identification = new Identification();
        identification.setIdentityId(identityId);
        identification.setIdentityStatus(identityStatus);
        modelMap.put("success",identificationService.updateByPrimaryKeySelective(identification));
        return modelMap;
    }



}
