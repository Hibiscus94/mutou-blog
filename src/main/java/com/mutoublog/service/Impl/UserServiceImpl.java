package com.mutoublog.service.Impl;

import com.mutoublog.dao.entity.MtUser;
import com.mutoublog.dao.entity.MtUserExample;
import com.mutoublog.dao.mapper.MtUserMapper;
import com.mutoublog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    MtUserMapper mtUserMapper;

    @Override
    public MtUser getUserById(Integer userId) {
        return mtUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public MtUser getUserByName(String userName) {
        try {
            return mtUserMapper.selectByUserName(userName);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<MtUser> getUsersByClause(Map clause) {
//        MtUserExample example = new MtUserExample();
//        example.createCriteria().andStatusEqualTo(isValid);
//        return mtUserMapper.selectByExample(example);
        return null;
    }

    @Override
    @Transactional
    public Integer updateUserById(MtUser mtUser) {
        int userid = mtUser.getId();
        if (userid <= 0){
            return null;
        }
        try {
            MtUserExample mtUserExample = new MtUserExample();
            MtUserExample.Criteria criteria = mtUserExample.createCriteria();
            criteria.andIdEqualTo(userid);
            return mtUserMapper.updateByExampleSelective(mtUser,mtUserExample);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    @Transactional
    public Integer saveUser(MtUser mtUser) {
        try{
            mtUserMapper.insert(mtUser);
            return mtUser.getId();
        }catch (Exception e){
            return 0;
        }
    }

    @Override
    @Transactional
    public Integer deleteUser(Integer userId) {
        try{
            return mtUserMapper.deleteByPrimaryKey(userId);
        }catch (Exception e){
            return 0;
        }
    }
}
