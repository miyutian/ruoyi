package com.ruoyi.source.service.impl;



import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.source.domain.SouStateList;
import com.ruoyi.source.mapper.SouStateListMapper;
import com.ruoyi.source.service.SouStateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 参数配置 服务层实现
 * 
 * @author ruoyi
 */
@Service
public class SouStateListServiceImpl implements SouStateListService
{
    @Autowired
    private SouStateListMapper soustatelistMapper;

    /**
     * 查询所有的州的列表
     * 
     * @param
     * @return 所有州的列表
     */
    @Override
    public List<SouStateList> selectStateList()
    {
        List<SouStateList> soustatelist = soustatelistMapper.selectStateList();
        return soustatelistMapper.selectStateList();
    }

    /**
     * 查询所有的资源列表
     * 
     * @param
     * @return 所有资源列表
     */
    @Override
    public List<SouStateList> selectAllSouList()
    {
        List<SouStateList> soustatelist = soustatelistMapper.selectAllSource();
        return soustatelistMapper.selectAllSource();
    }

    /**
     * 获取州对应的资源列表
     * @param  State 州的简写
     * @return 返回州对应的资源列表
     */
    @Override
    public List<SouStateList> selectSouByState(String State)
    {
        return soustatelistMapper.selectSourceByState(State);
    }

    /**
     * 获取id对应的资源
     * @param  id 州的简写
     * @return 返回州对应的资源列表
     */
    @Override
    public List<SouStateList> selectSouById(String id)
    {
        return soustatelistMapper.selectSouById(Integer.valueOf(id));
    }

    /**
     * 根据州名查询资源信息
     *
     * @param data 参数键名
     * @return int
     */
    @Override
    public int updateSource(SouStateList data){ return soustatelistMapper.updateSource(data);}

    /**
     * 批量删除用户信息
     *
     * @param Ids 需要删除的用户ID
     * @return 结果
     */
    @Override
    @Transactional
    public int deleteSourceByIds(Long[] Ids)
    {
        return soustatelistMapper.deleteSourceByIds(Ids);
    }

    /**
     * 添加用户信息
     *
     * @param data 需要删除的用户ID
     * @return 结果
     */
    @Override
    @Transactional
    public int insertSource(SouStateList data)
    {
        return soustatelistMapper.insertSource(data);
    }
}
