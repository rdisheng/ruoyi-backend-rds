package com.ruoyi.datamanage.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.datamanage.domain.DataImport;
import com.ruoyi.datamanage.mapper.DataImportMapper;
import com.ruoyi.datamanage.service.IDataImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据引接记录Service业务层处理
 *
 * @author rds
 * @date 2025-08-25
 */
@Service
public class DataImportServiceImpl implements IDataImportService {
    @Autowired
    private DataImportMapper dataImportMapper;

    /**
     * 查询数据引接记录
     *
     * @param id 数据引接记录主键
     * @return 数据引接记录
     */
    @Override
    public DataImport selectDataImportById(Long id) {
        return dataImportMapper.selectDataImportById(id);
    }

    /**
     * 查询数据引接记录列表
     *
     * @param dataImport 数据引接记录
     * @return 数据引接记录
     */
    @Override
    public List<DataImport> selectDataImportList(DataImport dataImport) {
        return dataImportMapper.selectDataImportList(dataImport);
    }

    /**
     * 新增数据引接记录
     *
     * @param dataImport 数据引接记录
     * @return 结果
     */
    @Override
    public int insertDataImport(DataImport dataImport) {
        dataImport.setCreateTime(DateUtils.getNowDate());
        return dataImportMapper.insertDataImport(dataImport);
    }

    /**
     * 修改数据引接记录
     *
     * @param dataImport 数据引接记录
     * @return 结果
     */
    @Override
    public int updateDataImport(DataImport dataImport) {
        dataImport.setUpdateTime(DateUtils.getNowDate());
        return dataImportMapper.updateDataImport(dataImport);
    }

    /**
     * 批量删除数据引接记录
     *
     * @param ids 需要删除的数据引接记录主键
     * @return 结果
     */
    @Override
    public int deleteDataImportByIds(Long[] ids) {
        return dataImportMapper.deleteDataImportByIds(ids);
    }

    /**
     * 删除数据引接记录信息
     *
     * @param id 数据引接记录主键
     * @return 结果
     */
    @Override
    public int deleteDataImportById(Long id) {
        return dataImportMapper.deleteDataImportById(id);
    }
}
