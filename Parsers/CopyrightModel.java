
class CopyrightModel {

	public String holder_url;
	public String holder;
	public int year;
	public String logo;
	public String licence_url;
	public String licence;

	public CopyrightModel(String holder_url, String holder, int year, String logo, String licence_url, String licence) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.year = year;
		this.logo = logo;
		this.licence_url = licence_url;
		this.licence = licence;

	}

}