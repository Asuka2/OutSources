package com.xdkj.outsources.service.impl;

import com.xdkj.outsources.dao.UsersMapper;
import com.xdkj.outsources.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.outsources.entity.Project;
import com.xdkj.outsources.dao.ProjectMapper;
import com.xdkj.outsources.service.ProjectService;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public int deleteByPrimaryKey(Integer projectId) {
        return projectMapper.deleteByPrimaryKey(projectId);
    }

    @Override
    public int insert(Project record) {
        return projectMapper.insert(record);
    }

    @Override
    public int insertSelective(Project record) {
        return projectMapper.insertSelective(record);
    }

    @Override
    public Project selectByPrimaryKey(Integer projectId) {
        return projectMapper.selectByPrimaryKey(projectId);
    }

    @Override
    public int updateByPrimaryKeySelective(Project record) {
        return projectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Project record) {
        return projectMapper.updateByPrimaryKey(record);
    }


    /**
     * 发件人
     */
    @Value("${lance.mail.sender}")
    private String from;
    @Autowired
    private JavaMailSender javaMailSender;
    /**
     * 通知项目发布者该项目被删除
     *
     * @param projectId 项目ID
     * @return 返回1/0,1代表删除并发送成功，0代表删除发送失败
     */
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Boolean sendDeleteProjectMail(Integer projectId) {
        if (projectId != null) {
            Project project = projectMapper.selectByPrimaryKey(projectId);
            try {
                Users user = usersMapper.selectByPrimaryKey(project.getProjectPublisher());
                if (user == null || "".equals(user)) {
                    throw new RuntimeException("发送失败，用户不存在！");
                } else {
                    String userEmail = user.getUserEmail();
                    SimpleMailMessage message = new SimpleMailMessage();
                    message.setFrom(from);
                    message.setTo(userEmail);
                    message.setSubject("项目删除通知");
                    message.setText("您的项目" + project.getProjectName() + "由于违反相关规定,已被本平台删除，如有疑问，Go fuck yourself!");
                    javaMailSender.send(message);
                    projectMapper.deleteByPrimaryKey(projectId);
                    return true;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException("发送失败，失败原因：" + e.getMessage());
            }
        } else {
            throw new RuntimeException("项目ID为Null");
        }
    }

}





