package hospital;

public abstract class Treatment {
	protected int treatId, docId, patId;
	
	public void setTreatId(int treatID){
		this.treatId = treatID;
	}
	public int getTreatId() {
		return treatId;
	}
	public void setDocId(int docId){
		this.docId = docId;
	}
	public int getDocID(){
		return docId;
	}
	public void setPatId(int patId){
		this.patId = patId;
	}
	public int getPatId(){
		return patId;
	}
	public abstract String treat();
}
