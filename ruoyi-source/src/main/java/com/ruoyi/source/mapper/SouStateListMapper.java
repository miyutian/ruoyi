package com.ruoyi.source.mapper;

import java.util.List;
import com.ruoyi.source.domain.SouStateList;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * 参数配置 数据层
 *
 * @author ruoyi
 */
public interface SouStateListMapper {
    /**
     * 查询全部州列表信息
     *
     * @return 参数配置信息
     */

    List<SouStateList> selectStateList();
    /**
     * 根查询全部资源列表信息
     *
     * @return 参数配置信息
     */
    List<SouStateList> selectAllSource();

    /**
     * 根据州名名查询资源信息
     *
     * @param State 参数键名
     * @return 参数配置信息
     */
    List<SouStateList> selectSourceByState(@Param("State") String State);

    /**
     * 根据州名名查询资源信息
     *
     * @param id 参数键名
     * @return 参数配置信息
     */
    List<SouStateList> selectSouById(@Param("id") int id);

    /**
     * 根据州名查询资源信息
     *
     * @param data 参数键名
     * @return int
     */
    int updateSource(SouStateList data);

    /**
     * 批量删除资源信息
     *
     * @param Ids 需要删除的资源ID
     * @return 结果
     */
    public int deleteSourceByIds(Long[] Ids);

    /**
     * 添加资源信息
     *
     * @param data 需要添加的数据
     * @return 结果
     */
    public int insertSource(SouStateList data);


}