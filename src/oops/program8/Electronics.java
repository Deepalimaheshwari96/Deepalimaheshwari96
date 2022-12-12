package oops.program8;

public class Electronics {

	String id = "eId";
	String semiconductorType = "Silicon";
	String dateOfManufacturing = "23/09/2022";

	public Electronics() {
		super();
	}

	@Override
	public String toString() {
		return "Electronics [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}

}
