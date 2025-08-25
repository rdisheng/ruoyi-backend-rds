package com.ruoyi.datamanage.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.datamanage.domain.DmEtlTaskNode;
import com.ruoyi.datamanage.service.IDmEtlTaskNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * data_manage模块的etl节点结构Controller
 *
 * @author rds
 * @date 2025-08-25
 */
@RestController
@RequestMapping("/data_manage/node")
public class DmEtlTaskNodeController extends BaseController {
    @Autowired
    private IDmEtlTaskNodeService dmEtlTaskNodeService;

    /**
     * 查询data_manage模块的etl节点结构列表
     */
    @PreAuthorize("@ss.hasPermi('data_manage:node:list')")
    @GetMapping("/list")
    public TableDataInfo list(DmEtlTaskNode dmEtlTaskNode) {
        startPage();
        List<DmEtlTaskNode> list = dmEtlTaskNodeService.selectDmEtlTaskNodeList(dmEtlTaskNode);
        return getDataTable(list);
    }

    /**
     * 导出data_manage模块的etl节点结构列表
     */
    @PreAuthorize("@ss.hasPermi('data_manage:node:export')")
    @Log(title = "data_manage模块的etl节点结构", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DmEtlTaskNode dmEtlTaskNode) {
        List<DmEtlTaskNode> list = dmEtlTaskNodeService.selectDmEtlTaskNodeList(dmEtlTaskNode);
        ExcelUtil<DmEtlTaskNode> util = new ExcelUtil<DmEtlTaskNode>(DmEtlTaskNode.class);
        util.exportExcel(response, list, "data_manage模块的etl节点结构数据");
    }

    /**
     * 获取data_manage模块的etl节点结构详细信息
     */
    @PreAuthorize("@ss.hasPermi('data_manage:node:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(dmEtlTaskNodeService.selectDmEtlTaskNodeById(id));
    }

    /**
     * 新增data_manage模块的etl节点结构
     */
    @PreAuthorize("@ss.hasPermi('data_manage:node:add')")
    @Log(title = "data_manage模块的etl节点结构", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DmEtlTaskNode dmEtlTaskNode) {
        return toAjax(dmEtlTaskNodeService.insertDmEtlTaskNode(dmEtlTaskNode));
    }

    /**
     * 修改data_manage模块的etl节点结构
     */
    @PreAuthorize("@ss.hasPermi('data_manage:node:edit')")
    @Log(title = "data_manage模块的etl节点结构", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DmEtlTaskNode dmEtlTaskNode) {
        return toAjax(dmEtlTaskNodeService.updateDmEtlTaskNode(dmEtlTaskNode));
    }

    /**
     * 删除data_manage模块的etl节点结构
     */
    @PreAuthorize("@ss.hasPermi('data_manage:node:remove')")
    @Log(title = "data_manage模块的etl节点结构", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(dmEtlTaskNodeService.deleteDmEtlTaskNodeByIds(ids));
    }
}
