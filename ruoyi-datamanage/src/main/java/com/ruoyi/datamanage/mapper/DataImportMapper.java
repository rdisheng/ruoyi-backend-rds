package com.ruoyi.datamanage.mapper;

import com.ruoyi.datamanage.domain.DataImport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据引接记录Mapper接口
 *
 * @author rds
 * @date 2025-08-25
 */
@Mapper
public interface DataImportMapper {
    /**
     * 查询数据引接记录
     *
     * @param id 数据引接记录主键
     * @return 数据引接记录
     */
    public DataImport selectDataImportById(Long id);

    /**
     * 查询数据引接记录列表
     *
     * @param dataImport 数据引接记录
     * @return 数据引接记录集合
     */
    public List<DataImport> selectDataImportList(DataImport dataImport);

    /**
     * 新增数据引接记录
     *
     * @param dataImport 数据引接记录
     * @return 结果
     */
    public int insertDataImport(DataImport dataImport);

    /**
     * 修改数据引接记录
     *
     * @param dataImport 数据引接记录
     * @return 结果
     */
    public int updateDataImport(DataImport dataImport);

    /**
     * 删除数据引接记录
     *
     * @param id 数据引接记录主键
     * @return 结果
     */
    public int deleteDataImportById(Long id);

    /**
     * 批量删除数据引接记录
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDataImportByIds(Long[] ids);
}
