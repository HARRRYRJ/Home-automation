
class CopyrightModel {

	public String holder_url;
	public String holder;
	public String logo;
	public String licence_url;
	public int year;
	public String licence;

	public CopyrightModel(String holder_url, String holder, String logo, String licence_url, int year, String licence) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.logo = logo;
		this.licence_url = licence_url;
		this.year = year;
		this.licence = licence;

	}

}