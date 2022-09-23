package com.ruoyi.web.controller.source;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.source.domain.SouStateList;
import com.ruoyi.source.service.SouStateListService;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

/**
 * 部门信息
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/source")
public class SouStateListController extends BaseController
{
    @Autowired
    private SouStateListService soustatelistservice;

    /**
     * 获取州列表
     */
//    @PreAuthorize("@ss.hasPermi('system:dept:list')")
    @GetMapping("/states")
    public AjaxResult states()
    {
        List<SouStateList> states = soustatelistservice.selectStateList();
        return AjaxResult.success(states);
    }

    /**
     * 查询资源列表
     */
    @GetMapping("/sources")
    public AjaxResult sources()
    {
        List<SouStateList> sources = soustatelistservice.selectAllSouList();
        return AjaxResult.success(sources);
    }

    /**
     * 根据部门编号获取详细信息
     */
    @GetMapping(value = "/statesource/{State}")
    public AjaxResult getInfo(@PathVariable String State)
    {
        List<SouStateList> statesource = soustatelistservice.selectSouByState(State);
        return AjaxResult.success(statesource);
    }

    /**
     * 根据编号获取资源信息
     */
    @GetMapping ("/{id}")
    public AjaxResult getById(@PathVariable String id)
    {
        List<SouStateList> idsource = soustatelistservice.selectSouById(id);
        return AjaxResult.success(idsource);
    }

    /**
     * 修改资源
     */
    @Log(title = "资源管理123", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SouStateList source)
    {
        return toAjax(soustatelistservice.updateSource(source));
    }

    /**
     * 删除资源
     */
    @PreAuthorize("@ss.hasPermi('system:user:remove')")
    @Log(title = "资源管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{Ids}")
    public AjaxResult remove(@PathVariable Long[] Ids)
    {

        return toAjax(soustatelistservice.deleteSourceByIds(Ids));
    }

    /**
     * 新增资源
     */
    @Log(title = "资源管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SouStateList source)
    {
        return toAjax(soustatelistservice.insertSource(source));
    }

}
