package com.ylwl.batchRegisteration.dao;

import com.ylwl.batchRegisteration.domain.GameUser;
import com.ylwl.system.domain.PageBean;

import java.util.List;

public interface GameUserMapper {


    int insert(GameUser gameUser);

    List<GameUser> queryPageByGameUser(PageBean<GameUser> pageBean);


}
