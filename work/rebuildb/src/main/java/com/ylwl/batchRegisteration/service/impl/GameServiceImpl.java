package com.ylwl.batchRegisteration.service.impl;

import com.ylwl.batchRegisteration.dao.GameUserMapper;
import com.ylwl.batchRegisteration.domain.GameUser;
import com.ylwl.batchRegisteration.service.GameUserService;
import com.ylwl.security.SysSecurityHolder;
import com.ylwl.system.dao.GameConfigMapper;
import com.ylwl.system.dao.UserRelationMapper;
import com.ylwl.system.domain.CpsbUser;
import com.ylwl.system.domain.GameConfig;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameServiceImpl implements GameUserService {

    @Autowired
    private GameUserMapper gameUserMapper;
    @Autowired
    private GameConfigMapper gameConfigMapper;
    @Autowired
    private UserRelationMapper userRelationMapper;



    @Override
    public void saveGameUser(GameUser users) {
        CpsbUser user = SysSecurityHolder.getUserDetailInfo();
        users.setCompanyId(user.getCompanyId());
        users.setSubCompanyId(user.getSubCompanyId());
        users.setAutoIndex(user.getAutoIndex());
        users.setBandAuser(user.getBandAuser());
        String[] acounts = users.getAcount().split(",");
        users.setApplyCount(acounts.length);
        GameConfig gameConfig = gameConfigMapper.querybygameid(users.getGameId());
        if(gameConfig!=null){
            users.setYwId(gameConfig.getYwId());
            users.setPlatId(gameConfig.getGamePlatId());
        }
        Map<String,Object> params = new HashMap<>();
        params.put("userType",user.getBuserType());
        params.put("userId",user.getBuserId());
        params.put("userAccount",user.getBuserAccount());
        //b账号
        if(user.getBuserType()==1 || user.getBuserType()==2){
            users.setBbuserAcount(user.getBuserAccount());
            String cuserAcount = userRelationMapper.selectCUserAccount(params);
            users.setCuserAcount(cuserAcount);
        }
        //b-账号
        if(user.getBuserType()==3){
            users.setBbuserAcount(user.getBuserAccount());
            String cuserAcount = userRelationMapper.selectCUserAccount(params);
            users.setCuserAcount(cuserAcount);
        }
        //c账号
        if(user.getBuserType()==4) {
            users.setCuserAcount(user.getBuserAccount());
            Map<String, String> temp = userRelationMapper.selectBUserAndBbUserForC(params);
            if (StringUtils.isBlank(temp.get("buserAccount"))) {
                users.setBbuserAcount(temp.get("buserAccount"));
            }else{
                users.setBbuserAcount(temp.get("bbuserAccount"));
            }
        }
        Date time = new Date();
        users.setApplyTime(time);
        users.setCreateTime(time);
        users.setCreateBy(user.getBuserId());
        gameUserMapper.insert(users);

    }


    public static void main(String[] args) {
        String s= null;
        System.out.println(StringUtils.isBlank(s));
    }
}
