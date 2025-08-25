package com.ruoyi.datamanage.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.datamanage.domain.DataImport;
import com.ruoyi.datamanage.service.IDataImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 数据引接记录Controller
 *
 * @author rds
 * @date 2025-08-25
 */
@RestController
@RequestMapping("/datamanage/import")
public class DataImportController extends BaseController {
    @Autowired
    private IDataImportService dataImportService;

    /**
     * 查询数据引接记录列表
     */
    @PreAuthorize("@ss.hasPermi('datamanage:import:list')")
    @GetMapping("/list")
    public TableDataInfo list(DataImport dataImport) {
        startPage();
        List<DataImport> list = dataImportService.selectDataImportList(dataImport);
        return getDataTable(list);
    }

    /**
     * 导出数据引接记录列表
     */
    @PreAuthorize("@ss.hasPermi('datamanage:import:export')")
    @Log(title = "数据引接记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataImport dataImport) {
        List<DataImport> list = dataImportService.selectDataImportList(dataImport);
        ExcelUtil<DataImport> util = new ExcelUtil<DataImport>(DataImport.class);
        util.exportExcel(response, list, "数据引接记录数据");
    }

    /**
     * 获取数据引接记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('datamanage:import:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(dataImportService.selectDataImportById(id));
    }

    /**
     * 新增数据引接记录
     */
    @PreAuthorize("@ss.hasPermi('datamanage:import:add')")
    @Log(title = "数据引接记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataImport dataImport) {
        return toAjax(dataImportService.insertDataImport(dataImport));
    }

    /**
     * 修改数据引接记录
     */
    @PreAuthorize("@ss.hasPermi('datamanage:import:edit')")
    @Log(title = "数据引接记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataImport dataImport) {
        return toAjax(dataImportService.updateDataImport(dataImport));
    }

    /**
     * 删除数据引接记录
     */
    @PreAuthorize("@ss.hasPermi('datamanage:import:remove')")
    @Log(title = "数据引接记录", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(dataImportService.deleteDataImportByIds(ids));
    }
}
