
class CopyrightModel {

	public String holder_url;
	public String holder;
	public String logo;
	public String licence;
	public String licence_url;
	public int year;

	public CopyrightModel(String holder_url, String holder, String logo, String licence, String licence_url, int year) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.logo = logo;
		this.licence = licence;
		this.licence_url = licence_url;
		this.year = year;

	}

}