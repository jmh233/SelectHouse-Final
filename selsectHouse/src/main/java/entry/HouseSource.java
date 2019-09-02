package entry;

import java.sql.Date;

/**
 * 房源信息实体类
 * 
 * @author liuting
 *
 */
public class HouseSource {
	private int EATATE_ID; // 楼盘ID
	private String EATATE_NAME;// 楼盘名称
	private String ENTERPRISE_NAME;// 开发企业
	private String PHONE;// 电话
	private String BUILDING_NO;// 预（现）售楼栋号
	private Date RECEIVE_METERIAL_START_TIME;// 现场接受资料开始时间
	private Date PURPOSE_REGISTER_START_TIME;// 意向登记开始时间
	private Date PURPOSE_REGISTER_END_TIME;// 意向登记结束时间
	private int IDENTIFICATION_ID; // 预（现）售证号
	private String RECEIVE_METERIAL_ADDRESS;// 现场接受资料地点
	private Date LOTIERY_TIME;// 摇号时间
	private Date SELECT_HOUSE_TIME;// 选房开始时间
	private String INFO_DESCRIPTION;// 销售公告内容
	private Date RECEIVE_METERIAL_END_TIME;// 现场接受资料结束时间
	private int HOUSE_AMOUNT;// 套房数量

	public int getEATATE_ID() {
		return EATATE_ID;
	}

	public void setEATATE_ID(int eATATE_ID) {
		EATATE_ID = eATATE_ID;
	}

	public String getEATATE_NAME() {
		return EATATE_NAME;
	}

	public void setEATATE_NAME(String eATATE_NAME) {
		EATATE_NAME = eATATE_NAME;
	}

	public String getENTERPRISE_NAME() {
		return ENTERPRISE_NAME;
	}

	public void setENTERPRISE_NAME(String eNTERPRISE_NAME) {
		ENTERPRISE_NAME = eNTERPRISE_NAME;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}

	public String getBUILDING_NO() {
		return BUILDING_NO;
	}

	public void setBUILDING_NO(String bUILDING_NO) {
		BUILDING_NO = bUILDING_NO;
	}

	public Date getRECEIVE_METERIAL_START_TIME() {
		return RECEIVE_METERIAL_START_TIME;
	}

	public void setRECEIVE_METERIAL_START_TIME(Date rECEIVE_METERIAL_START_TIME) {
		RECEIVE_METERIAL_START_TIME = rECEIVE_METERIAL_START_TIME;
	}

	public Date getPURPOSE_REGISTER_START_TIME() {
		return PURPOSE_REGISTER_START_TIME;
	}

	public void setPURPOSE_REGISTER_START_TIME(Date pURPOSE_REGISTER_START_TIME) {
		PURPOSE_REGISTER_START_TIME = pURPOSE_REGISTER_START_TIME;
	}

	public Date getPURPOSE_REGISTER_END_TIME() {
		return PURPOSE_REGISTER_END_TIME;
	}

	public void setPURPOSE_REGISTER_END_TIME(Date pURPOSE_REGISTER_END_TIME) {
		PURPOSE_REGISTER_END_TIME = pURPOSE_REGISTER_END_TIME;
	}

	public int getIDENTIFICATION_ID() {
		return IDENTIFICATION_ID;
	}

	public void setIDENTIFICATION_ID(int iDENTIFICATION_ID) {
		IDENTIFICATION_ID = iDENTIFICATION_ID;
	}

	public String getRECEIVE_METERIAL_ADDRESS() {
		return RECEIVE_METERIAL_ADDRESS;
	}

	public void setRECEIVE_METERIAL_ADDRESS(String rECEIVE_METERIAL_ADDRESS) {
		RECEIVE_METERIAL_ADDRESS = rECEIVE_METERIAL_ADDRESS;
	}

	public Date getLOTIERY_TIME() {
		return LOTIERY_TIME;
	}

	public void setLOTIERY_TIME(Date lOTIERY_TIME) {
		LOTIERY_TIME = lOTIERY_TIME;
	}

	public Date getSELECT_HOUSE_TIME() {
		return SELECT_HOUSE_TIME;
	}

