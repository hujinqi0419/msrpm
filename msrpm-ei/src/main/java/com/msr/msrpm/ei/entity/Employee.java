package com.msr.msrpm.ei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author msr
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Employee对象", description="")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "员工编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "员工姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @ApiModelProperty(value = "身份证号")
    @TableField("idCard")
    private String idCard;

    @ApiModelProperty(value = "婚姻状况")
    private String wedlock;

    @ApiModelProperty(value = "民族")
    @TableField("nationId")
    private Integer nationId;

    @ApiModelProperty(value = "籍贯")
    @TableField("nativePlace")
    private String nativePlace;

    @ApiModelProperty(value = "政治面貌")
    @TableField("politicId")
    private Integer politicId;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "电话号码")
    private String phone;

    @ApiModelProperty(value = "联系地址")
    private String address;

    @ApiModelProperty(value = "所属部门")
    @TableField("departmentId")
    private Integer departmentId;

    @ApiModelProperty(value = "职称ID")
    @TableField("jobLevelId")
    private Integer jobLevelId;

    @ApiModelProperty(value = "职位ID")
    @TableField("posId")
    private Integer posId;

    @ApiModelProperty(value = "聘用形式")
    @TableField("engageForm")
    private String engageForm;

    @ApiModelProperty(value = "最高学历")
    @TableField("tiptopDegree")
    private String tiptopDegree;

    @ApiModelProperty(value = "所属专业")
    private String specialty;

    @ApiModelProperty(value = "毕业院校")
    private String school;

    @ApiModelProperty(value = "入职日期")
    @TableField("beginDate")
    private Date beginDate;

    @ApiModelProperty(value = "在职状态")
    @TableField("workState")
    private String workState;

    @ApiModelProperty(value = "工号")
    @TableField("workID")
    private String workID;

    @ApiModelProperty(value = "合同期限")
    @TableField("contractTerm")
    private Double contractTerm;

    @ApiModelProperty(value = "转正日期")
    @TableField("conversionTime")
    private Date conversionTime;

    @ApiModelProperty(value = "离职日期")
    @TableField("notWorkDate")
    private Date notWorkDate;

    @ApiModelProperty(value = "合同起始日期")
    @TableField("beginContract")
    private Date beginContract;

    @ApiModelProperty(value = "合同终止日期")
    @TableField("endContract")
    private Date endContract;

    @ApiModelProperty(value = "工龄")
    @TableField("workAge")
    private Integer workAge;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


}