package com.ruoyi.source.mapper;

import java.util.List;
import com.ruoyi.source.domain.SouStateList;
import io.lettuce.core.dynamic.annotation.Param;

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

}