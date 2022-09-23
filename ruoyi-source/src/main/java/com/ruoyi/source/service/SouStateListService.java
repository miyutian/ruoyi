package com.ruoyi.source.service;

import com.ruoyi.source.domain.SouStateList;

import java.util.List;

/**
 * 参数配置 服务层
 * 
 * @author ruoyi
 */
public interface SouStateListService
{
    /**
     * 查询全部州列表信息
     *
     * @return 州列表
     */
    public List<SouStateList> selectStateList();

    /**
     * 根据全部资源列表信息
     * 
     * @return 资源列表
     */
    public List<SouStateList> selectAllSouList();

    /**
     * 根据州名查询资源信息
     *
     * @param State 参数键名
     * @return 制定州的资源列表
     */
    public List<SouStateList> selectSouByState(String State);

    /**
     * 根据州名查询资源信息
     *
     * @param data 参数键名
     * @return int
     */
    public int updateSource(SouStateList data);

    /**
     * 根据州名查询资源信息
     *
     * @param id 参数键名
     * @return 制定州的资源列表
     */
    public List<SouStateList> selectSouById(String id);

    /**
     * 批量删除资源
     *
     * @param Ids 需要删除的资源id
     * @return 结果
     */
    public int deleteSourceByIds(Long[] Ids);

    /**
     * 添加资源
     *
     * @param data 需要删除的资源id
     * @return insert
     */
    public int insertSource(SouStateList data);

}
