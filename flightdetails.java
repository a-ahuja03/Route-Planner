package routePlanner4;

public class flightdetails {
	String[] from;
	String[] to;
	String[] Distance_in_Km;
	String[] Travel_Time;
	String[] Typical_Airfare;
	String[] routesinfo;
	public flightdetails() {
		
		this.from = from;
		this.to = to;
		this.Distance_in_Km = Distance_in_Km;
		this.Travel_Time = Travel_Time;
		this.Typical_Airfare = Typical_Airfare;
		this.routesinfo=routesinfo;
	}
	@Override
	public String toString() {
		return "flightdetails [from=" + from + ", to=" + to + ", Distance_in_Km=" + Distance_in_Km + ", Travel_Time="
				+ Travel_Time + ", Typical_Airfare=" + Typical_Airfare + "]";
	}
	public String[] getFrom() {
		return from;
	}
	
	public String[] getTo() {
		return to;
	}
	public void setTo(String[] to) {
		this.to = to;
	}
	public String[] getDistance_in_Km() {
		return Distance_in_Km;
	}
	public void setDistance_in_Km(String[] distance_in_Km) {
		Distance_in_Km = distance_in_Km;
	}
	public String[] getTravel_Time() {
		return Travel_Time;
	}
	public void setTravel_Time(String[] travel_Time) {
		Travel_Time = travel_Time;
	}
	public String[] getTypical_Airfare() {
		return Typical_Airfare;
	}
	public void setTypical_Airfare(String[] typical_Airfare) {
		Typical_Airfare = typical_Airfare;
	}
	

	

}