	public void setSELECT_HOUSE_TIME(Date sELECT_HOUSE_TIME) {
		SELECT_HOUSE_TIME = sELECT_HOUSE_TIME;
	}

	public String getINFO_DESCRIPTION() {
		return INFO_DESCRIPTION;
	}

	public void setINFO_DESCRIPTION(String iNFO_DESCRIPTION) {
		INFO_DESCRIPTION = iNFO_DESCRIPTION;
	}

	public Date getRECEIVE_METERIAL_END_TIME() {
		return RECEIVE_METERIAL_END_TIME;
	}

	public void setRECEIVE_METERIAL_END_TIME(Date rECEIVE_METERIAL_END_TIME) {
		RECEIVE_METERIAL_END_TIME = rECEIVE_METERIAL_END_TIME;
	}

	public int getHOUSE_AMOUNT() {
		return HOUSE_AMOUNT;
	}

	public void setHOUSE_AMOUNT(int hOUSE_AMOUNT) {
		HOUSE_AMOUNT = hOUSE_AMOUNT;
	}

	public HouseSource(int eATATE_ID, String eATATE_NAME, String eNTERPRISE_NAME, String pHONE, String bUILDING_NO,
			Date rECEIVE_METERIAL_START_TIME, Date pURPOSE_REGISTER_START_TIME, Date pURPOSE_REGISTER_END_TIME,
			int iDENTIFICATION_ID, String rECEIVE_METERIAL_ADDRESS, Date lOTIERY_TIME, Date sELECT_HOUSE_TIME,
			String iNFO_DESCRIPTION, Date rECEIVE_METERIAL_END_TIME, int hOUSE_AMOUNT) {
		super();
		EATATE_ID = eATATE_ID;
		EATATE_NAME = eATATE_NAME;
		ENTERPRISE_NAME = eNTERPRISE_NAME;
		PHONE = pHONE;
		BUILDING_NO = bUILDING_NO;
		RECEIVE_METERIAL_START_TIME = rECEIVE_METERIAL_START_TIME;
		PURPOSE_REGISTER_START_TIME = pURPOSE_REGISTER_START_TIME;
		PURPOSE_REGISTER_END_TIME = pURPOSE_REGISTER_END_TIME;
		IDENTIFICATION_ID = iDENTIFICATION_ID;
		RECEIVE_METERIAL_ADDRESS = rECEIVE_METERIAL_ADDRESS;
		LOTIERY_TIME = lOTIERY_TIME;
		SELECT_HOUSE_TIME = sELECT_HOUSE_TIME;
		INFO_DESCRIPTION = iNFO_DESCRIPTION;
		RECEIVE_METERIAL_END_TIME = rECEIVE_METERIAL_END_TIME;
		HOUSE_AMOUNT = hOUSE_AMOUNT;
	}

	public HouseSource() {
		super();
	}

	@Override
	public String toString() {
		return "HouseSource [EATATE_ID=" + EATATE_ID + ", EATATE_NAME=" + EATATE_NAME + ", ENTERPRISE_NAME="
				+ ENTERPRISE_NAME + ", PHONE=" + PHONE + ", BUILDING_NO=" + BUILDING_NO
				+ ", RECEIVE_METERIAL_START_TIME=" + RECEIVE_METERIAL_START_TIME + ", PURPOSE_REGISTER_START_TIME="
				+ PURPOSE_REGISTER_START_TIME + ", PURPOSE_REGISTER_END_TIME=" + PURPOSE_REGISTER_END_TIME
				+ ", IDENTIFICATION_ID=" + IDENTIFICATION_ID + ", RECEIVE_METERIAL_ADDRESS=" + RECEIVE_METERIAL_ADDRESS
				+ ", LOTIERY_TIME=" + LOTIERY_TIME + ", SELECT_HOUSE_TIME=" + SELECT_HOUSE_TIME + ", INFO_DESCRIPTION="
				+ INFO_DESCRIPTION + ", RECEIVE_METERIAL_END_TIME=" + RECEIVE_METERIAL_END_TIME + ", HOUSE_AMOUNT="
				+ HOUSE_AMOUNT + "]";
	}
}
