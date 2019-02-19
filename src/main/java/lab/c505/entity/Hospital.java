package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName(value = "t_hospital")
public class Hospital {

    @TableId(type = IdType.AUTO)
    private String hosId;

    private String hosName;

    private String hosPy;

    private String hosCode;

    private String hosRank;

    private String hosType;

    private String hosProvince;

    private String hosCity;

    private String hosDistrict;

    private Integer hosBeds;

    private String hosAddress;

    private String hosDetail;

    private String hosTel;

    private BigDecimal hosLongitude;

    private BigDecimal hosLatitude;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public Hospital(String hosId, String hosName, String hosPy, String hosCode, String hosRank, String hosType, String hosProvince, String hosCity, String hosDistrict, Integer hosBeds, String hosAddress, String hosDetail, String hosTel, BigDecimal hosLongitude, BigDecimal hosLatitude, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.hosId = hosId;
        this.hosName = hosName;
        this.hosPy = hosPy;
        this.hosCode = hosCode;
        this.hosRank = hosRank;
        this.hosType = hosType;
        this.hosProvince = hosProvince;
        this.hosCity = hosCity;
        this.hosDistrict = hosDistrict;
        this.hosBeds = hosBeds;
        this.hosAddress = hosAddress;
        this.hosDetail = hosDetail;
        this.hosTel = hosTel;
        this.hosLongitude = hosLongitude;
        this.hosLatitude = hosLatitude;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public Hospital() {
        super();
    }

    public String getHosId() {
        return hosId;
    }

    public void setHosId(String hosId) {
        this.hosId = hosId == null ? null : hosId.trim();
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName == null ? null : hosName.trim();
    }

    public String getHosPy() {
        return hosPy;
    }

    public void setHosPy(String hosPy) {
        this.hosPy = hosPy == null ? null : hosPy.trim();
    }

    public String getHosCode() {
        return hosCode;
    }

    public void setHosCode(String hosCode) {
        this.hosCode = hosCode == null ? null : hosCode.trim();
    }

    public String getHosRank() {
        return hosRank;
    }

    public void setHosRank(String hosRank) {
        this.hosRank = hosRank == null ? null : hosRank.trim();
    }

    public String getHosType() {
        return hosType;
    }

    public void setHosType(String hosType) {
        this.hosType = hosType == null ? null : hosType.trim();
    }

    public String getHosProvince() {
        return hosProvince;
    }

    public void setHosProvince(String hosProvince) {
        this.hosProvince = hosProvince == null ? null : hosProvince.trim();
    }

    public String getHosCity() {
        return hosCity;
    }

    public void setHosCity(String hosCity) {
        this.hosCity = hosCity == null ? null : hosCity.trim();
    }

    public String getHosDistrict() {
        return hosDistrict;
    }

    public void setHosDistrict(String hosDistrict) {
        this.hosDistrict = hosDistrict == null ? null : hosDistrict.trim();
    }

    public Integer getHosBeds() {
        return hosBeds;
    }

    public void setHosBeds(Integer hosBeds) {
        this.hosBeds = hosBeds;
    }

    public String getHosAddress() {
        return hosAddress;
    }

    public void setHosAddress(String hosAddress) {
        this.hosAddress = hosAddress == null ? null : hosAddress.trim();
    }

    public String getHosDetail() {
        return hosDetail;
    }

    public void setHosDetail(String hosDetail) {
        this.hosDetail = hosDetail == null ? null : hosDetail.trim();
    }

    public String getHosTel() {
        return hosTel;
    }

    public void setHosTel(String hosTel) {
        this.hosTel = hosTel == null ? null : hosTel.trim();
    }

    public BigDecimal getHosLongitude() {
        return hosLongitude;
    }

    public void setHosLongitude(BigDecimal hosLongitude) {
        this.hosLongitude = hosLongitude;
    }

    public BigDecimal getHosLatitude() {
        return hosLatitude;
    }

    public void setHosLatitude(BigDecimal hosLatitude) {
        this.hosLatitude = hosLatitude;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}