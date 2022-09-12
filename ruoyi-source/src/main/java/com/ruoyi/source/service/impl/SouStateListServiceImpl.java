package com.ruoyi.source.service.impl;



import com.ruoyi.source.domain.SouStateList;
import com.ruoyi.source.mapper.SouStateListMapper;
import com.ruoyi.source.service.SouStateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        System.out.println(soustatelist.toString());
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
}
