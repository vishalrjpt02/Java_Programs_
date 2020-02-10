/************************************************************************************
 * @author	 Vishal kumar
 * @Version	 1.0
 * @purpose	 to implement the model interface for the entitty class called MindtreeMindtree minds
 * @file	 Employee.java
 * @date 	 27/01/2020
 ************************************************************************************/
package taskAssignBy_Sumodip;

public class MindTreeMinds {
	
	
	String MindName;
	int MindId;
	String MindDep;
	
	MindTreeMinds()
	{
		this.MindName="user001";
		this.MindId=000;
		this.MindDep="c1";
	}
	
	/**
	 * @param mindName
	 * @param mindId
	 * @param mindDep
	 */
	public MindTreeMinds(String mindName, int mindId, String mindDep) {
		super();
		MindName = mindName;
		MindId = mindId;
		MindDep = mindDep;
	}

	public String getMindName() {
		return MindName;
	}
	public void setMindName(String mindName) {
		MindName = mindName;
	}
	public int getMindId() {
		return MindId;
	}
	public void setMindId(int mindId) {
		MindId = mindId;
	}
	public String getMindDep() {
		return MindDep;
	}
	public void setMindDep(String mindDep) {
		MindDep = mindDep;
	}
	
	@Override
	public String toString() {
		return "MindTreeMinds [MindName=" + MindName + ", MindId=" + MindId + ", MindDep=" + MindDep + "]";
	}
}
