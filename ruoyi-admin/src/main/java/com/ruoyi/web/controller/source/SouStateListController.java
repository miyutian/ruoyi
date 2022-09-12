package com.ruoyi.web.controller.source;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
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
        System.err.println(AjaxResult.success(statesource).toString());
        return AjaxResult.success(statesource);
    }
}
