package me.uniauto.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_user")
public class SysUser implements Serializable {
    @Id
    @Column(name = "id_")
    private Long id;

    /**
     * 登陆帐户
     */
    @Column(name = "account_")
    private String account;

    /**
     * 密码
     */
    @Column(name = "password_")
    private String password;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 姓名拼音
     */
    @Column(name = "name_pinyin")
    private String namePinyin;

    /**
     * 性别(0:未知;1:男;2:女)
     */
    @Column(name = "sex_")
    private Integer sex;

    @Column(name = "avatar_")
    private String avatar;

    /**
     * 人员类型(1:经办员;2:管理员;3:系统内置人员;)
     */
    @Column(name = "user_type")
    private Integer userType;

    /**
     * 电话
     */
    @Column(name = "phone_")
    private String phone;

    /**
     * 邮箱
     */
    @Column(name = "email_")
    private String email;

    /**
     * 出生日期
     */
    @Column(name = "birth_day")
    private Date birthDay;

    /**
     * 部门编号
     */
    @Column(name = "dept_id")
    private Long deptId;

    /**
     * 职位
     */
    @Column(name = "position_")
    private String position;

    /**
     * 详细地址
     */
    @Column(name = "address_")
    private String address;

    /**
     * 工号
     */
    @Column(name = "staff_no")
    private String staffNo;

    /**
     * 锁定标志(1:锁定;0:激活)
     */
    @Column(name = "locked_")
    private Boolean locked;

    @Column(name = "enable_")
    private Boolean enable;

    @Column(name = "remark_")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "update_by")
    private Long updateBy;

    private static final long serialVersionUID = 1L;

    /**
     * @return id_
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取登陆帐户
     *
     * @return account_ - 登陆帐户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置登陆帐户
     *
     * @param account 登陆帐户
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password_ - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取姓名拼音
     *
     * @return name_pinyin - 姓名拼音
     */
    public String getNamePinyin() {
        return namePinyin;
    }

    /**
     * 设置姓名拼音
     *
     * @param namePinyin 姓名拼音
     */
    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    /**
     * 获取性别(0:未知;1:男;2:女)
     *
     * @return sex_ - 性别(0:未知;1:男;2:女)
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别(0:未知;1:男;2:女)
     *
     * @param sex 性别(0:未知;1:男;2:女)
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return avatar_
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取人员类型(1:经办员;2:管理员;3:系统内置人员;)
     *
     * @return user_type - 人员类型(1:经办员;2:管理员;3:系统内置人员;)
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置人员类型(1:经办员;2:管理员;3:系统内置人员;)
     *
     * @param userType 人员类型(1:经办员;2:管理员;3:系统内置人员;)
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取电话
     *
     * @return phone_ - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮箱
     *
     * @return email_ - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取出生日期
     *
     * @return birth_day - 出生日期
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * 设置出生日期
     *
     * @param birthDay 出生日期
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * 获取部门编号
     *
     * @return dept_id - 部门编号
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 设置部门编号
     *
     * @param deptId 部门编号
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取职位
     *
     * @return position_ - 职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职位
     *
     * @param position 职位
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取详细地址
     *
     * @return address_ - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取工号
     *
     * @return staff_no - 工号
     */
    public String getStaffNo() {
        return staffNo;
    }

    /**
     * 设置工号
     *
     * @param staffNo 工号
     */
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    /**
     * 获取锁定标志(1:锁定;0:激活)
     *
     * @return locked_ - 锁定标志(1:锁定;0:激活)
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 设置锁定标志(1:锁定;0:激活)
     *
     * @param locked 锁定标志(1:锁定;0:激活)
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * @return enable_
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * @return remark_
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return create_by
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return update_by
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }
}